package compraevenda;

public class ItemPedido {
	private Produto produto;
	private int quantidade;
	private double total;
	
	public ItemPedido(Produto produto2, int quantidade2) {
		setProduto(produto2);
		setQuantidade(quantidade2);
		setTotal();
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return this.total;
	}
	public void setTotal() {
		this.total = produto.getPreco() * this.quantidade;
	}
}
