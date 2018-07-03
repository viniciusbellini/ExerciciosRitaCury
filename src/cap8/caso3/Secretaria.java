package cap8.caso3;

public class Secretaria extends Funcionario{

	private int nrSrt;
	private boolean linguaInglesa;

	public Secretaria(String nome, int idade, String endereco, String telefone,
			double salario, int nrSrt, boolean linguaInglesa) {
		super(nome, idade, endereco, telefone, salario);
		setNrSrt(nrSrt);
		setLinguaInglesa(linguaInglesa);
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
	
	
}
