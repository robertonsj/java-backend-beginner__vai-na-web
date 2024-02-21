package repetitionstructures;

import java.util.Scanner;

public class EstruturasDeRepeticaoA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int resultado;
		
		String loginList[] = {"abc", "def", "ghi"}, userLogin, usedLogin;
		String paswList[] = {"123", "456", "789"}, userPasw, newPasw;
		boolean isLoginValid = false, loginExist = false;
		int option; //Used in the restore access code block. 
		
		do {
			
			System.out.println("\n##### AUTENTICATION SCREEN #####");
			System.out.print("Login: ");
			userLogin = scan.nextLine();
			System.out.print("Senha: ");
			userPasw = scan.nextLine();
			
			
			for(int i = 0; i < loginList.length; i++) {
				if(loginList[i].equals(userLogin) && paswList[i].equals(userPasw)) {
					isLoginValid = true;
					break;
				}
			}
			if(isLoginValid) System.out.println("\nWelcome back, you are loggedin!");
			else {
				do {				
					System.out.print("\n##### DO YOU WANTO TO RESTORE YOUR ACCESS? #####" + 
							"\n1) Yes, I do" + 
							"\n0) No, maybe later" +
							"\n### Choose 1(one) or 0(zero): ");
					option = scan.nextInt();
				}while(option != 0 && option != 1);
				
				if(option == 1) {
					do {
						System.out.print("\n##### RESTORE ACCESS SCREEN #####" + 
								"\nEnter the characters sequence for logging: ");
						usedLogin = scan.nextLine();
						for(int j = 0; j < loginList.length; j++) {
							
							if(loginList[j].equals(usedLogin)) {
								loginExist = true;
								
								System.out.println("\n### Enter you new password: ");
								paswList[j] = scan.nextLine();
								break;
							}
						}
					}while(!loginExist);
					
				}
			}
		}while(!isLoginValid);
		
		
		
		/*
		System.out.print("De qual número você quer a tabuada? ");
		int numero = scan.nextInt();
		
		
		while(count <= 10) {
			resultado = numero * count;
			System.out.println(numero + " x " + count + " = " + resultado);
			count++;
		}
		scan.close();
		
		
		do {
			resultado = numero * count;
			System.out.println(numero + " x " + count + " = " + resultado);
			count++;
		}while(count <= 10);
		scan.close();
		
		
		for(int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		scan.close();*/
		
		scan.close();
		System.out.println("Program finished");
	}

}
