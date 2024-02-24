package plainpractices.empregado;

public class Empregado {
	protected String nome;
	protected double salario;
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public double salarioAnual() {
		return this.salario;
	}
	
	public double aumento(double aumento) {
		return salario += salario * aumento/100;
	}
	
	
}
