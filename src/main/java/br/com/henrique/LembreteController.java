package br.com.henrique;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LembreteController {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateteste");
	 
    EntityManager em = entityManagerFactory.createEntityManager();
	
	public void salvar(Lembrete lembrete) {
		em.getTransaction().begin();
		em.persist(lembrete);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Lembrete lembrete) {
		em.getTransaction().begin();
		Query q=em.createNativeQuery("DELETE lembrete FROM lembrete WHERE id="+lembrete.getId());
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}
}
