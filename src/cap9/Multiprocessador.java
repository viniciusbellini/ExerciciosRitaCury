package cap9;

public class Multiprocessador implements Aparelho {

	@Override
	public void ligar() {
		System.out.println("Ligando o multiprocessador...");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando o multiprocessador...");

	}

	public void processar(){
		System.out.println(".....Processando com o multiprocessador...");
	}
}
