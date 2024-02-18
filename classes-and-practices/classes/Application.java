package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		List<Alunos> lista = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			Alunos aluno;
			System.out.println("=======================");
			System.out.println("User " + (i+1) + "º");
			System.out.print("Their name: ");
			String nome = scan.nextLine();
			System.out.print("Their age: ");
			int idade = scan.nextInt();
			
			lista.add(new Alunos(nome, idade));
		}
		
		for(Alunos a : lista) {
			System.out.println("#####################");
			System.out.println("Nome: " + a.nome + "idade: " + a.idade);
		}
	}

}
