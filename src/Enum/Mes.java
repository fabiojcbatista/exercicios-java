package Enum;

import java.util.HashMap;
import java.util.Map;

public class Mes {

	private static final Map<Integer, MesesDoAno> funcaoPorValor = new HashMap<>();
	public static void main(String[] args) {
		
		for (MesesDoAno mes : MesesDoAno.values()) {
			int numeroMes = mes.getValor();
			if (numeroMes < 9 && numeroMes % 2 != 0) {
				System.out.println(mes.toString() + " tem 31 dias");
			} else if (numeroMes == 2)
				System.out.println(mes.toString() + " tem 28 dias");
			else if (numeroMes > 7 && numeroMes % 2 == 0) {
				System.out.println(mes.toString() + " tem 31 dias");
			} else {
				System.out.println(mes.toString() + " tem 30 dias");
			}
		}
		
		System.out.println();
		System.out.println("Qual é  mês: "+passaNumeroRetornaMes(12));

	}
	
	public static MesesDoAno passaNumeroRetornaMes(int valor) {
		for(MesesDoAno mes: MesesDoAno.values()) {
    		funcaoPorValor.put(mes.getValor(), mes);
    	}
		return funcaoPorValor.get(valor);
	}

}
