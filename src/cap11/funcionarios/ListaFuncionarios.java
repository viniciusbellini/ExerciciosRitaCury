package cap11.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionarios {

	public static void main(String[] args) {
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		listaFuncionarios.add(new Secretaria("Maria", 25, 3500, 432));
		listaFuncionarios.add(new Secretaria("Bete", 29, 5870, 123));
		listaFuncionarios.add(new Motorista("Jarbas", 37, 6000, 667));
		listaFuncionarios.add(new Programador("João", 22, 4000, "PHP"));
		listaFuncionarios.add(new Programador("Ana", 27, 11250, "Java"));
		listaFuncionarios.add(new Programador("Heitor", 28, 9850, "Java"));
		
		for (Funcionario funcionario : listaFuncionarios) 
			System.out.println(funcionario.toString());
			
	}
}
