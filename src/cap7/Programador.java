package cap7;

public class Programador {

	String nome;
	String linguagem;
	double salario;
	
	public Programador(String nome, String linguagem, double salario) {
		super();
		this.nome = nome;
		this.linguagem = linguagem;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	public void mostrarDados(){
		String dados = "Nome: " + getNome() +
				"\nLinguagem que programa: " + getLinguagem() +
				"\nSalario: " + getSalario() +
				"\n------------------------------";
		System.out.println(dados);
	}
}
