package cap7;

public class CadastroProgramador {

	public static void main(String[] args) {
		
		Programador[] arrayProgramadores = 
				new Programador[] {new Programador("Horácio", "PHP", 6250.00),
				new Programador("Lúcia", "Java", 8725.00),
				new Programador("Gilberto", "C#", 7809.00)};
		
		for (Programador p : arrayProgramadores){
			p.mostrarDados();
		}
	}
}
