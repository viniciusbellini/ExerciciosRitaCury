package cap11;

public class ExemploComGenericos {

	public static void main(String[] args) {
		String [] colecaoTexto = {"Java", "é", "divertido..."};
		Fruta [] colecaoFrutas = {new Fruta("Abacaxi"), new Fruta("Uva"), new Fruta("Banana")};
		Pessoa [] colecaoPessoas = {new Pessoa("Ana"), new Pessoa("Bete")};
		Integer [] colecaoInteiros = {18,21,50,55,60};
		
		exibir(colecaoTexto);
		exibir(colecaoFrutas);
		exibir(colecaoPessoas);
		exibir(colecaoInteiros);
	}
	
	public static <G> void exibir(G[] qqrCoisa) {
		for (G generico : qqrCoisa) {
			System.out.println(generico + " ");
		}
		System.out.println("--------------------------------------");
	}
	
//	public static void exibir(String[] texto) {
//
//		for (String string : texto) {
//			System.out.println(string + " ");
//		}
//		System.out.println("--------------------------------------");
//	}
//	
//	public static void exibir(Integer[] numeros) {
//		for (Integer integer : numeros) {
//			System.out.println(integer + " ");
//		}
//		System.out.println("--------------------------------------");
//	}
//	
//	public static void exibir(Pessoa[] pessoas) {
//		for (Pessoa pessoa : pessoas) {
//			System.out.println(pessoa + " ");
//		}
//		System.out.println("--------------------------------------");
//	}
//	
//	public static void exibir(Fruta[] frutas) {
//		for (Fruta fruta : frutas) {
//			System.out.println(fruta + " ");
//		}
//		System.out.println("--------------------------------------");
//	}

}
