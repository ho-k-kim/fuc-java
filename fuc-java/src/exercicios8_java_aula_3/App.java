package exercicios8_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um ArrayList com 6 linguagens de programação.
		 *  Peça ao usuário que digite um nome e verifique se ele está na lista usando contains(). 
		 *  Repita a busca 3 vezes usando um loop for.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		List<String> linguagens = new ArrayList<>();
		
		linguagens.add("java");
		linguagens.add("python");
		linguagens.add("javascript");
		linguagens.add("c");
		linguagens.add("kotlin");
		linguagens.add("swift");
		String busca;
		
		System.out.println("Linguagens :"+ linguagens+"\n");
		for(int i=0;i<3;i++) {
			System.out.println("Busca " + (i+1) + " -Digite um nome de linguagem :");
			busca =scan.nextLine();
			if(linguagens.contains(busca)==true) { 
				System.out.println(busca + " encontrada na lista!");
			}else {
				System.out.println(busca + " não encontrada na lista!");
			}
						
		}
				
		scan.close();
		
	}

}
