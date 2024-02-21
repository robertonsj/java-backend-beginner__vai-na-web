package relacionamento;

public class Professor extends Pessoa {

	private String disciplina;

	public Professor() {
		super();
	}

//	public Professor(String nome, String cpf, String rg, String disciplina) {
//		super(nome, cpf, rg);
//		this.disciplina = disciplina;
//	}

	public Professor(String nome, String cpf, String rg, Endereco endereco, String disciplina) {
		super(nome, cpf, rg, endereco);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Está ministrando uma aula de: " + this.disciplina);
	}

}
