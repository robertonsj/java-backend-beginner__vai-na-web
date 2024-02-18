package repetitionstructures;

import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double priceList[]	= {17, 25, 35, 5, 4}, somarPedido = 0;
		boolean flag = true;
		
		do {
			
			System.out.println("\n### Restaurante RNS #### " +
					"\nFaça seu pedido: " +
					"\n1 - Quentinha  | R$17.00" +
					"\n2 - Macarronada  | R$25.00" +
					"\n3 - Picanha grelhada  | R$35.00" +
					"\n4 - Bebida  | R$5.00" + 
					"\n5 - Sobremesa  | R$4.00\n" +
					"\n## Escolha uma opção>> ");
			int opcao = scan.nextInt();
			
			somarPedido += priceList[opcao - 1];
			
			System.out.println("\nDeseja algo mais? "+
					"\n1 - sim" +
					"\n0 - não");
			int outroPedido = scan.nextInt();
			
			if(outroPedido == 1) flag = false;
			else flag = true;
			
		}while(!flag);
		
		System.out.println("\nTotal do pedido: R$" + somarPedido);
		
		
		
	}

}
