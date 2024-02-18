package pagamento;
import java.time.LocalDate;

public class CartaoCredito implements Pagamento, Fatura {
	
	private String numeroCartao;
	private LocalDate validade;
	private String nomeTitular;
	private final double LIMITETOTAL = 2000;
	private final double limiteDisponivel = 600;
	
	
	public double getLIMITETOTAL() {
		return LIMITETOTAL;
	}

	public double getLimiteDisponivel() {
		return limiteDisponivel;
	}

	@Override
	public void efetuarPagamento(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Pagamento de R$" + valor + " efetuado com cartão de crédito.");
		
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}
