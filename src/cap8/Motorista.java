package cap8;

public class Motorista extends Funcionario{

	private int nrCnh;
	private int tempoExperiencia;
	
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
