package Interface;

public interface ICordas {

	ICordas afinar();

	public default IInstrumentoMusical emitirSom() {
		System.out.println("As cordas podem variar de implementa��o!");
		return null;
	};

}
