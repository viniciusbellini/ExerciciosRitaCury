package cap9;

import java.util.List;

public interface Aparelho {
	void ligar();
	void desligar();
	
	default void acionarTimer(int tempo){
		System.out.println("Tempo acionado: " + tempo + "minutos.\n");
		System.out.println("----------------------------------------\n");
	}
	
	static void desligarTudo(List<Aparelho> lista){
		System.out.println("\n(Desligando todos aparelhos)....");
		for (Aparelho aparelho : lista){
			aparelho.desligar();
		}
	}
}
