package cap8.caso5.geral;

public class Endereco {
	String logradouro;
	int numero;
	String bairro;
	
	public Endereco(){}

	public Endereco(String logradouro, int numero, String bairro) {
		setLogradouro(logradouro);
		setNumero(numero);
		setBairro(bairro);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getDados(){
		return getLogradouro()+", "+getNumero()+" - "+ getBairro();
	}
	
	@Override
	public String toString() {
		return getLogradouro()+", "+getNumero()+" - "+ getBairro();
	}
}
