package cap9;

public class Televisao implements Eletrodomestico, Aparelho {

	@Override
	public void ligar() {
		System.out.println("Ligando a tv...");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando a tv...");

	}
	
	public void configurarCanais(){
		System.out.println(".....configurando canais...");
	}

}
