package cap11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ExemplosComNumeros {
	public static void main(String[] args) {

		//TreeSet garante que a ordem dos elementos seja ascendente, tomando 
		//por base sua ordem natural - nao pernite duplicacoes
		
		System.out.println("--Com TreeSet ----------------------------------------");
		
		Set<Integer> numeros = new TreeSet<>();
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(213);
		numeros.add(215);
		numeros.add(5);
		numeros.add(52);
		
		for (Integer numero : numeros) {
			System.out.println("Numero: "+ numero);
		}
		
		System.out.println(numeros);
		
		//////////////////////////////////////////////////////////////////////////
		//HashSet é um conjunto não ordenado e nao classificado, que nao
		//permite dubplicacoes entre seus elementos
		
		System.out.println("--\nCom HashSet ----------------------------------------");
		
		Set<Integer> numeros3 = new HashSet<>();
		
		numeros3.add(2);
		numeros3.add(2);
		numeros3.add(213);
		numeros3.add(215);
		numeros3.add(5);
		numeros3.add(52);
		
		for (Integer numero : numeros3) {
			System.out.println("Numero: "+ numero);
		}
		
		System.out.println(numeros3);
		
		//////////////////////////////////////////////////////////////////////////
		
		System.out.println("--\nCom ArrayList ----------------------------------------");
		
		List<Integer> numeros2 = new ArrayList<>();
		
		numeros2.add(2);
		numeros2.add(2);
		numeros2.add(213);
		numeros2.add(215);
		numeros2.add(5);
		numeros2.add(52);
		
		for (Integer numero : numeros2) {
		System.out.println("Numero: "+ numero);
		}
		
		System.out.println(numeros2);
		
		//////////////////////////////////////////////////////////////////////////
		//HashMap não é ordenada nem classificada. É rapida na busca/insercao de dados
		//permite duplicacoes
		
		System.out.println("--\nCom HashSet ----------------------------------------");
		
		Map<String, Integer> numeros4 = new HashMap<>();
		
		numeros4.put("a",2);
		numeros4.put("b",2);
		numeros4.put("c",213);
		numeros4.put("d",215);
		numeros4.put("e",5);
		numeros4.put("f",52);
		
		for (Integer numero : numeros4.values()) {
		System.out.println("Curso: "+ numero);
		}
		
		System.out.println(numeros4);
	}
}
