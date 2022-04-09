package Collection.ArrayList;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Agenda> agendaContatos = new ArrayList<Agenda>();

	public static void main(String[] args) {

		Agenda conta1 = new Agenda("Fabio Junior", "51994622192");
		Agenda conta2 = new Agenda("Luiz Fernando", "51994523454");
		Agenda conta3 = new Agenda("Ana Caroline", "51994424554");
		Agenda conta4 = new Agenda("Natiele", "51994566567");
		Agenda conta5 = new Agenda("Thais", "51992344335");
		Agenda conta6 = new Agenda("Thais", "51992344335");

		System.out.println((adicionar(conta1)) ? "adicionado!" : "Já existe o contato "+ conta1.getContato());
		System.out.println((adicionar(conta2)) ? "adicionado!" : "Já existe o contato "+ conta2.getContato());
		System.out.println((adicionar(conta3)) ? "adicionado!" : "Já existe o contato "+ conta3.getContato());
		System.out.println((adicionar(conta4)) ? "adicionado!" : "Já existe o contato "+ conta4.getContato());
		System.out.println((adicionar(conta5)) ? "adicionado!" : "Já existe o contato "+ conta5.getContato());
		System.out.println((adicionar(conta5)) ? "adicionado!" : "Já existe o contato "+ conta5.getContato());

		System.out.println();

		for (Agenda agenda : agendaContatos) {
			System.out.println("Contato: " + agenda.getContato() + ", Telefone: " + agenda.getTelefone());
		}

		System.out.println();

		System.out.println((deletar(conta1)) ? "deletado!" : "Não foi possível encontrar "+ conta1.getContato());
		System.out.println((deletar(conta2)) ? "deletado!" : "Não foi possível encontrar "+ conta2.getContato());
		System.out.println((deletar(conta3)) ? "deletado!" : "Não foi possível encontrar "+ conta3.getContato());
		System.out.println((deletar(conta4)) ? "deletado!" : "Não foi possível encontrar "+ conta4.getContato());
		System.out.println((deletar(conta5)) ? "deletado!" : "Não foi possível encontrar "+ conta5.getContato());
		System.out.println((deletar(conta6)) ? "deletado!" : "Não foi possível encontrar "+ conta6.getContato());

		System.out.println();

		for (Agenda agenda : agendaContatos) {
			System.out.println("Contato: " + agenda.getContato() + ", Telefone: " + agenda.getTelefone());
		}
	}

	public static boolean adicionar(Agenda agenda) {
		if (agendaContatos.contains(agenda))
			return false;
		return agendaContatos.add(agenda);
	}

	public static boolean deletar(Agenda agenda) {
		return agendaContatos.remove(agenda);
	}

}
