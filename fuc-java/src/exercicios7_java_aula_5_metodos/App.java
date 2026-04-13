package exercicios7_java_aula_5_metodos;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 *  Crie três métodos que trabalham juntos: (1) calcularMedia(double[] notas)
		 *  que retorna a média das notas; (2) classificar(double media) que retorna
		 *  a String da situação; (3) gerar Relatorio(String nome, double[] notas) que
		 *  chama os dois anteriores e imprime o relatório completo. No main(), leia
		 *  nome e notas
		 */

		Scanner scan = new Scanner(System.in);
	
		String nome="";
		double nota=0;
		
		geraRealtorio(nota, nome);
		scan.close();	
		
		
	}
	
	public static double calcularMedia(double nota, String nome) {
		Scanner scan = new Scanner(System.in);
		double[] notas= new double[4];
		double soma=0;
		double media;
		System.out.println("=============NOTAS=============\n");
		System.out.println("Digite o nome do Aluno:");
	
		nome = scan.nextLine(); 
		
		for(int i=0; i<notas.length;i++) {
			System.out.println("Digite a Nota "+(+i+1)+" :\n");
			nota = scan.nextDouble();
			notas[i] = nota;
			soma =notas[i]+ soma; 
			
		}
		System.out.println("\n====================================\n");
		System.out.println("RELATORIO DE DESEMPENHO\n");
		System.out.println("====================================\n");
		System.out.println("Nome :"+nome+"\n");
		System.out.println("Notas :"+Arrays.toString(notas));
		media = soma/notas.length;
	
		scan.close();
	 return media; 
	}
	
	
	public static String classificar(double media) {
		String situacao = "";
		if(media >=7) {
			situacao ="Aprovado\n";
		}
		else if(media>=5) {
			situacao ="Recuperação\n";
		}
		else if(media <5) {
			
			situacao ="Reprovado\n";
		}
		
		return situacao;
		} 
	
	public static void geraRealtorio(double nota, String nome) {
	
	Scanner scan = new Scanner(System.in);
	
	double media;
		
	media = calcularMedia(nota,nome);
	System.out.printf("\rMedia : %.2f\n \rSituação : %s",media,classificar(media));
	scan.close();		
	}
	
}
