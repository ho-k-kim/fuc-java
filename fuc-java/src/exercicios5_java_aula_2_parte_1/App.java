package exercicios5_java_aula_2_parte_1;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programa que use um loop for para exibir somente os números pares entre 2 e 20,
		um por linha
		 * 
		 */

		//for(int i = 2; i <= 20; i += 2) {
		//	System.out.println(i);
		
		 for (int i = 1; i <= 20; i++) {
		 	if (i % 2 == 0) {
         	System.out.println(i);
    		}
		}
				
		
		
	}

}
