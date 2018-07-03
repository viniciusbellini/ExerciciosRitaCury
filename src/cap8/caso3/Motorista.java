package cap8.caso3;

public class Motorista extends Funcionario{

	private int nrCnh;
	private int tempoExperiencia;
	
	public Motorista(String nome, int idade, String endereco, String telefone,
			double salario, int nrCnh, int tempoExperiencia) {
		super(nome, idade, endereco, telefone, salario);
		setNrCnh(nrCnh);
		setTempoExperiencia(tempoExperiencia);
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
	
	
}
