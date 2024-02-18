package colaboradores;

import java.time.LocalDate;

public class UIDesigner extends Colaborador implements DesignerActions{

	public UIDesigner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UIDesigner(String nome, String cpf, Genero genero, double salario,
			String matricula, LocalDate dataContratacao, ModeloContratacao modeloContratacao,
			Senioridade senioridade, Status status) {
		super(nome, cpf, genero, salario, matricula, dataContratacao, 
				modeloContratacao, senioridade, status);
	
	}

	
	@Override
	public void exibirTarefas() {
		// TODO Auto-generated method stub
		System.out.println("O UI Designer terá como tarefas...");
	}

	@Override
	public void exibirTooling() {
		// TODO Auto-generated method stub
		System.out.println("Figma UML");
	}

	@Override
	public void implementarDesignerActions() {
		// TODO Auto-generated method stub
		System.out.println("Analizando, planejando e implementando todas as"
				+ "designer actions.");
	}
	
	

}
