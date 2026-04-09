package exercicios3_java_aula_1_parte3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*Crie um programa que simule o controle de acesso a um laboratório. O sistema deve coletar
		as informações do indivíduo e, com base nelas, decidir se o acesso é permitido ou negado
		para cada nível do laboratório.
		Dados que o sistema deve solicitar
		Idade
		Número inteiro — anos completos do indivíduo
		Funcionário?
		Possui crachá?
		1 para Sim  |  2 para Não
		1 para Sim  |  2 para Não
		Nível desejado
		Fluxo de Verificação
		Inteiro de 1 a 4 — nível do laboratório
		1º — Verificação de idade (if/else): se o indivíduo tiver menos de 16 anos o acesso é
		imediatamente negado e o programa encerra. Se tiver 16 anos ou mais, avança para a
		autenticação de nível.
		2º — Verificação do nível (switch): após passar pela checagem de idade, o switch avalia o
		nível desejado e aplica as regras específicas de cada nível usando if-else if-else internos.
		Regras por Nível de Acesso
		Nível 1
		Funcionário   OU   possui crachá
		Nível 2
		Nível 3
		Somente funcionário (crachá não é suficiente)
		Funcionário   E   possui crachá
		Nível 4
		Funcionário   E   possui crachá   E   senha correta  (senha: 4521)
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int idade=0;
		int funcionario;
		int cracha;
		int nivel;
		int senha = 4521;
		int senhaAcesso;
		
		
		do {

			System.out.println("====================================");
			System.out.println(" CONTROLE DE ACESSO — LABORATORIO");
			System.out.println("====================================\n");
			System.out.println("Informe sua idade:");
			idade = scan.nextInt();
			
			if(idade<16) {
				System.out.println("======== ACESSO NEGADO =============\n"
						+ "\rMotivo: Menor de 16 anos.\n "
						+ "\rContate responsável\n");
			}
			else if(idade>=16) {
				
				System.out.println("Voce e funcionario? (1-Sim / 2-Nao):");
				funcionario = scan.nextInt();
				System.out.println("Voce possui cracha? (1-Sim / 2-Nao):");
				cracha = scan.nextInt();
				System.out.println("Qual nivel do laboratorio deseja acessar? (1 a 4):");
				nivel = scan.nextInt();
				switch (nivel) {
				case 1: { if (funcionario == 1 || cracha == 1) 
					
					System.out.printf("======== ACESSO LIBERADO ============\n Bem-vindo ao laboratório Nível  %d  !\n", nivel);
				}; break; 		
				case 2: { if (funcionario == 1 ) { 
					
					System.out.printf("======== ACESSO LIBERADO ============\n Bem-vindo ao laboratório Nível  %d  !\n", nivel);
				}
						else if(funcionario !=1 && cracha == 1) {
					System.out.printf("======== ACESSO NEGADO ============\n Somente funcionário (crachá não é suficiente) para laboratório Nível  %d  !\n", nivel);
				}
				}; break; 	
				case 3: { if (funcionario == 1 && cracha ==1  ) { 
					
					System.out.printf("======== ACESSO LIBERADO ============\n Bem-vindo ao laboratório Nível  %d  !\n", nivel);
				}
					else if(funcionario ==1 || cracha == 1) {
					System.out.printf("======== ACESSO NEGADO ============\n Somente funcionário com crachá para laboratório Nível  %d  !\n Cracha não identificado\n", nivel);
				}
				}; break; 	
				case 4: { 
					System.out.println("Digite a Senha: ");
					senhaAcesso = scan.nextInt();
					if (funcionario == 1 && cracha ==1 && senhaAcesso == senha  ) { 
					System.out.printf("======== ACESSO LIBERADO ============\n Bem-vindo ao laboratório Nível  %d  !\n", nivel);
				}
					else if(funcionario ==1 || cracha == 1) {
					System.out.printf("======== ACESSO NEGADO ============\n Somente funcionário com crachá  e senha para laboratório Nível  %d  !\n", nivel);
				}
				}; break; 	
				default:{
					System.out.println("======== ACESSO NEGADO ============");
				}
	
				}
			}
			
		} while(idade>=16);
				
		scan.close();
		
	}
		

}
