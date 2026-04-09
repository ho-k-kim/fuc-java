package exercicios10_java_aula_2_parte_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que exiba um menu de opções em loop 
		 * usando while. O menu deve ficar 
		 * aparecendo até o usuário escolher a opção de sair.
		 *  Use switch para executar a ação de cada opção.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		String nome;
		int numero;
		int opcao1=0;
		int opcao2=0;
		int opcao3=0;
		int opcao4=0;
		int opcao5=0;
		while (opcao != 4) {
		    
			System.out.println("\r==================================\n");
			System.out.println(" MENU INTERATIVO JAVA\n");
			System.out.println("==================================\n");
			
			System.out.println("==== MENU ====");
		    System.out.println("1 - Saudacao");
		    System.out.println("2 - Dobro");
		    System.out.println("3 - Par ou Impar");
		    System.out.println("4 - Sair");
		    System.out.println("5 - Historico");
		    System.out.println("Digite a Opção:");
		    opcao = scan.nextInt();scan.nextLine();
		    switch (opcao) {
		    	case 1:{System.out.println("Digite seu nome:\n ");
		    	nome = scan.nextLine();
		    	opcao1 +=1;
		    	System.out.printf("Olá. %s ! Bem-vindo ao sistema.\n ", nome);/* pede nome e sauda */ 
		    	}break;
		    	case 2: {System.out.println("Digite um numero:\n ");
		    	numero = scan.nextInt();
		    	opcao2 +=1;
		    	System.out.printf("O dobro do número %d é: %d\n ", numero, (numero*2));/* pede nome e sauda */ 
		    	}/* pede num, exibe dobro */ break;
		    	case 3:  {System.out.println("Digite um numero:\n ");
		    	numero = scan.nextInt();
		    	opcao3 +=1;
		    	if((numero %2)== 0) {
		    	System.out.printf("O número %d é par\n", numero);  
		    	}else {
		    		System.out.printf("O número %d é impar ", numero);
		    	}
		    		
		    	};break;
		    	case 4: System.out.println("Ate logo!");
		    	opcao4 +=1; break;
		    	case 5: {
		    		System.out.println("============================");
		    		System.out.println("HISTORICO DAS OPERAÇÕES");
		    		System.out.println("============================");
		    		System.out.println("Opção 1: "+ opcao1+"x\n"+"Opção 2: "+ opcao2+"x\n"
		    		+"Opção 3: "+ opcao3+"x\n"+"Opção 4: "+ opcao4+"x\n"+"Opção 5: "+ opcao5+"x\n");
		    		opcao5 +=1;}; break;
		    			
		    	default: System.out.println("Opcao invalida.");
		} 
		}
		scan.close();
		

	}

}
