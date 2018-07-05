package cap9.exercicios;

public class Redes extends Curso implements Vendavel{

	String sistemaOperacionalString;
	
	public Redes(String nomeTreinamento, int cargaHoraria) {
		super(nomeTreinamento, cargaHoraria);
	}

	@Override
	public double getPreco(int modalidade) {
		
		if (modalidade == 1)
			return 620;
		else return 1190;
		
	}

	public String getSistemaOperacionalString() {
		return sistemaOperacionalString;
	}

	public void setSistemaOperacionalString(String sistemaOperacionalString) {
		this.sistemaOperacionalString = sistemaOperacionalString;
	}

}
