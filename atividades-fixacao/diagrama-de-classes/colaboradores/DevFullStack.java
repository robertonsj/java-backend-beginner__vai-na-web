package colaboradores;

import java.time.LocalDate;

public class DevFullStack extends Colaborador 
implements FrontEndActions, BackEnderActions {

	public DevFullStack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DevFullStack(String nome, String cpf, Genero genero, double salario, String matricula,
			LocalDate dataContratacao, ModeloContratacao modeloContratacao, Senioridade senioridade, Status status) {
		super(nome, cpf, genero, salario, matricula, dataContratacao, modeloContratacao, senioridade, status);
		// TODO Auto-generated constructor stub
	}

	public DevFullStack(String nome, String cpf, Genero genero, double salario) {
		super(nome, cpf, genero, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibirTooling() {
		// TODO Auto-generated method stub
		System.out.println("*** Tooling: "
				+ "StackFront");
	}

	@Override
	public void implementarFrontEndApp() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void implementarBackEndApp() {
		
	}

	@Override
	public void exibirTarefas() {
		// TODO Auto-generated method stub
		
	}
	
	

}
