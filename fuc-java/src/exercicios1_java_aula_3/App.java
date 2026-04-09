package exercicios1_java_aula_3;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		/*
		 * Declare um array de 6 inteiros. Use Arrays.fill() para preencher todos com o valor 7. Exiba o
		 * array completo com Arrays.toString(). Em seguida, altere manualmente os índices 0 e 5 para
		 * o valor 99 e exiba o array novamente
		 * 
		 */
		int [] numeros = new int[6];
		Arrays.fill(numeros,7);
		System.out.println(Arrays.toString(numeros));
		numeros[0] = 99;
		numeros[5] = 99;
		System.out.println(Arrays.toString(numeros));
		
		
	}

}
