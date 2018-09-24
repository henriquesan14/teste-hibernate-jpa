package br.com.henrique;

public class teste {

	public static void main(String[] args) {
		Evento e=new Evento();
		e.setDescr("teste");
		e.setNome("teste");
		EventoController con=new EventoController();
		con.salvar(e);
		
		
	}

}
