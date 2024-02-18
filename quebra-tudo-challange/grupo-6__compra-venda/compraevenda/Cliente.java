package compraevenda;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private String contato;
	private List<Pedido> historicoCompras;
	
	public Cliente(String nome2, String cpf2, String contato2) {
		this.nome = nome2;
		this.cpf = cpf2;
		this.contato = contato2;
		historicoCompras = new ArrayList<>();
	}
	
	
	public List<Pedido> getHistoricoCompras() {
		return historicoCompras;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	
	
}
