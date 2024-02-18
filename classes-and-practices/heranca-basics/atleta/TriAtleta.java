package atleta;

public class TriAtleta extends Pessoa implements Natacao, Ciclismo, Corrida {
	
	public TriAtleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TriAtleta(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		System.out.println(getNome() + " esta aquecendo");
	}

	@Override
	public void nadar(float metros, String modalidade) {
		System.out.println(getNome() + " esta nadando " + metros + " metros, na modalidade " + modalidade);
		correr(10);
		pedalar();
	}

	@Override
	public void correr(float kilometragem) {
		System.out.println(getNome() + " esta correndo " + kilometragem + " Km");

	}

	@Override
	public void pedalar() {
		System.out.println(getNome() + " esta pedalando");

	}

}
