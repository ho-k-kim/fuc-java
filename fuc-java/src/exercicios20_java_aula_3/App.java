package exercicios20_java_aula_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Simule o gerenciamento de uma playlist de músicas usando uma List<String>. 
		 * O sistemafunciona em loop com um menu completo, combinando todos os métodos estudados.
		 * 
		 */
		List<String> musicas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean interruptor = true;
		int opcao;
		int posicao;
		String busca;
		char confirmacao;
				
		do {
			System.out.println("=== PLAYLIST MANAGER ===\n");
			System.out.println(" 1-Adicionar música no final  —  add(musica)\n 2-Inserir em posição específica  —  add(indice, musica)\n "
					+ "3-Remover pelo nome  —  remove(musica) \n 4-Mover música: remove de uma posição, add em outra \n 5-Buscar  —  contains()"
					+ " + indexOf() para mostrar posição \n 6-Exibir playlist completa com numeração  —  get() em loop\n 7-Limpar playlist  —  clear() com confirmação\n "
					+ "8-Embaralhar\n 9-Sair\n");
			opcao = scan.nextInt();scan.nextLine() ;
			
			switch(opcao) {
			case 1:
				System.out.println("Digita a Musica adicionar ao final:\n");
				musicas.add(scan.nextLine());
				break;
			case 2:
				System.out.println("Inserir em posição específica  —  add(indice, musica)");
				System.out.println("A posição da música adicionar:");
				posicao = scan.nextInt();scan.nextLine();
				if(musicas.isEmpty()==true && posicao!=1) { 
					do {
						System.out.println("Posição invalida, posição permitida de 1");
						System.out.println("A posição da música adicionar:");
						posicao = scan.nextInt();scan.nextLine();
					}while((musicas.isEmpty()==true && posicao!=1)==true);
				}
					else if(posicao<1||posicao>musicas.size()) {
					do {
						System.out.println("Posição invalida, posição permitida de 1 a "+ (musicas.size()+1));
						System.out.println("A posição da música adicionar:");
						posicao = scan.nextInt();scan.nextLine();
					}while(posicao<1||posicao>musicas.size()==true);
				}
				
					System.out.println("O nome da música adicionar:");
					musicas.add((posicao-1),scan.nextLine());
					System.out.println(musicas);				
				break;
			case 3:
				System.out.println("Digite a música a remove");
				System.out.println(musicas);
				musicas.remove(scan.nextLine());
				System.out.println(musicas);
				
				break;
				
			case 4:
				System.out.println("Mover música: remove de uma posição, add em outra");
				System.out.println(musicas);
				System.out.println("Digite o nome da musica:");
				busca=scan.nextLine();
				musicas.remove(busca);
				System.out.println("Digite a nova posicao:");
				posicao=scan.nextInt();
				musicas.add((posicao-1),busca);
				System.out.println(musicas);
				
				break;
			case 5:
				System.out.println(musicas);
				System.out.println("Digite a musica a buscar :");
				busca = scan.nextLine();
				if(musicas.contains(busca)==true) {
					System.out.println(busca +" - Musica encontrada na posição "+(musicas.indexOf(busca)+1));
					System.out.println(musicas);	
				}
				System.out.println(busca +" - Musica não encontrada! ");
				System.out.println(musicas);	
				
				
				break;
			case 6:
				System.out.println("=======================================\n");
				System.out.println("PLAYLIST\n");
				System.out.println("=======================================\n");
				
				for(int i=0;i<musicas.size();i++) {
					
					System.out.println((i+1)+" - "+musicas.get(i));
				}
						
				
				break;
			case 7:
				if(musicas.isEmpty()) {
					System.out.println("Playlist, já está vazia!");
				}
				else {
					System.out.println("Confirma a limpara a playlist ( 's' para confirmar)\n");
					confirmacao= scan.next().charAt(0);
					if(confirmacao=='S' || confirmacao=='s') {
						musicas.clear();
						if(musicas.isEmpty()) {
							System.out.println("Playlist vazia!");
						}
					}
					System.out.println(musicas);
				}
				
				
				break;
			case 8:
				 Collections.shuffle(musicas);
				 System.out.println("=======================================\n");
				 System.out.println("PLAYLIST\n");
				 System.out.println("=======================================\n");
				 	for(int i=0;i<musicas.size();i++) {
						
						System.out.println((i+1)+" - "+musicas.get(i));
					}
										
					break;
				

			case 9:
				System.out.println("Até logo!");
				interruptor = false;
				break;
			
			default: 
				System.out.println("Opção Inválida");
			}
			
			
			
			
			
		} while(interruptor);

	}

}
