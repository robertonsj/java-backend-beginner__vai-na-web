package relacionamento;

public class Application {

	public static void main(String[] args) {
		Professor professor = new Professor("Samuel", "1234-5", "0987-x", new Endereco("145-78", "Geraldinas", "BonSucesso", "Taquaritinga"), "Back-end");
		Estudante estudante = new Estudante("Alunovo", "9876-5", "15935-7", "Front-end");
		
		professor.visualizar();
		System.out.println();
		estudante.visualizar();
		
		
	}

}
