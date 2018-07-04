package cap9;

import java.util.ArrayList;
import java.util.List;

public class UsaAparelho {

	public static void main(String[] args) {
		
		Aparelho mr = new MaquinaLavarRoupa();
		mr.ligar();
		((MaquinaLavarRoupa)mr).centrifugar();
		mr.acionarTimer(10);

		Aparelho mp = new Multiprocessador();
		mp.ligar();
		((Multiprocessador)mp).processar();
		mp.acionarTimer(12);
		
		Aparelho telefone = new Telefone();
		telefone.ligar();
		((Telefone)telefone).discar();
		telefone.acionarTimer(5);
		
		Aparelho tv = new Televisao();
		tv.ligar();
		((Televisao)tv).configurarCanais();
		tv.acionarTimer(120);
		
		List<Aparelho> lista = new ArrayList<>();
		
		lista.add(mr);
		lista.add(mp);
		lista.add(telefone);
		lista.add(tv);
		
		for (Aparelho a : lista){
			a.desligar();
		}
		
		Aparelho.desligarTudo(lista);
	}

}
