package exercicios8_java_aula_2_parte_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que declare um array de 5 nomes (String). Use um loop for para pedir ao
usuário que digite cada nome. Depois, use outro loop for para exibir todos os nomes
cadastrados
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		String[] nome = new String[5];
		System.out.println("====================================\n");
		System.out.println("CADASTRO DE NOMES\n");
		System.out.println("====================================\n");
		for(int i=0; i<nome.length;i++) {		
			System.out.println("Digite o nome"+(i+1)+" :");
			nome[i] = scan.nextLine();
			
		}
		
		System.out.println("====================================\n");
		System.out.println("NOMES CADASTRADOS \n");
		System.out.println("====================================\n");
		for(int i=0; i<nome.length;i++) {		
			System.out.println("Nome"+(i+1)+" :"+nome[i]);
		}
			
		scan.close();
	}

}
