package cap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaDeFrutas {
	
	public static final String[] FRUTAS = {"morango", "maça", "uva", "banana", "pêra", "goiaba", "amora"};
	
	public static final String[] FRUTAS2 = {"abacaxi", "limão", "graviola", "banana", "mamão", "goiaba"};

	public static void main(String[] args) {
	
		List<String> listaFrutas = new ArrayList<>(Arrays.asList(FRUTAS));
		imprimirLista(listaFrutas);
		converterParaMaiusculas(listaFrutas);
		
		List<String> listaFrutas2 = new ArrayList<>(Arrays.asList(FRUTAS2));
		imprimirLista(listaFrutas2);
		converterParaMaiusculas(listaFrutas2);
		
		listaFrutas.addAll(listaFrutas2);
		imprimirLista(listaFrutas);
	}
	

	public static void imprimirLista(List<String> lista) {
		for (String fruta : lista) 
			System.out.print(fruta + " ");
		System.out.println("Total " + lista.size() + " frutas.");
	}
	
	public static void converterParaMaiusculas(List<String> lista){
		for (String fruta : lista) {
			System.out.print(fruta.toUpperCase());
		}
	}
}
