package exercicios3_java_aula_5_metodos;

import java.util.Scanner;

public class App {
	
	 public static boolean ehPar(int num){
		return num%2==0; 
	 }

	public static void main(String[] args) {
		/*
		 * Crie um método public static boolean chamado ehPar que receba um inteiro 
		 * e retorne true se for par, false se for ímpar.
		 * No main(), leia 5 números em loop e use o método para classificar cada um
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite o número:\n");
			num= scan.nextInt();
			if(ehPar(num)) {
				System.out.println(num+" --> é par\n");
			}else {
				System.out.println(num+" --> é impar\n");
			}
			
		}
			scan.close();
		}
}
	




