package cap8.exercicios;

public abstract class Poligono {

	private double area;
	
	public abstract void calcularArea();
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void imprimir() {
		System.out.println("Area do Poligono: " + getArea());
	}
}
