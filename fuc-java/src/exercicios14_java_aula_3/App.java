package exercicios14_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa com um menu em loop (while + switch) que permita gerenciar um ArrayList
de String. O menu deve ter as seguintes opções:
		 * 
		 */
		List<String> itens = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean interruptor = true;
		int opcao;
		int indexItem;
		String busca;
		
		do {
			System.out.println("Digite uma das opções: ");
			System.out.println(" 1-Adicionar item \n 2-Alterar item \n "
					+ "3-Buscar \n 4-Ver itens \n 5-Limpa Lista itens \n 6-Sair");
			opcao = scan.nextInt();scan.nextLine() ;
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do item a ser adicionado:");
				itens.add(scan.next());
				break;
			case 2:
				System.out.println("Digite o item que você quer remover:");
				itens.remove(scan.nextLine());
				break;
			case 3:
				System.out.println("Digite o item que você buscar:\n");
				busca=scan.nextLine();
				if(itens.contains(busca)) {
					System.out.println(busca + " - Encontrado!\n");
				}else {
					System.out.println(busca + " - não encontrado!\n");
				}
				
				break;
				
			case 4:
				if(itens.isEmpty()) {
					System.out.println("Lista Vazia!");
				}
				else {
				System.out.println(itens+" - Total: "+itens.size());
				}
				break;
			case 5:
				itens.clear();
				break;

			case 6:
				System.out.println("Até logo!");
				interruptor = false;
				break;
			default: 
				System.out.println("Opção Inválida");
			}
			
			
			
			
			
		} while(interruptor);
		
	}

}
