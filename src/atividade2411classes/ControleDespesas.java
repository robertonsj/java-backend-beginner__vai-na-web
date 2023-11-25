package atividade2411classes;

import java.util.ArrayList;

public class ControleDespesas {
	private ArrayList<Double> despesas;
	
	public ControleDespesas() {
		despesas = new ArrayList();
	}
	
	public void adicionarDespesa(double valor) {
		despesas.add(valor);
	}
	
	public double calcularTotalDespesas() {
		double total = 0;
		
		for(double despesa : despesas) {
			total += despesa;
		}
		return total;
	}
	
}
