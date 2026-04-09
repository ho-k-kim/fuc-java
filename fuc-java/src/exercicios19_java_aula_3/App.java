package exercicios19_java_aula_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie uma List<String> com 5 nomes. Exiba na ordem de inserção, depois ordene com
		 * Collections.sort() e exiba crescente, depois use Collections.reverse() e exiba decrescente.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		List<String> nomes = new ArrayList<>();

		System.out.println("Digite o nome 5 nomes--\n");
			for(int i=0; i<5;i++) {/**/
			System.out.println("Digite o nome "+(i+1)+":\n");
			nomes.add(scan.nextLine());			
			
		/**/}
			System.out.println("Inserção :"+nomes);
			Collections.sort(nomes);
			System.out.println("Crescente :"+nomes);
			Collections.reverse(nomes);
			System.out.println("Decrescente :"+nomes);
			

		scan.close();
		
	}

}
