package cap11.funcionarios;

public class Funcionario {

	private String nome;
	private int idade;
	private boolean estadoCivil;
	private String endereco;
	private String telefone;
	private double salario;
	
	public Funcionario(String nome, int idade, double salario){
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
	}
	
	public void reajustarSalario(){
		setSalario(getSalario() + 100);
	}
	
	public void mostrarDados(){
		String dados = "";
		dados = "-----------------------------"+
				"\nNome: " + getNome()+
				"\nIdade: "+getIdade()+
				"\nEstado Civil: "+isEstadoCivil()+
				"\nEndereço: "+getEndereco()+
				"\nTelefone: "+getTelefone()+
				"\nSalário: "+getSalario();
		System.out.println(dados);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDados(String nome, int idade, String endereco, String telefone,
			double salario) {

		setNome(nome);
		setIdade(idade);
		setEndereco(endereco);
		setTelefone(telefone);
		setSalario(salario);
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome();
	}
}
