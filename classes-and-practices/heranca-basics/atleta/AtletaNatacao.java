package atleta;

public class AtletaNatacao extends Pessoa implements Natacao {

	public AtletaNatacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AtletaNatacao(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void nadar(float metros, String modalidade) {
		System.out.println(getNome() + " esta nadando " + metros + " metros, na modalidade " + modalidade);

	}

}
