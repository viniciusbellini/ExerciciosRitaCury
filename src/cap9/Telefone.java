package cap9;

public class Telefone implements Aparelho {

	@Override
	public void ligar() {
		System.out.println("Ligando o telefone...");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando o telefone...");

	}

	public void chamando(){
		System.out.println(".....Fazendo chamada com o telefone...");
	}
	
	public void discar(){
		System.out.println(".....Discando com o telefone...");
	}
	
	public void gravarMensage(){
		System.out.println(".....Gravando mensagem...");
	}
}
