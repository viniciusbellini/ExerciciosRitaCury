package cap11;

import java.util.List;

public class ListaDeFrutas {
	
	public final static String FRUTAS = {"morango","maça","uva","banana", "pera", "goiaba", "amora"};
	
	//public final static List<String> FRUTAS2 = {"abacaxi", "limão", "graviola", "banana", "mamão", "goiaba"};

	public static void imprimirLista(List<String> frutas2) {
		System.out.println(frutas2);
		System.out.println(frutas2.size());
	}
	
	public void main(String[] args) {
		imprimirLista(FRUTAS);
	}
}
