package cap5;

public class UsandoSobrecargaMetodos {

	public static void main(String[] args) {
		SobrecargaMetodos dado = new SobrecargaMetodos();
		
		dado.exibirInformacao("Pedro");
		dado.exibirInformacao(17);
		dado.exibirInformacao(false);
	}
}
