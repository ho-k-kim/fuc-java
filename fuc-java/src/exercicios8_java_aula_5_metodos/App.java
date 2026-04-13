package exercicios8_java_aula_5_metodos;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		String cpf;
		int idade;
		System.out.println("Digite nome:");
		nome = scan.nextLine();
		System.out.println("Digite cpf:");
		cpf = scan.nextLine();
		System.out.println("Digite idade:");
		idade = scan.nextInt();
		//cadastrar(cpf,idade, nome) ;
		System.out.println(cadastrar(cpf,idade, nome));
		

	}
	
	private static boolean validarCpf(String cpf) {
		
		return ( cpf.length() == 11 && cpf.matches("\\d+"));	
		}
	
	private static boolean validarIdade(int idade) {
		
		return (  idade >= 0 && idade <= 120);	
		}
		
		
	public static String cadastrar(String cpf, int idade, String nome) {
        
		if ((!validarCpf(cpf))){
    	   return  "Nome :" + nome +" CPF :"+cpf+" Idade :" +idade+
    			   "\nResultado: Erro: CPF invalido. Deve conter 11 digitos numericos.";
    	   
        }
        if(!validarIdade(idade)) {
 		   return 
 				  "Nome :" + nome +" CPF :"+cpf+" Idade :" +idade+
 				   "\nResultado: Erro: Idade invalida. Deve estar entre 0 e 120.";
 	   }
       return 
    		   "Nome :" + nome +" CPF :"+cpf+" Idade :" +idade+
    		   "\nResultado: Cadastro realizado com sucesso! Bem vindo!" + nome+".";
    		  
    }
 

}
	



