package cap5;

public class UsaPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Pedro");
		pessoa.setIdade(12);
		pessoa.setSexo('M');
		
		pessoa.mostrarDados();
		
		Pessoa p2 = new Pessoa();
		p2.setDados("Maria",18,'F');
		p2.mostrarDados();
		
	}
}
