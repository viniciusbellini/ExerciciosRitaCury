package cap6;

public class UsaFornecedor {

	public static void main(String[] args) {

		Fornecedor f1 = new Fornecedor("Joao", "2320-1401");
		Fornecedor f2 = new Fornecedor("José", "1239-1230", "Laticinios");
		Fornecedor f3 = new Fornecedor("Carlos", "9983-2902", "Av das Torres", "Horti-fruti");
		
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
	}

}
