package figura;

public class Retangulo extends Figura {
	private double base;
	private double altura;
	
	public Retangulo() {
		super();
	}
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
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
	
	
	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2*base + 2*altura;
	}

}
