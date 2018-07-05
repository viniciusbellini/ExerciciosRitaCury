package cap11.funcionarios;

public class Motorista extends Funcionario{



	private int nrCnh;
	private int tempoExperiencia;
	
	public Motorista(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	public Motorista(String nome, int idade, double salario, int nfCnh) {
		super(nome, idade, salario);
		setNrCnh(nfCnh);
	}
	
	public void dirigir(){
		System.out.println("Dirigindo ...");
	}

	public int getNrCnh() {
		return nrCnh;
	}

	public void setNrCnh(int nrCnh) {
		this.nrCnh = nrCnh;
	}

	public int getTempoExperiencia() {
		return tempoExperiencia;
	}

	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	
	@Override
	public String toString() {
		return "Motorista: "+ getNome();
	}
}
