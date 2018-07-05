package cap11;

public class TestaEqualsHashCode {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Pedro");
		p1.setEndereco("Av. Angelica, 2000, apt 10");
		
		p2.setNome("Ana");
		p2.setEndereco("Av. Angelica, 2000, apt 10");
		
		if (p1.equals(p2)) {
			System.out.println("Objetos equivalentes");
		}else {
			System.out.println("Objetos diferentes");
		}
		
		System.out.println("HashCode de p1: " + p1.hashCode());
		System.out.println("HashCode de p2: " + p2.hashCode());
	}
}
