package mathoperations;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1 = 18,
				numero2 = 3,
				numero3 = 7.7;
		System.out.println("Sum: " + MathOperations.Sum(numero1, numero2, numero3));
		System.out.println("Subtract: " + MathOperations.Subtract(numero1, numero2, numero3));
		System.out.println("Multiply: " + MathOperations.Multiply(numero1, numero2, numero3));
		System.out.println("Division: " + MathOperations.Divide(numero1, numero2));
		
		System.out.println("Perimetro do retangulo: " + MathOperations.
				calcularPerimetroRetangulo(numero1, numero2));
		
		System.out.println("Área de uma circunferência: " + MathOperations.
				calcularAreaCircum(6));
		System.out.println("Perímetro de uma circunferência: " + MathOperations.
				calcularPerimetroCircum(10));
		
		System.out.println("Area do triangulo retângulo: " + MathOperations.
				calcularAreaTriangulo(6, 12));
		
		System.out.println("Volume da esfera: " + MathOperations.
				calcularVolumeEsfera(2));
		System.out.println("Volume pirâmide: " + MathOperations.
				calcularVolumePiramide(9, 4));
		System.out.println("Volume do cone circular reto: " + MathOperations.
				calcularVolumeCone(5, 8));
		System.out.println("Volume do cilindro: " + MathOperations.
				calcularVolumeCilindro(3.1, 10));
		
		
		//Capital inicial = 500.00
		// taxa de juros mensal = 3%
		// período = 1 ano e 6 meses = 18 meses
		System.out.println(MathOperations.calcularJurosSimples(500, 3, 18));
		System.out.println("Montante final dos juros compostos: R$" + 
				MathOperations.calcularJurosComposto(500, 3, 18));
	}

}
