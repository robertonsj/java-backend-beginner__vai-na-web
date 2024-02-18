package colaboradores;

import java.time.LocalDate;

public class TechLeader extends Colaborador implements TechLeaderActions {

	
	public TechLeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechLeader(String nome, String cpf, Genero genero, double salario,
			String matricula, LocalDate dataContratacao, 
			ModeloContratacao modeloContratacao, 
			Senioridade senioridade, Status status) {
		
		super(nome, cpf, genero, salario, matricula, 
				dataContratacao, modeloContratacao, 
				senioridade, status);
	}

	@Override
	public void exibirTarefas() {
		System.out.println("O tech leader terá como tarefas...");
	}

	@Override
	public void exibirTooling() {
		// TODO Auto-generated method stub
		System.out.println("[Agile, Scrum, SoftwareEngineer]");
		
	}

	@Override
	public void implementarTechLeaderActions() {
		// TODO Auto-generated method stub
		System.out.println("Analizando, planejando e implementando todas as"
				+ "tech leader actions.");
	}
	
	
}
