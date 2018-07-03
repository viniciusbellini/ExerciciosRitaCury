package cap8.caso5;

import cap8.caso5.geral.Endereco;
import cap8.caso5.geral.Funcionario;

public class Programador extends Funcionario{

	private String linguagem;

	public Programador(String nome, int idade, String logradouro, int numero, String bairro, String telefone,
			double salario, String linguagem) {
		super(nome, idade, new Endereco(logradouro,numero,bairro), telefone, salario);
		setLinguagem(linguagem);
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public void mostrarDados(){
		System.out.println("----------------------------------------");
		super.mostrarDados();
		System.out.println("Linguagem de programação: "+getLinguagem());
	}

	public void reajustarSalario(){
		setSalario(getSalario()+300);
	}
}
