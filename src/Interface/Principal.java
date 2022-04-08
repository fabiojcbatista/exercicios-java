package Interface;

public class Principal {

	public static void main(String[] args) {

		Piano piano = new Piano();
		Violao violao = new Violao();
		Ukulele ukulele = new Ukulele();

		piano.emitirSom();

		ukulele.afinar();
		ukulele.emitirSom();

		violao.afinar();
		violao.emitirSom();

	}

}
