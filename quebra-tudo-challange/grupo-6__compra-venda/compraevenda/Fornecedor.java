package compraevenda;

public class Fornecedor {
	
	private String nome;
	private String endereco;
	private String contato;
	
	public Fornecedor(String nome, String endereco, String contato){
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	public String getNome(){
		return nome;
	}
	
	// Alterar nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	// Alterar endereco
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getContato(){
		return contato;
	}
	
	// Alterar contato
	public void setContato(String contato) {
		this.contato = contato;
	}
}
