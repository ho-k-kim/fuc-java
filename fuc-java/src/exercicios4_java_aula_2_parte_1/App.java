package exercicios4_java_aula_2_parte_1;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que some todos os números de 1 a 100 usando um loop for e exiba o
			resultado ao final.
		 * 
		 */
		
		int soma=0;
		
		for(int i=1; i<=100;i++) {
		soma += i;  // soma = soma + i (ou soma += i)
		System.out.println("Somando 1 a 100:...");	
	}
	System.out.println("Soma Total:" + soma);

}
}
