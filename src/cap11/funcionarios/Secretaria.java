package cap11.funcionarios;

public class Secretaria extends Funcionario{

	private int nrSrt;
	private boolean linguaInglesa;

	public Secretaria(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	public Secretaria(String nome, int idade, double salario, int nrSrt) {
		super(nome, idade, salario);
		setNrSrt(nrSrt);
	}

	public void atenterTelefone(){
		System.out.println("Atendendo telefone ...");
	}

	public int getNrSrt() {
		return nrSrt;
	}

	public void setNrSrt(int nrSrt) {
		this.nrSrt = nrSrt;
	}

	public boolean isLinguaInglesa() {
		return linguaInglesa;
	}

	public void setLinguaInglesa(boolean linguaInglesa) {
		this.linguaInglesa = linguaInglesa;
	}
	
	@Override
	public String toString() {
		return "Secretária: "+getNome();
	}
}
