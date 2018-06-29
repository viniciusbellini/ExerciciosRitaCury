package cap7;

public class UsandoVarargs {

	public static void main(String[] args) {
		
		System.out.println("Resultado: " + somar(2,3,5,6,7));
	}

	private static int somar(int...inteiros) {
		int resultado = 0;
		for (int i = 0; i<inteiros.length; i++){
			resultado += inteiros[i];
		}
		
		return resultado;
	}
}
