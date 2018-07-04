package cap9.exercicios;

public class Redes extends Curso implements Vendavel{

	String sistemaOperacionalString;
	
	public Redes(String nomeTreinamento, int cargaHoraria) {
		super(nomeTreinamento, cargaHoraria);
	}

	@Override
	public void getPreco(int modalidade) {
		
		if (modalidade == 1){
			System.out.println("R$ 620,00");
		}else if (modalidade == 2){
			System.out.println("R$ 1.190,00");
		}
		
	}

	public String getSistemaOperacionalString() {
		return sistemaOperacionalString;
	}

	public void setSistemaOperacionalString(String sistemaOperacionalString) {
		this.sistemaOperacionalString = sistemaOperacionalString;
	}

}
