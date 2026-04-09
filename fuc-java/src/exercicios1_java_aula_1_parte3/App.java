package exercicios1_java_aula_1_parte3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * 	Crie um programa que avalie o desempenho de um aluno em uma disciplina. O sistema deve
			solicitar as 4 notas do semestre (0–10) e o percentual de frequência (0–100). O programa
			calcula a média final e, com base na média e na frequência, classifica o aluno usando uma
			cadeia de if-else if-else com múltiplas condições.
				Regras de Classificação
					Aprovado com Distinção
						Média >= 9,0   E   Frequência >= 75%
					Aprovado
						Aprovado com Ressalva
							Média >= 7,0   E   Frequência >= 75%
							Média >= 7,0   E   Frequência entre 60% e 74%
					Recuperação
				Reprovado por Nota
							Média entre 5,0 e 6,9   OU   Frequência entre 60% e 74%
							Média < 5,0   E   Frequência >= 75%
			Reprovado por Falta
				
		 */

		Scanner scan = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		int frequencia;
		String situacao="Aprovado";
		String motivo="Frequência maior igual a 75%";
		
		System.out.println("===================================");
		System.out.println("  SISTEMA DE AVALIACAO ESCOLAR");
		System.out.println("===================================");
		
		System.out.println("Digite a nota 1 do semestre (0 a 10):");
		nota1 = scan.nextDouble();
		System.out.println("Digite a nota 2 do semestre (0 a 10):");
		nota2 = scan.nextDouble();
		System.out.println("Digite a nota 3 do semestre (0 a 10):");
		nota3 = scan.nextDouble();
		System.out.println("Digite a nota 4 do semestre (0 a 10):");
		nota4 = scan.nextDouble();
		System.out.println("Digite o percentual de frequencia (0 a 100):");
		frequencia = scan.nextInt();
		media=(nota1+nota2+nota3+nota4)/4;
		
		if(media<5) {
			situacao = "Reprovado";
			motivo =  "Por nota";}
		else if(frequencia<60) {
				situacao = "Reprovado";
				motivo =  "Por Frequencia";
		}
		else if(media>=9 && frequencia>=75){
			situacao = "Aprovado com distinção";
			motivo =  "Média igual ou maior a 9,00 e Frequência maior ou igual a 75%";
		}
		else if(media>=7 && frequencia>=75){
			situacao = "Aprovado";
			motivo =  "Média igual ou maior de 7,00 e Frequência maior ou igual a 75%";
		}
		else if(media>=7 && (frequencia >=60 && frequencia <= 74)){
			situacao = "Aprovado com Ressalva";
			motivo =  "Média igual ou maior de 7,00 e Frequência entre 60 e 74%";
		}
		else if((media >= 5 && media <=6.9) && (frequencia >=60 && frequencia <=74)) {
			situacao = "Recuperacao";
			motivo =  "Média entre 5,00 e 6,90 e Frequência entre 60% e 74%";
			
		}
		
				
		System.out.println("\n===== RESULTADO DA AVALIACAO ======\n");
		System.out.printf("\rMedia: %.2f\n \rFrequencia:%d%%\n \rSituação:%s\n \rMotivo:%s",media,frequencia,situacao, motivo);
		
				
		scan.close();
		
		
		
	}

}
