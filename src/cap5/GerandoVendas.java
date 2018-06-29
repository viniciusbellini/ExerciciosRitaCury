package cap5;

public class GerandoVendas {

	public static void main(String[] args) {
		
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		
		v1.setNome("Joao");
		v2.setNome("Maria");
		
		v1.mostrarDados();
		v2.mostrarDados();
	}
}
