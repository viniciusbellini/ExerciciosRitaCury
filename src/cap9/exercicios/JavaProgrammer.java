package cap9.exercicios;

public class JavaProgrammer extends Curso implements Vendavel{

	private String versaoDaLinguagem;
	
	public JavaProgrammer(String nomeTreinamento, int cargaHoraria) {
		super(nomeTreinamento, cargaHoraria);
	}

	@Override
	public double getPreco(int modalidade) {
		
		if (modalidade == 1)
			return 780;
		else 
			return 1320;
		
	}

	public String getVersaoDaLinguagem() {
		return versaoDaLinguagem;
	}

	public void setVersaoDaLinguagem(String versaoDaLinguagem) {
		this.versaoDaLinguagem = versaoDaLinguagem;
	}


	@Override
	public String toString() {
		return "Nome do Curso: "+getNomeTreinamento();
	}
}
