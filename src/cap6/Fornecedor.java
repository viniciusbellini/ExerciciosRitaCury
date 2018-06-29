package cap6;

public class Fornecedor {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String tipoProduto;
	
	public Fornecedor(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public Fornecedor(String nome, String telefone, String tipoProduto) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.tipoProduto = tipoProduto;
	}

	public Fornecedor(String nome, String telefone, String endereco,
			String tipoProduto) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.tipoProduto = tipoProduto;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	public void mostrarDados(){
		String dados = "Nome: " + getNome() + 
						"\nTelefone: " + getTelefone() +
				"\nEndereco: " + getEndereco() +
				"\nTipo Produto: " + getTipoProduto() +
				"\n--------------------------";
		System.out.println(dados);
	}
	
}
