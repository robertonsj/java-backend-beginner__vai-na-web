package figura;

public abstract class Figura {
	private String cor;
	
	
	public Figura() {
		
	}
	public Figura(String cor){
		this.cor = cor;
	}

	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//abstract classes
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
}
