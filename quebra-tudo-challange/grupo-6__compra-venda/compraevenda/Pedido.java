package compraevenda;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List<ItemPedido> itens;
	private Cliente cliente;
	private double total = 0;
	
	
	public Pedido(Cliente cliente2) {
		cliente = cliente2;
		itens = new ArrayList<>();
	}
	
	
	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public double getTotal() {
		double total = 0;
		for(ItemPedido item : itens) {
			total += item.getTotal();
		}
		setTotal(total);
		return total;
	}
	public void setTotal(double total2) {
		this.total = total2;
	}
	
}
