package colaboradores;

enum Genero {
	MASCULINO, FEMININO;
}

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private Genero genero;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String cpf, Genero genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}
	

	
	
}
