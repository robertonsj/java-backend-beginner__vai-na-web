package colaboradores;

import java.time.LocalDate;

public class DevFrontEnd extends Colaborador implements Tooling {


	public DevFrontEnd() {
		super();
	}

	public DevFrontEnd(String nome, String cpf, Genero genero, double salario,
			String matricula, LocalDate dataContratacao, ModeloContratacao modeloContratacao,
			Senioridade senioridade, Status status) {
		super(nome, cpf, genero, salario, matricula, dataContratacao, 
				modeloContratacao, senioridade, status);
	}
	
	@Override
	public void exibirTooling() {
		// TODO Auto-generated method stub
		System.out.println("[TypeScript, ReactJs]");
	}
	
	@Override
	public void exibirTarefas() {
		System.out.println("O desenvolvedor front-end terá como tarefas...");
	}

}
