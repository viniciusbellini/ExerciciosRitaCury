package cap8.exercicios;

public class Triangulo extends Poligono {
	
	private double altura;
	private double base;
	
	public Triangulo(int altura, int base) {
		setAltura(altura);
		setBase(base);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public void calcularArea() {
		double area = ((getBase() * getAltura())/2);
		setArea(area);
	}
	
	@Override
	public String toString() {
		return "Triangulo [altura="+getAltura()+ ", base="+getBase()+", área: "+getArea()+"]";
	}
	
}
