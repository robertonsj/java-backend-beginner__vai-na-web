package atividade2411classes;

public class Empregado {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public Empregado(double salario2) {
		this.salario = salario2;
	}
	
	public double salarioAnual() {
		return this.salario;
	}
	
	public double aumento(double aumento) {
		return salario += salario * aumento/100;
	}
	
	
}
