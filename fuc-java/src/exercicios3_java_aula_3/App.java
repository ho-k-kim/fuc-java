package exercicios3_java_aula_3;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie dois arrays de inteiros com 4 posições cada. Preencha o primeiro com os valores 10, 20,30, 40.
		 * Use Arrays.fill() para preencher o segundo inteiro com 0. Compare os dois com Arrays.equals() 
		 * e exiba o resultado. Depois preencha o segundo com os mesmos valores do primeiro manualmente e compare novamente
		 * 
		 */

		int [] numeros1 = {10,20,30,40};
		int [] numeros2 = new int [4];
		Arrays.fill(numeros2, 0);
		System.out.println("numeros1 :"+Arrays.toString(numeros1)+"\n"+ "numeros2 :"+Arrays.toString(numeros2)+"\n");
		System.out.println(Arrays.equals(numeros1, numeros2));
		numeros2 [0]= 10;
		numeros2 [1]= 20;
		numeros2 [2]= 30;
		numeros2 [3]= 40;
		System.out.println("numeros1 :"+Arrays.toString(numeros1)+"\n"+ "numeros2 :"+Arrays.toString(numeros2)+"\n");
		System.out.println(Arrays.equals(numeros1, numeros2));
	
		
	}

}
