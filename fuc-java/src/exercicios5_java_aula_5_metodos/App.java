package exercicios5_java_aula_5_metodos;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero:");
		num = scan.nextInt();
		//int[] t = gerarTabela(num);
		printarTabela(num);

		
		
	scan.close();
	}
	public static int[]  gerarTabela(int num) {
		 int[] tabela = new int[10];
		 for(int i=0;i<10;i++) {
			 tabela[i] = num*(i+1);
		 }
		 return tabela;
	}
	public static void  printarTabela(int num) {
		int[] t= gerarTabela(num);
		System.out.println("=====TABUADA 10 DO NÚMERO "+num+" =====\n");
		for(int i=0; i<10;i++) {
			 System.out.println(num+" X " + (i+1)+" = "+ t[i]);
		 }
		 
	}

	}

