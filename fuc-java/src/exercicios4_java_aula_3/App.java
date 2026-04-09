package exercicios4_java_aula_3;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Leia 8 temperaturas (double) digitadas pelo usuário. 
		 * Use Arrays.copyOf() para criar duas cópias: uma com 
		 * os primeiros 4 valores e outra com os primeiros 4 expandida
		 * para 10 elementos. Ordene cada cópia com sort() e exiba as
		 * três — original, cópia menor e cópia maior
		 */

		Scanner scan = new Scanner(System.in);
		
		double[] temperaturas = new double[8];
		
		for(int i=0; i<8;i++) {
			System.out.println("Digite temperatura :");
			temperaturas[i] = scan.nextDouble();						
		}
		double[] temperaturas1 = Arrays.copyOf(temperaturas, 4);
		Arrays.sort(temperaturas1);
		double[] temperaturas2 = Arrays.copyOf(temperaturas1, 10);
		System.out.println("Original :" + Arrays.toString(temperaturas));
		System.out.println("Menor Ordenada :" + Arrays.toString(temperaturas1));
		System.out.println("Maior :" + Arrays.toString(temperaturas2));
		
		
		scan.close();
		
	}

}
