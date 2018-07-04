package cap9.exercicios;

public class Curso {
	
	private String nomeTreinamento;
	private int cargaHoraria;

	public Curso(String nomeTreinamento, int cargaHoraria) {
		setNomeTreinamento(nomeTreinamento);
		setCargaHoraria(cargaHoraria);
	}

	public String getNomeTreinamento() {
		return nomeTreinamento;
	}

	public void setNomeTreinamento(String nomeTreinamento) {
		this.nomeTreinamento = nomeTreinamento;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
