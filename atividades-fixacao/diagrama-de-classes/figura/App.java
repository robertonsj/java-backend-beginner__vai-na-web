package figura;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo circulo = new Circulo("Verde", 4);
		Figura retangulo = new Retangulo("Vermelho", 9, 4);
		Figura triangulo = new Triangulo("Azul", 7, 10);
		
		System.out.println("*** Círculo");
		System.out.printf("Área: %.2fm² - Perímetro: %.2fm"
				+ "\n" + "Diâmetro: %.2fm", circulo.calcularArea(),
				circulo.calcularPerimetro(), circulo.getDiametro());
		System.out.println("\n------------------------------");
		
		System.out.println("*** Retângulo");
		System.out.printf("Área: %.2fm² - Perímetro: %.2fm",
				retangulo.calcularArea(), retangulo.calcularPerimetro());
		System.out.println("\n------------------------------");
		
		System.out.println("*** Triângulo");
		System.out.printf("Área: %.2fm² - Perímetro: %.2fm",
				triangulo.calcularArea(), triangulo.calcularPerimetro());
		System.out.println("\n------------------------------");
		
		
		
	}

}
