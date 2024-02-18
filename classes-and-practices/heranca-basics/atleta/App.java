package atleta;

public class App {

	public static void main(String[] args) {
		
		TriAtleta triAtleta = new TriAtleta("João Pedro Belo", "456-90");
		AtletaNatacao nadador = new AtletaNatacao("Michael Phelps", "887.534.128-90");
		triAtleta.nadar(10, "Crawl");
		triAtleta.correr(5);
		System.out.println("--------------------------------");
		nadador.nadar(100, "Cachorrinho");
	}
}
