package cap7;

public class ArrayNumeros {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++){
			numeros[i] = i+1;
			System.out.println(numeros[i]);
		}

	}

}
