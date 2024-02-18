package mathoperations;

import java.text.DecimalFormat;

public class MathOperations {
	
	static DecimalFormat format = new DecimalFormat(".##");
	

	public static double Sum(double ...numeros) {
		double resultado = 0;
		for(double numero : numeros) resultado += numero;
		return resultado;
	}
	public static long Sum(long ...numeros) {
		long resultado = 0;
		for(double numero : numeros) resultado += numero;
		return resultado;
	}
	public static double Subtract(double ...numeros) {
		double resultado = 0;
		for(double numero : numeros) resultado -= numero;
		return resultado;
	}
	public static long Subtract(long ...numeros) {
		long resultado = 0;
		for(double numero : numeros) resultado -= numero;
		return resultado;
	}
	
	public static double Multiply(double ...numeros) {
		double resultado = 1;
		for(double numero : numeros) resultado *= numero;
		return resultado;
	}
	public static long Multiply(long ...numeros) {
		long resultado = 1;
		for(double numero : numeros) resultado *= numero;
		return resultado;
	}
	
	public static double Divide(double ...numeros) {
		double resultado = numeros[0];
		for(int i = 1; i < numeros.length; i++ ) {
			if(numeros[i] == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			resultado /= numeros[i];				
			
		}
		return resultado;
	}
	public static long Divide(long ...numeros) {
		long resultado = numeros[0];
		for(int i = 1; i < numeros.length; i++ ) {
			if(numeros[i] == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			resultado /= numeros[i];				
			
		}
		return resultado;
	}
	
	public static double calcularPerimetroRetangulo(double comp, double largura) {
		return 2 * comp + 2 * largura;
	}
	public static double calcularAreaRetangulo(double comp, double largura) {
		return comp * largura;
	}
	
	//Calcular área de uma circumferência
	public static String calcularPerimetroCircum(double raio) {
		return format.format(2 * Math.PI * raio);
	}
	
	//Calcular perímetro de uma circumferência
	public static String calcularAreaCircum(double raio) {
		return  format.format(Math.PI * Math.pow(raio, 2));
	}
	public static String calcularVolumeEsfera(double raio) {
		return format.format(4.0/3.0 * Math.PI * Math.pow(raio, 3));
	}
	
	//Calcular area de triângulo retângulo
	public static double calcularAreaTriangulo(double base, double altura) {
		return 0.5 * base * altura;
	}
	public static String calcularVolumePiramide(double areaBase, double altura) {
		return format.format(areaBase * altura / 3.0);
	}
	//Volume de um cone circular reto
	public static String calcularVolumeCone(double raioBase, double altura) {
		return format.format(1.0/3.0 * Math.PI * Math.pow(raioBase, 2) * altura);
	}
	
	public static String calcularVolumeCilindro(double raioBase, double altura) {
		return format.format(Math.PI * Math.pow(raioBase, 2) * altura);
	}
	
	//Juros simples e compostos
	//C - capital inicial, i - taxa de juros mensal, t - período de transação
	public static String calcularJurosSimples(double C, double i, int t) {
		double jurosSimples = C * i/100 * t;
		double montanteFinal = C + jurosSimples;
		return "Juros simples: R$" + jurosSimples + "\n"
				+ "Montante final do juros simples: R$" + montanteFinal;
	}
	
	public static String calcularJurosComposto(double C, double i, int t) {
		double montanteFinal = C * Math.pow((1 + i/100), t);
		return format.format(montanteFinal);
	}
	
	

}
