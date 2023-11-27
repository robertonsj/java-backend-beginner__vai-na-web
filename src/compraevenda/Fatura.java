package compraevenda;

public class Fatura {
	protected String numeroDoProduto;
	protected String descricao;
	protected int quantidadeComprada;
	protected double precoProduto;
	
	
	public double fornecerTotalfatura() {
		 return this.quantidadeComprada * this.precoProduto;
	}
}
