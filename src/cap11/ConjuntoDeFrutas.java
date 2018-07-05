package cap11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeFrutas {
	public static final String[] FRUTAS = {"morango", "maça", "uva", "banana","pêra","goiaba","amora"};
	
	public static final String[] FRUTAS2 = {"abacaxi", "limão", "graviola", "banana", "mamão", "goiaba"};

	public static void main(String[] args) {
	
		Set<String> conjuntoFrutas = new HashSet<>(Arrays.asList(FRUTAS));
		imprimirConjunto(conjuntoFrutas);
		converterParaMaiusculas(conjuntoFrutas);
		
		Set<String> conjuntoFrutas2 = new HashSet<>(Arrays.asList(FRUTAS2));
		imprimirConjunto(conjuntoFrutas2);
		converterParaMaiusculas(conjuntoFrutas2);
		
		conjuntoFrutas.addAll(conjuntoFrutas2);
		imprimirConjunto(conjuntoFrutas);
	}
	

	public static void imprimirConjunto(Set<String> conjunto) {
		for (String fruta : conjunto)
			System.out.print(fruta + ", ");
		System.out.println("\nTotal " + conjunto.size() + " frutas.\n");
	}
	
	public static void converterParaMaiusculas(Set<String> conjunto){
		for (String fruta : conjunto) {
			System.out.print(fruta.toUpperCase() + ", ");
		}
	}
}
