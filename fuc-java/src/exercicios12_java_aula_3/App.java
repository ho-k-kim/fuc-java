package exercicios12_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie dois ArrayLists: um de nomes (String) e um de pontuações (Integer). 
		 * Leia 4 paresnome+pontuação do usuário. Use um loop for com get(i) 
		 * para exibir os pares lado a lado. Encontre e exiba o nome com a maior 
		 * pontuação sem usar sort() — use um if dentro do loop.
		 */

		Scanner scan = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		List<Integer> pontos = new ArrayList<>();
		
		nomes.add("Ana");
		nomes.add("Bruno");
		nomes.add("Carla");
		nomes.add("Diego");
		pontos.add(850);
		pontos.add(1200);
		pontos.add(970);
		pontos.add(760);
		int maiorPonto=0;
		int indiceVencedor=0;
		
		System.out.println("====================================\n"
				+          "	PLACAR DO TORNEIO\n"
				+ 		   "====================================\n");
		
		for(int i=0; i<nomes.size();i++) {
			System.out.println("Jogador "+(i+1)+" - nome: "+nomes.get(i)+" - pontos: "+pontos.get(i)+"\n");	
		}
		System.out.println("== RESULTADO ==");
		
		for(int i=0; i<nomes.size();i++) {
			System.out.println(nomes.get(i)+" - "+pontos.get(i)+" pts\n");	
		}
		
		for(int i=0; i<nomes.size();i++) {
			if(pontos.get(maiorPonto)<pontos.get(i)) {
				maiorPonto = i;
			}
			
		}
		System.out.println("Vencedor:"+nomes.get(maiorPonto)+" com "+pontos.get(maiorPonto)+" pontos!");
		
		pontos.set(3,1400);
System.out.println("\n== RESULTADO ==");
		
		for(int i=0; i<nomes.size();i++) {
			System.out.println(nomes.get(i)+" - "+pontos.get(i)+" pts\n");	
		}
		for(int i=0; i<nomes.size();i++) {
			if(pontos.get(maiorPonto)<pontos.get(i)) {
				maiorPonto = i;
			}
			
		}
		System.out.println("Vencedor:"+nomes.get(maiorPonto)+" com "+pontos.get(maiorPonto)+" pontos!");
					
		scan.close();
		
	}

}
