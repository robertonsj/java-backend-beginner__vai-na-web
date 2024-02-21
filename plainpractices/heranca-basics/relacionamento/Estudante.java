package relacionamento;

public class Estudante extends Pessoa {

	private String curso;

	public Estudante() {
		super();
	}
	
	public Estudante(String nome, String cpf, String rg, String curso) {
		super(nome, cpf, rg);
		this.curso = curso;
	}


	public Estudante(String nome, String cpf, String rg, Endereco endereco, String curso) {
		super(nome, cpf, rg, endereco);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Está cursando: " + this.curso);
	}
	
	
}
