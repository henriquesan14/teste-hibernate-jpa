package br.com.henrique;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EventoController {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateteste");
	 
    EntityManager em = entityManagerFactory.createEntityManager();
	
	public void salvar(Evento evento) {
		em.getTransaction().begin();
		em.persist(evento);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Evento evento) {
		em.getTransaction().begin();
		Query q=em.createNativeQuery("DELETE evento FROM evento WHERE id="+evento.getId());
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}
}
