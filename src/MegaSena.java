package trycatchresource;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numerosDoUsuario[] = new int[7],
				numerosSorteados[] = new int[7],
				quantidadeNumerosSorteados = 0;
		
		numerosDoUsuario = validarEntradaDoUsuario(scanner);
		numerosSorteados = gerarNumerosSorteados(random);
		
		quantidadeNumerosSorteados = verificarNumerosSorteados(numerosDoUsuario, numerosSorteados);
		
		System.out.println("Números do usuario: ");
		exibirVetor(numerosDoUsuario);
		System.out.println("Números sorteados");
		exibirVetor(numerosSorteados);
		
		exibirMensagemResultado(quantidadeNumerosSorteados);
		
		
	}
	
	public static int[] validarEntradaDoUsuario(Scanner scanner) {
		int numerosEscolhidos[] = new int[7];
		int numeroInserido;
		
		boolean numeroValido;
		
		System.out.println("\nInserindo os sete números para sorteio (entre 0 e 100 inclusive): ");
		for(int i = 0; i < 7; i++) {
			
			do {
				try {
					System.out.print("Insira o " + (i+1) + "º numero: ");
					numeroInserido = scanner.nextInt();
					
					if(numeroInserido >= 0 && numeroInserido <= 100) {
						numerosEscolhidos[i] = numeroInserido;
						numeroValido = true;
					}
					else {
						System.out.println("Número inválido! Digite um número entre 0 e 100!");
						numeroValido = false;
					}
					
					
				}catch(InputMismatchException e) {
					System.out.println("O número inserido não é válido! Tente novamente.");
					scanner.next(); //importante limpar o buffer do scanner
					numeroValido = false;
				}
				
			}while(!numeroValido);
		}
		return numerosEscolhidos;
	}
	
	public static int[] gerarNumerosSorteados(Random random) {
		int numerosSorteados[] = new int[7];
		
		for(int i = 0; i < numerosSorteados.length; i++) {
			numerosSorteados[i] = random.nextInt(101);
		}
		
		return numerosSorteados;
		
	}

	public static int verificarNumerosSorteados(int numerosDoUsuario[], int numerosSorteados[]) {
		int counter = 0;
		
		for(int numeroDoUsuario : numerosDoUsuario) {
			for(int numeroSorteado : numerosSorteados) {
				if(numeroDoUsuario == numeroSorteado) {
					counter++;
					break;
				}
			}
		}
		return counter;
	}
	
	public static void exibirMensagemResultado(int acertos) {
		switch(acertos) {
		case 5:
			System.out.println("VocÊ ganhou um prémio de 10 mil reais\n");
			break;
		case 6:
			System.out.println("VocÊ ganhou um prémio de 50 mil reais\n");
			break;
		case 7:
			System.out.println("VocÊ ganhou um prémio de 200 mil reais\n");
			break;
		default:
			System.out.println("Infelizmente não ganhou nenhum prémio! :( \n");
		}
	}
	
	public static void exibirVetor(int vetor[]) {
		for(int elemento : vetor) {
			System.out.print(" " + elemento);
		}
		System.out.println();
	}
}
