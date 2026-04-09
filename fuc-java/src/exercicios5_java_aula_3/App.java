package exercicios5_java_aula_3;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class App {

	public static void main(String[] args) {
		/*
		 * Leia 6 notas (double) de uma turma. Armazene em um array e calcule a média. Use
		 * Arrays.sort() para ordenar. Após a ordenação, extraia a menor nota (índice 0) e 
		 * a maior(índice length-1) sem usar nenhum loop extra para isso. Exiba a média, 
		 * a menor e a maior nota, além de uma mensagem indicando se a turma foi aprovada 
		 * em média (media >= 6.0) ou não
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		double[] notas= new double[6];
		double soma=0;
		double soma3=0;
		System.out.println("====================================\r\n"
				+ "   RANKING DE NOTAS DA TURMA\r\n"
				+ "====================================");
		for(int i=0; i<6;i++) {
			
			System.out.println("Digite a nota :");
			notas[i] = scan.nextDouble();
			soma +=notas[i];
		}
		System.out.println("Notas :"+Arrays.toString(notas)+"\n");
		Arrays.sort(notas);
		System.out.println("Notas ordenadas :"+Arrays.toString(notas)+"\n");
		System.out.println("Menor Nota :"+ notas[0]);
		System.out.println("Maior Nota :"+ notas[(notas.length-1)]);
		System.out.printf("Media : %.2f",(soma/notas.length));
		if((soma/notas.length)>=6) {
			System.out.println("\nSituacao: Turma APROVADA em media.");
		}else{
			System.out.println("\nSituacao: Turma REPROVADA em media.");
		} 
		System.out.println("====================================\r\n"
				+ " RANKING DAS MAIORES NOTAS DA TURMA\r\n"
				+ "====================================");
		double[] notas3 = Arrays.copyOfRange(notas,3,6);
		System.out.println("3 melhores Notas :"+Arrays.toString(notas3));
		for(int i=0; i<3;i++) {
			soma3 += notas3[i];
		}
		System.out.printf("\rMédia das 3 melhores notas : %.2f", (soma3/notas3.length));
		
		
		
		scan.close();

	}

}
