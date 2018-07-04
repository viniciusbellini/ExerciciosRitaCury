package cap8.exercicios;

public class Quadrado extends Poligono {

	private double lado;
	
	public Quadrado(double lado) {
		setLado(lado);
	}

	@Override
	public void calcularArea() {
		setArea(getLado() * getLado());
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "Quadrado [lado="+getLado() + ", área: "+getArea()+"]";
	}
	
}
