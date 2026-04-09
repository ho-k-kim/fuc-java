package exercicios7_java_aula_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um ArrayList com os nomes dos dias da semana (segunda a domingo). Peça ao usuário um número de 1 a 7 
		 * e exiba o dia correspondente usando get(). Use if-else para validar se o número digitado está no intervalo válido
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int numero;
		List<String> dias = new ArrayList<>();
		dias.add("Segunda");
		dias.add("Terça");
		dias.add("Quarta");
		dias.add("Quinta");
		dias.add("Sexta");
		dias.add("Sábado");
		dias.add("Domingo");
				
		System.out.println(dias);
		System.out.println("Digite um numero de 1 a 7 :");
		numero = scan.nextInt();
		if(numero<=0 || numero >7) {
			System.out.println("Intervalo não permitido");
		}else {
			System.out.println("O dia da semana é :"+dias.get(numero-1));
			
		}
		
		
		
		
		
		
		scan.close();
		
	}

}
