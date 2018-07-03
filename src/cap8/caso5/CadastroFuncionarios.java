package cap8.caso5;

import cap8.caso5.geral.Endereco;

public class CadastroFuncionarios {

	public static void main(String[] args) {
		
		Programador p = new Programador("Jorge", 22, "Av. Paulista", 326, "Centro", "11-3652-5854", 6000,"Java");
		Motorista m = new Motorista("Bino", 65, "Rua perdiz", 254, "Copacabana", "44-3252-8574", 2400, 1254, 47);
		Endereco endereco = new Endereco("Rua Embarcação", 90, "Pq das Grevileas");
		Secretaria s = new Secretaria("Beatriz", 25, endereco , "44-3205-5245", 1500.00, 4524, true);
		
		p.mostrarDados();
		m.mostrarDados();
		s.mostrarDados();
	}
}
