package cap8;

public class Programador extends Funcionario{

	private String linguagem;

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Linguagem de programação: "+getLinguagem());
	}

	public void setDados(String nome, int idade, String endereco,
			String telefone, double salario, String linguagem) {
		super.setDados(nome, idade, endereco, telefone, salario);
		setLinguagem(linguagem);;
	}

	
}
