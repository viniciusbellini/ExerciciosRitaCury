package cap5;

public class SobrecargaMetodos {

	public void exibirInformacao(String nome){
		System.out.println("O nome é: " + nome);
	}
	
	public void exibirInformacao(int idade){
		System.out.println("O nome é: " + idade);
	}
	
	public void exibirInformacao(boolean estadoCivil){
		
		if (estadoCivil == true){
			System.out.println("Casado");
		}else
			System.out.println("Solteiro");
	}
}
