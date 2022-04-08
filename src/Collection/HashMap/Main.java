package Collection.HashMap;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		String[] modelos = { "Blusa de lã", "Moleton masculino", "Moleton feminino", "Calça Sued" };
		Controlador mapaControler = new Controlador();

		mapaControler.adicionarAoMapa(1, modelos[0]);
		mapaControler.adicionarAoMapa(2, modelos[1]);
		mapaControler.adicionarAoMapa(3, modelos[2]);
		mapaControler.adicionarAoMapa(4, modelos[3]);

		mapaControler.mostraMapa();
		System.out.println();
		
		System.out.println( mapaControler.retornaCabidePorRoupa("Blusa de lã"));
		System.out.println();
		
		mapaControler.mostraCabidePorRoupa("Blusa de lã");
		System.out.println();
		
		mapaControler.mostraMapa();
		System.out.println();
		
		System.out.println( mapaControler.retornaRoupaPorCabide(1));
		System.out.println();
		
		mapaControler.mostraMapa();
		System.out.println();
		
		mapaControler.liberaCabide(1);
		System.out.println();
		
		mapaControler.mostraMapa();
		System.out.println();
		
		Controlador.liberaCabide("Moleton masculino");
		System.out.println();
		
		mapaControler.mostraMapa();
		
	}

}
