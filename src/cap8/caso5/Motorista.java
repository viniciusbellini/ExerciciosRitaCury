package cap8.caso5;

import cap8.caso5.geral.Endereco;
import cap8.caso5.geral.Funcionario;

public class Motorista extends Funcionario{

	private int nrCnh;
	private int tempoExperiencia;
	
	public Motorista(String nome, int idade, String logradouro, int numero, String bairro, String telefone,
			double salario, int nrCnh, int tempoExperiencia) {
		super(nome, idade, new Endereco(logradouro,numero,bairro), telefone, salario);
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

	@Override
	public void reajustarSalario() {
		setSalario(getSalario()+200);
		
	}
	
	
}
