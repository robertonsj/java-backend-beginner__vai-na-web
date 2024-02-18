package getstarted;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SwitchClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat(".####");
		
		/*
		System.out.println("Escolha\n1 -> Sunday" + 
		"\n2 -> Monday" +
		"\n3 -> Tuesday" + 
		"\n4 -> Wednesday" + 
		"\n5 -> Thursday" +
		"\n6 -> Friday" + 
		"\n7 -> Saturday\n");
		int opcao = scanner.nextInt();
		
		
		switch(opcao) {
		case 1:
			System.out.println("\nToday's Sunday");
			break;
		case 2:
			System.out.println("\nToday's Monday");
			break;
		case 3:
			System.out.println("\nToday's Tuesday");
			break;
		case 4:
			System.out.println("\nToday's Wednesday");
			break;
		case 5:
			System.out.println("\nToday's Thursday");
			break;
		case 6:
			System.out.println("\nToday's Friday");
			break;
		case 7:
			System.out.println("\nToday's Saturday");
			break;
		default:
			System.out.println("Invalid insertion");
		}
		
		
		String impressao = switch(opcao) {
		case 1 -> "Sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "Invalid entrance";
		};
		
		System.out.println("\n" + impressao);
		*/
		
		//CALCULATOR
		System.out.print("Enter the first number: ");
		double operador1 = scanner.nextDouble();
		
		System.out.print("Enter the second number: ");
		double operador2 = scanner.nextDouble();
		
		if(operador2 != 0) {
				
			System.out.print("\n*** Escolha um operando: " +
					"\n1 -> Somar" +
					"\n2 -> Subtrair" +
					"\n3 -> Multiplicar" +
					"\n4 -> Dividir" +
					"\n>> Enter an option: ");
			int opcao = scanner.nextInt();
				
				double resultado = switch(opcao) {
				case 1 -> operador1 + operador2;
				case 2 -> operador1 - operador2;
				case 3 -> operador1 * operador2;
				case 4 -> operador1 / operador2;
				default -> throw new IllegalArgumentException("Unexpected value: " + opcao);
				};
				
			System.out.println("\n### Resultado: " + format.format(resultado));
				
				
		} else System.out.println("\nError! Denominador igual a zero.");
		
		
	}

}
