package formulario;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/* criando variáveis int; double; String; char; 	
		 * importado java.util 
		 * Importando blibioteca de input Scanner
		 * Uso do saída println e printf
		 * 
		 * 
		 */
		 
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		String cpf;
		char sexo;
		double altura;
		double peso;
		String estadoCivil;
		String email;
		
		
		System.out.println("=====Formulario=====");
		System.out.println("Digite o seu nome: ");
		nome = scan.nextLine();

		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		System.out.println("Digite seu CPF");
		cpf = scan.next();
		System.out.println("Digite o seu sexo: (M/F)");
		sexo = scan.next().charAt(0);
		System.out.println("Digite sua altura");
		altura = scan.nextDouble();
		System.out.println("Digite seu peso");
		peso = scan.nextDouble();
		System.out.println("Digite o seu estado civil: ");
		estadoCivil = scan.next();
		System.out.println("Digite o seu email: ");
		email = scan.next();
		
		System.out.println("=========Usuario=======");
		
		System.out.printf(" Nome: %s \n Idade: %d \n CPF: %s \n Sexo: %c \n Altura: %.2f \n Peso: %.2f"
				+ " \n EstadoCivil: %s \n email: %s",nome,idade,cpf,sexo,altura,peso,estadoCivil,email);
			
		scan.close();

	}

}
