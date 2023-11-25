package atividade2411classes;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado empregado1 = new Empregado(2500);
		Empregado empregado2 = new Empregado(3500);
		
		empregado1.aumento(10);
		empregado2.aumento(10);
		
		System.out.println("Salario empregado 1: " + empregado1.salario);
		System.out.println("Salario empregado 2: " + empregado2.salario);
		System.out.println();
		
		Fatura fatura = new Fatura();
		fatura.precoProduto = 4.25;
		fatura.quantidadeComprada = 5;
		
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
