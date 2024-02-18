package figura;

public class Triangulo extends Figura {
	private double base;
	private double altura;
	
	
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double calcularArea() {
		return this.base * this.altura / 2;
	}
	@Override
	public double calcularPerimetro() {
		
		return base * 3; //needs to be better implemented
	}

	
	//Getters and Setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
