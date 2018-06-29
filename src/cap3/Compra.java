package cap3;

import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {

		Scanner v = new Scanner(System.in);
		double valorCompra;
	    
		System.out.println("Digite o valor da compra: ");
	    valorCompra = v.nextDouble();
		
		System.out.println(valorAPagar(valorCompra));
	}

	public static String valorAPagar(double valorCompra) {
		double retorno = valorCompra;
		
		if (valorCompra > 1000 && valorCompra <= 3000){
			retorno = valorCompra * 0.95;
		}else if (valorCompra > 3000){
			retorno = valorCompra * 0.90;
		}
		
		return "Valor a pagar: " + retorno;
	}

}
