package cap5;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private boolean estadoCivil;
	
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}


	public String getNome() {
		return nome;
		
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public boolean isEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public void mostrarDados() {
		String dados = "Nome: "+ getNome() +
				"\nIdade: "+ getIdade() +
				"\nSexo: " + getSexo();
		System.out.println(dados);
	}


	public void setDados(String nome, int idade, char sexo) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		
	}
	
	
}
