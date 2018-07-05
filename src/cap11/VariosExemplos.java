package cap11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class VariosExemplos {

	public static void main(String[] args) {

		//TreeSet garante que a ordem dos elementos seja ascendente, tomando 
		//por base sua ordem natural - nao pernite duplicacoes
		
		System.out.println("--Com TreeSet ----------------------------------------");
		
		Set<String> cursos = new TreeSet<>();
		
		cursos.add("PHP");
		cursos.add("PHP");
		cursos.add("LINUX");
		cursos.add("ASP");
		cursos.add("JAVA");
		cursos.add("DELPHI");
		
		for (String curso : cursos) {
			System.out.println("Curso: "+ curso);
		}
		
		System.out.println(cursos);
		
		//////////////////////////////////////////////////////////////////////////
		//HashSet é um conjunto não ordenado e nao classificado, que nao
		//permite dubplicacoes entre seus elementos
		
		System.out.println("--\nCom HashSet ----------------------------------------");
		
		Set<String> cursos3 = new HashSet<>();
		
		cursos3.add("PHP");
		cursos3.add("PHP");
		cursos3.add("LINUX");
		cursos3.add("ASP");
		cursos3.add("JAVA");
		cursos3.add("DELPHI");
		
		for (String curso : cursos3) {
			System.out.println("Curso: "+ curso);
		}
		
		System.out.println(cursos3);
		
		//////////////////////////////////////////////////////////////////////////
		
		System.out.println("--\nCom ArrayList ----------------------------------------");
		
		List<String> cursos2 = new ArrayList<>();
		
		cursos2.add("PHP");
		cursos2.add("PHP");
		cursos2.add("LINUX");
		cursos2.add("ASP");
		cursos2.add("JAVA");
		cursos2.add("DELPHI");
		
		for (String curso : cursos2) {
		System.out.println("Curso: "+ curso);
		}
		
		System.out.println(cursos2);
		
		//////////////////////////////////////////////////////////////////////////
		//HashMap não é ordenada nem classificada. É rapida na busca/insercao de dados
		//permite duplicacoes
		
		System.out.println("--\nCom HashSet ----------------------------------------");
		
		Map<String, String> cursos4 = new HashMap<>();
		
		cursos4.put("a","PHP");
		cursos4.put("b","PHP");
		cursos4.put("c","LINUX");
		cursos4.put("d","ASP");
		cursos4.put("e","JAVA");
		cursos4.put("f","DELPHI");
		
		for (String curso : cursos4.values()) {
		System.out.println("Curso: "+ curso);
		}
		
		System.out.println(cursos4);
	}

}
