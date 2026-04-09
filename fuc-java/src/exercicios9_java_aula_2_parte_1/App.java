package exercicios9_java_aula_2_parte_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia 5 notas (double) do usuário, 
		 *armazene em um array, calcule a
		 *média final e exiba a situação do aluno com base na média.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		double[] notas = new double[5];
		double media=0;
		for(int i=0; i<5;i++) {
			System.out.println("Digite a nota"+(i+1)+":");
			notas[i] = scan.nextDouble();
			media += notas[i]/notas.length;
		}
		System.out.printf("Media Fincal = %.2f\n",media);
		if(media<5.00) {
			System.out.println("Situação: Reprovado\n");
		}else if(media>=7){
			System.out.println("Situação: Aprovado\n");
		}else if(media >=5.00 && media <7.00) {
			
			System.out.println("Situação: Recuperação\n");
		}
			
			
		scan.close();
		
		
	}

}
