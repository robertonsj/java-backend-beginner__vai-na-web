package plainpractices.empregado;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado empregado1 = new Empregado("Roberto", 2000);
		
		Compra compra = new Compra();
		
		double totalFatura = fatura.fornecerTotalfatura();
		System.out.println("Total da Fatura: R$" + totalFatura);
		System.out.println();
		System.out.println();
		
		ControleDespesas controleDespesas = new ControleDespesas();
		controleDespesas.adicionarDespesa(17.5);
        controleDespesas.adicionarDespesa(25.80);
        controleDespesas.adicionarDespesa(36.60);
        
        double total = controleDespesas.calcularTotalDespesas();
        
        System.out.println("Total Despesas: R$" + total);
		
		
	}

}
