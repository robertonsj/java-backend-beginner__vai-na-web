package plainpractices.classes;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Alunos> alunos = new ArrayList<Alunos>();
	
		alunos.add(new Alunos("Roberto", 20));
		alunos.add(new Alunos("Rayane", 25));
		alunos.add(new Alunos("Jose", 30));
		alunos.add(new Alunos("Francisco", 20));
		
		
		alunos.forEach(aluno -> System.out.println(aluno.toString()));
	}

}
