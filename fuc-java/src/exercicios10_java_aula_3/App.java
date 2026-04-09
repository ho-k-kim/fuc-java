package exercicios10_java_aula_3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um ArrayList de inteiros. Adicione 4 números. Verifique se a lista está
		 * vazia com isEmpty() e exiba o resultado. Use clear() para esvaziar a lista.
		 * Verifique isEmpty()novamente. Adicione 2 novos números para provar que a 
		 * lista pode ser reutilizada após o clear()
		 */

		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		System.out.println("A lista de números está vazia : "+ numeros.isEmpty());		
		numeros.clear();
		System.out.println("A lista de números está vazia : "+ numeros.isEmpty());
		numeros.add(100);
		numeros.add(200);
		System.out.println("A lista Final: "+ numeros);		
		System.out.println("A lista de números está vazia : "+ numeros.isEmpty());	
		
	}

}
