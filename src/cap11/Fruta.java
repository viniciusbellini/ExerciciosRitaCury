package cap11;

public class Fruta {
	
	private String nome;
	private String vitaminas;
	private String beneficios;
	
	public Fruta (String nome, String vitaminas, String beneficios) {
		setNome(nome);
		setVitaminas(vitaminas);
		setBeneficios(beneficios);
	}
	
	public Fruta(String nome) {
		setNome(nome);
	}
	
	@Override
	public String toString() {
		return "Fruta [nomeDaFruta=" + getNome() + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVitaminas() {
		return vitaminas;
	}
	public void setVitaminas(String vitaminas) {
		this.vitaminas = vitaminas;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	
	
}
