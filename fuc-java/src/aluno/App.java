package aluno;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// usando List lista de alunos
		
		List<String> alunos = new ArrayList<>();

		alunos.add("Carlos");
		alunos.add("Maria");
		alunos.add("João");
		alunos.add(2, "Jonatas");
		alunos.add("Carlos");
		alunos.add("Carlos");
		alunos.add("Valentina");
		alunos.add("Rogerio");
		alunos.add("Antanio");

		System.out.println(alunos);

		alunos.remove(2);
		System.out.println(alunos);

		while (alunos.contains(alunos)) {
			alunos.remove("Carlos");

		}

		System.out.println(alunos);

		String alunosPrimeiro = alunos.get(0);
		System.out.println(alunosPrimeiro);
		System.out.println(alunos.get(2));

		alunos.set(2, "Carlinos");

		System.out.println(alunos);

		//alunos.clear();

		alunos.sort(null);

		System.out.println(alunos);

		System.out.println(alunos.isEmpty());
		
	}

}
