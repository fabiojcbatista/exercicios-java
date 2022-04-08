package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("rawtypes")
public class Controlador {

	private static Map<Integer, String> mapa = new HashMap<>();

	public static void adicionarAoMapa(int idCabide, String modelo) {
		mapa.put(idCabide, modelo);
	};
	
	static int retornaCabidePorRoupa(String modelo) {
		for ( Map.Entry key : mapa.entrySet()) {
			if (key.getValue() == modelo) {
				return Integer.parseInt(key.getKey().toString());
			}
		}
		return -1;
	};

	public static void mostraCabidePorRoupa(String modelo) {
		for (Map.Entry key : mapa.entrySet()) {
			if (key.getValue() == modelo) {
				System.out.println("cabide: " + key.getKey());
			}
		}

	};

	static String retornaRoupaPorCabide(int idCabide) {
		return mapa.get(idCabide);
	};

	public static void liberaCabide(String modeloRoupa) {

		for (Map.Entry key : mapa.entrySet()) {
			if (key.getValue() == modeloRoupa) {
				System.out.println("removendo por modelo: " + mapa.get(key.getKey()));
				int chave = Integer.parseInt(key.getKey().toString());
				mapa.remove(chave);

			}
		}

	};

	public static void liberaCabide(int idCabide) {
		mapa.remove(idCabide);
	};

	public static void mostraMapa() {
		System.out.println(mapa.values());
	};
}
