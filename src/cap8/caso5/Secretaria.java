package cap8.caso5;

import cap8.caso5.geral.Endereco;
import cap8.caso5.geral.Funcionario;

public class Secretaria extends Funcionario{

	private int nrSrt;
	private boolean linguaInglesa;

	public Secretaria(String nome, int idade, Endereco endereco, String telefone,
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

	@Override
	public void reajustarSalario() {
		setSalario(getSalario()+400);
	}
	
	
}
