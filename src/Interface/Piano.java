package Interface;

public class Piano implements IInstrumentoMusical {
	@Override
	public IInstrumentoMusical emitirSom() {
		System.out.println("Usa o teclado do teu computador ou clica nas teclas do piano para o tocares. A fila superior de letras no teu teclado corresponde �s teclas brancas, e a fila de n�meros corresponde �s teclas pretas. Podes tocar v�rias notas ao mesmo tempo.");
		return null;
	};
}
