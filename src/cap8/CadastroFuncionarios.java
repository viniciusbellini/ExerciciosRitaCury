package cap8;

public class CadastroFuncionarios {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setDados("José",18,"Rua Sergipe, 54","11-9985-8547",1800);
		f.mostrarDados();
		
		Programador p = new Programador();
		p.setDados("Jorge", 22, "Av. Paulista, 326", "11-3652-5854", 6000,"Java");
		p.mostrarDados();
		
	}
}
