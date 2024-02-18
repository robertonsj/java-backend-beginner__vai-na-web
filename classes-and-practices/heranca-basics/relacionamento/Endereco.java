package relacionamento;

public class Endereco {
	private String cep;
	private String nomeDaRua;
	private String bairro;
	private String cidade;

	public Endereco() {
		
	}
	
	public Endereco(String cep, String nomeDaRua, String bairro, String cidade) {
		this.cep = cep;
		this.nomeDaRua = nomeDaRua;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Rua: " + this.nomeDaRua + ", Bairro: " + this.bairro + ", Cidade: " + this.cidade + ", CEP: "
				+ this.cep;
	}
}
