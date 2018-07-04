package cap9;

public class MaquinaLavarRoupa implements Aparelho{

	@Override
	public void ligar() {
		System.out.println("Ligando maquina de lavar roupas...");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando maquina de lavar roupas...");
	}
	
	public void enxaguar(){
		System.out.println(".....Enxaguando roupas...");
	}

	public void centrifugar() {
		System.out.println(".....Maquina de lavar centrifugando...");

	}
}
