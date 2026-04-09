package exercicios16_java_aula_3;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Leia 10 números inteiros entre 1 e 5 e armazene em um array. 
		 * Depois, use um segundo array de 5 posições (índices 0 a 4 representando os valores 1 a 5) 
		 * para contar quantas vezes cada número apareceu. Exiba o relatório de frequência ao final. 
		 */

		Scanner scan = new Scanner(System.in);
		int[] numeros1 = new int[10];
		int[] numeros2 = {1,2,3,4,5}; 
		int[] frequencias =new int[5];
		int numeroValido;
		Arrays.fill(frequencias,0);
		System.out.println("Frenquência :"+Arrays.toString(frequencias));
		System.out.println("Digite 10 numeros:\n");
		for(int i=0; i<numeros1.length;i++) {
			System.out.println("Número "+(i+1)+" - Digite um número de 1 a 5:");
			numeroValido = scan.nextInt();
			//System.out.println(i);
			
			if(numeroValido <1 || numeroValido>5){
				do {
				System.out.println("Número invalido!");
				System.out.println("Número "+(i+1)+" - Digite um número de 1 a 5:");
				numeroValido = scan.nextInt();
				}while(numeroValido <1 || numeroValido>5);
				numeros1[i]=numeroValido;
				//System.out.println(i);
				
			};
			numeros1[i] = numeroValido;
						
		}
		System.out.println("\nNúmeros Digitados: "+Arrays.toString(numeros1));
		for(int i=0; i<numeros2.length;i++) {
			for(int ii=0; ii<numeros1.length;ii++) {
				if(numeros2[i]==numeros1[ii]) { 
						frequencias[i] +=1;}
					}
			
			}
		
		System.out.println("\n\n====FREQUENCIA====\n");
		for(int i=0;i<numeros1.length;i++) {
			System.out.println("Número "+ numeros2[i]+" apareceu " +frequencias[i]+" vezes\n");
		}
			
		scan.close();}
				
		
	}


