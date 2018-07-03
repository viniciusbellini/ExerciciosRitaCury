package cap8.caso3;

public class CadastroFuncionarios {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("José",18,"Rua Sergipe, 54","11-9985-8547",1800);
		f.mostrarDados();
		
		Programador p = new Programador("Jorge", 22, "Av. Paulista, 326", "11-3652-5854", 6000,"Java");
		p.mostrarDados();
		
	}
}
