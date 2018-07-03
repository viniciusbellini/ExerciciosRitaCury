package cap8.caso3;

public class Programador extends Funcionario{

	private String linguagem;

	public Programador(String nome, int idade, String endereco, String telefone,
			double salario, String linguagem) {
		super(nome, idade, endereco, telefone, salario);
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

	public void setDados(String nome, int idade, String endereco,
			String telefone, double salario, String linguagem) {
		super.setDados(nome, idade, endereco, telefone, salario);
		setLinguagem(linguagem);
	}

	public void reajustarSalario(){
		setSalario(getSalario()+300);
	}
}
