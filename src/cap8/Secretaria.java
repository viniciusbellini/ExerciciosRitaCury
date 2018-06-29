package cap8;

public class Secretaria extends Funcionario{

	private int nrSrt;
	private boolean linguaInglesa;
	
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
