package cadastroAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alunos = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean interruptor = true;
		int opcao;
		int indexAluno;
		
		do {
			System.out.println("Digite uma das opções: ");
			System.out.println(" 1-Adicionar aluno \n 2-Alterar Aluno \n "
					+ "3-Remover aluno \n 4-Ver alunos \n 5-Sair");
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do aluno a ser adicionado:");
				alunos.add(scan.next());
				break;
			case 2:
				System.out.println("Digite o index do aluno que você quer modificar");
				indexAluno = scan.nextInt();
				System.out.println("Digite o novo nome do aluno:");
				alunos.set(indexAluno,scan.next() );
				break;
			case 3:
				System.out.println("Digite o index do aluno que você quer remover:");
				alunos.remove(scan.nextInt());
				break;
			case 4:
				System.out.println(alunos);
				break;
			case 5:
				interruptor = false;
				break;
			}
						
		} while(interruptor);
		
		scan.close();
	}

}
