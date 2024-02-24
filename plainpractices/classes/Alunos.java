package plainpractices.classes;

public class Alunos {
	String nome;
	int idade;
	
	public Alunos() {
		
	}
	public Alunos(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + "]";
	}
	
}
