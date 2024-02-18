package colaboradores;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

public class DevBackEnd extends Colaborador implements BackEnderActions {

	
	public DevBackEnd() {
		super();
	}

	public DevBackEnd(String nome, String cpf, Genero genero, double salario,
			String matricula, LocalDate dataContratacao, 
			ModeloContratacao modeloContratacao, 
			Senioridade senioridade, Status status) {
		
		super(nome, cpf, genero, salario, matricula, 
				dataContratacao, modeloContratacao, 
				senioridade, status);
	}


	@Override
	public void exibirTarefas() {
		System.out.println("O desenvolvedor back-end terá como tarefas...");
	}

	@Override
	public void exibirTooling() {
		// TODO Auto-generated method stub
		System.out.println("[Java, SpringBoot, Nodejs");
	}
	
	@Override
	public void implementarBackEndApp() {
		// TODO Auto-generated method stub
		System.out.println("Analizando, planejando e implementando todas as"
				+ "back-ender actions.");
	}

}
