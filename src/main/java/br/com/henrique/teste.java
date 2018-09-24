package br.com.henrique;

public class teste {

	public static void main(String[] args) {
		Evento e=new Evento();
		e.setDescr("chatuba");
		e.setNome("juvenal");
		EventoController con=new EventoController();
		con.salvar(e);
		
		
	}

}
