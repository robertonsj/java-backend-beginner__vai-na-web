package getstarted;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		/*
		while(true) {
		System.out.print("Enter the first number: ");
		int numero1 = scanner.nextInt();
		/*
		System.out.print("Enter the second number: ");
		int numero2 = scanner.nextInt();
		System.out.print("Enter the third number: ");
		int numero3 = scanner.nextInt();
		
		int maior = numero1;
		int menor = numero1;
		
		if(menor > numero2) menor = numero2;
		if(menor > numero3) menor = numero3;
		
		if(maior < numero2) maior = numero2;
		if(maior < numero3) maior = numero3;
		
		
		System.out.print("Maior: " + maior);
		System.out.print("Menor: " + menor);
		
	
		String parOuImpar = numero1 % 2 == 0 ? "Par" : "Impar";
		System.out.println("O número é " + parOuImpar); 
		
		}*/
		
		
		//TRIANGLE IDENTIFICATION
		System.out.println("Insira os lados de um triângulo: ");
		System.out.print("Lado 1: ");
		int lado1 = scanner.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = scanner.nextInt();
		System.out.print("Lado 3: ");
		int lado3 = scanner.nextInt();
		
		if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) System.out.println("Temos um triângulo Equilátero");
		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) System.out.println("Temos um triângulo Escaleno");
		else System.out.println("Temos um triângulo isósceles!");
	
		/*
		if (nota >= 7) System.out.println("Passou direto, parabéns!");
		else if (nota >= 5 && nota < 7) System.out.println("Ficou de recuperação!");
		else System.out.print("Infelizmente você reprovou!");
		*/
		
		
		
		
	}
	
}
