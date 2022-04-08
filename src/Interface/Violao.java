package Interface;

public class Violao implements ICordas, IInstrumentoMusical {
	@Override
	public IInstrumentoMusical emitirSom() {
		System.out.println("A maneira mais f�cil de tocar melodias no viol�o � atrav�s de tablaturas.");
		return null;
	};
	@Override
	public ICordas afinar() {
		System.out.println("A primeira corda � a Mi (E);\r\n"
				+ "A segunda corda � a Si (B);\r\n"
				+ "A terceira corda � a Sol (G);\r\n"
				+ "A quarta corda � a R� (D);\r\n"
				+ "A quinta corda � a L� (A);\r\n"
				+ "A sexta corda � a Mi (E).");
		return null;
	};
}
