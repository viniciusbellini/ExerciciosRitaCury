package cap5;

public class Vendedor {
	
	private static double premioEquipe = 100;
	private double premioIndividual = 200;
	private String nome;
	
	public double getPremioEquipe() {
		return premioEquipe;
	}
	public void setPremioEquipe(double premioEquipe) {
		this.premioEquipe = premioEquipe;
	}
	public double getPremioIndividual() {
		return premioIndividual;
	}
	public void setPremioIndividual(double premioIndividual) {
		this.premioIndividual = premioIndividual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void mostrarDados(){
		String dados = "Nome: " + getNome() + 
						"\nPremio individual: " + getPremioIndividual() +
				"\nPremio equipe: " + getPremioEquipe() +
				"\n--------------------------";
		System.out.println(dados);
	}
}
