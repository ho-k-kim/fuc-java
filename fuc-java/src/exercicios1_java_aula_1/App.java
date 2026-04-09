package exercicios1_java_aula_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 *Crie um programa que simule o preenchimento de um fichário de cadastro de uma pessoa 
		 *em um sistema. 
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
		System.out.println("====================================");
		System.out.println("       SISTEMA DE FICHÁRIO");
		System.out.println("====================================");
		System.out.println("Preencha as informações abaixo.");
		System.out.println("Digite o nome :");
		nome = scan.nextLine();
		System.out.println("Digite o idade :");
		idade = scan.nextInt();
		System.out.println("Digite o cpf :");
		cpf = scan.next();
		System.out.println("Digite o sexo :");
		sexo = scan.next().charAt(0);
		System.out.println("Digite o altura :");
		altura = scan.nextDouble();
		System.out.println("Digite o peso :");
		peso = scan.nextDouble();
		System.out.println("Digite o estado civil :");
		estadoCivil = scan.next();
		System.out.println("email :");
		email = scan.next();
		System.out.println("========== FICHA CADASTRADA ==========");
		System.out.printf("\r Nome :%s\n Idade :%d\n CPF :%s\n Sexo :%s\n Altura :%.2f\n Peso :%.2f\n Estado Civil :%s\n email :%s\n", nome,idade,cpf,sexo,altura,peso,estadoCivil,email);
		scan.close();
		

	}

}
