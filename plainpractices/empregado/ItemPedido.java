package plainpractices.empregado;

public class ItemPedido {
	private String item;
	private int quantidade;
	private double price;
	private double totalPorItem;
	
	public ItemPedido(String item, int quantidade, double price) {
		this.item = item;
		this.price = price;
		this.quantidade = quantidade;
		setTotalPorItem(quantidade, price);
	}

	public double getTotalPorItem() {
		return totalPorItem;
	}

	public void setTotalPorItem(int quantidade, double price) {
		this.totalPorItem = quantidade * price;
	}
	
	
}
