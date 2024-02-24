package plainpractices.empregado;

import java.util.ArrayList;

public class Compra {
	private ArrayList<ItemPedido> itensPedidos = new ArrayList<>();
	private double totalSomaDeItens = 0;
	
	public Compra(ItemPedido item) {
		itensPedidos.add(item);
	}
	
	
	public void setTotalSomaDeItens() {
		itensPedidos.forEach(item -> totalSomaDeItens += item.getTotalPorItem());
	}
	public double getTotalSomadeItens() {
		return totalSomaDeItens;
	}
	
}
