package Interface;

public class Piano implements IInstrumentoMusical {
	@Override
	public IInstrumentoMusical emitirSom() {
		System.out.println("Usa o teclado do teu computador ou clica nas teclas do piano para o tocares. A fila superior de letras no teu teclado corresponde às teclas brancas, e a fila de números corresponde às teclas pretas. Podes tocar várias notas ao mesmo tempo.");
		return null;
	};
}
