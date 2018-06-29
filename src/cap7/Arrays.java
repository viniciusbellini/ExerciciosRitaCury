package cap7;

public class Arrays {

	public static void main(String[] args) {

		int dezenas [] = new int[4];
		
		for (int i = 0; i < 4; i++){
			dezenas[i] = 10 + (i!= 0 ? dezenas[(i-1)] : 0);
			System.out.println(dezenas[i]);
		}

		
		double resultado = somar(new double[]{2,10,4,3});
		System.out.println(resultado);
		
	}

	private static double somar(double[] numeros) {
		double resultado = 0;
		for (double d : numeros){
			resultado += d;
		}
		
		return resultado;
	}

}
