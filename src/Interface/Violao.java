package Interface;

public class Violao implements ICordas, IInstrumentoMusical {
	@Override
	public IInstrumentoMusical emitirSom() {
		System.out.println("A maneira mais fácil de tocar melodias no violão é através de tablaturas.");
		return null;
	};
	@Override
	public ICordas afinar() {
		System.out.println("A primeira corda é a Mi (E);\r\n"
				+ "A segunda corda é a Si (B);\r\n"
				+ "A terceira corda é a Sol (G);\r\n"
				+ "A quarta corda é a Ré (D);\r\n"
				+ "A quinta corda é a Lá (A);\r\n"
				+ "A sexta corda é a Mi (E).");
		return null;
	};
}
