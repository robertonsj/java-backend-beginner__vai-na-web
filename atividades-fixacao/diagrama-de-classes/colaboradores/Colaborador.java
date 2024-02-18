package colaboradores;

import java.util.Scanner;
import java.time.LocalDate;


enum ModeloContratacao {
	CLT, PJ, CONTRATO;
}

enum Senioridade {
	ESTAGIARIO, JUNIOR, PLENO, SENIOR;
}

enum Status {
	ACTIVED, DESACTIVATED, STANDINGBY;
}


public abstract class Colaborador extends Pessoa {

	private double salario;
	private String matricula;
	private LocalDate dataContratacao;
	private ModeloContratacao modeloContratacao;
	private Senioridade senioridade;
	private Status status;
	

	// Construtores
	public Colaborador() {
		super();
	}
	
	public Colaborador(String nome, String cpf, Genero genero, double salario) {
		super(nome, cpf, genero);
		this.salario = salario;
	}
	
	public Colaborador(String nome, String cpf, Genero genero, double salario,
			String matricula, LocalDate dataContratacao, ModeloContratacao modeloContratacao,
			Senioridade senioridade, Status status) {
		super(nome, cpf, genero);
		this.salario = salario;
		this.matricula = matricula;
		this.dataContratacao = dataContratacao;
		this.modeloContratacao = modeloContratacao;
		this.senioridade = senioridade;
		this.status = status;
	}


	// Getters e Setters
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}


	public String getMatricula() {
		return matricula;
	}

	public ModeloContratacao getModeloContratacao() {
		return modeloContratacao;
	}

	public Senioridade getSenioridade() {
		return senioridade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Status getStatus() {
		return status;
	}
	


	// Methods
	public void visualizarDadosColaborador() {
		System.out.println("============ *** ============");
			System.out.println("Colaborador: " + this.getNome().toUpperCase() + "\n"
				+ "Gênero: " + this.getGenero() + "\n"
				+ "Salário: " + this.getSalario() + "\n"
				+ "Matricula: " + this.getMatricula() + "\n"
				+ "Data de Contratação: " + this.getDataContratacao() + "\n"
				+ "Modelo de Contratação: " + this.getModeloContratacao() + "\n"
				+ "Senioridade: " + this.getSenioridade() + "\n"
				+ "Status: " + this.getStatus());
		System.out.println();
	}
	
	public abstract void exibirTarefas();
	
	public void aumentarSalario(double percentual) {
		this.salario += this.salario * percentual / 100;
	}

	public void desligarColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tem certeza que deseja desvincular " + getNome());
		Character resposta = sc.next().toLowerCase().charAt(0);
		
		if (resposta.equals('s')) {
			this.status = Status.DESACTIVATED;
		}

		sc.close();
	}
}
