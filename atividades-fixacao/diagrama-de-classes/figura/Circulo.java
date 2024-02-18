package figura;

public class Circulo extends Figura {
	
	private double raio;
	
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	
	//Getters and Setters
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}



	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public double calcularPerimetro() {
		//Circunferência
		return 2 * Math.PI * this.raio;
	}
	
	public double getDiametro() {
		return 2 * raio;
	}
}
