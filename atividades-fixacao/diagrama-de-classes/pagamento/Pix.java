package pagamento;

public class Pix implements Pagamento {

	private String chavePix;
	
	public Pix(String chavePix) {
		this.setChavePix(chavePix);
	}
	
	@Override
	public void efetuarPagamento(double valor) {
		// TODO Auto-generated method stub
		
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

}
