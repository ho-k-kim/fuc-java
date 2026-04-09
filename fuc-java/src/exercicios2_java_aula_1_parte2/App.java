package exercicios2_java_aula_1_parte2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Crie um programaque simule o sistemade login e controle de acesso de umaempresa.
			O programadeve solicitar:
			• Nome do usuário
			• Código de perfil (número inteiro)
			• Senhade acesso (número inteiro)
			
			O sistema possui três perfis de acesso.Use Else-If paraverificar o código e a senha:
			• Perfil 1— Administrador: senhacorreta é 1234
			• Perfil 2 — Gerente: senhacorretaé 5678
			• Perfil 3 — Operador: senha corretaé 9012
			• Qualquer outro código: perfil inválido
			
			Para cada perfil com senhacorreta, exibaumamensagem de boas-vindas personalizadae as
			permissões do usuário. Se asenhaestiver errada, exiba mensagem de acesso negado.
			Permissões por Perfil
			• Administrador: Acesso total ao sistema
			• Gerente: Visualização de relatórios e cadastro de usuários
			• Operador: Apenas consultae registro de operações
		 */

		Scanner scan= new Scanner(System.in);
		
		String nome;
		int codigoPerfil;
		String perfil1="Administrador";
		String perfil2="Gerente";
		String perfil3="Operador";
		
		int senha1 = 1234;
		int senha2 = 5678;
		int senha3 = 9012;
		String permissao1 = "Acesso total ao sistema";
		String permissao2 = "Visualização de relatórios";
		String permissao3 = "cadastro de usuários";
		String permissao4 = "Consulta";
		String permissao5 = "Registro de Operações";
		int senhaAcesso;
		
		System.out.println("====================================");
		System.out.println("SISTEMA DE CONTROLE DE ACESSO");
		System.out.println("====================================");
		System.out.println("Digite o seu  nome :\n");
		nome = scan.nextLine();
		System.out.println("Digite codigo do perfil :\n");
		 codigoPerfil = scan.nextInt();
		System.out.println("Digite sua senha :\n");
		senhaAcesso = scan.nextInt();
		
		if((codigoPerfil==1 && senhaAcesso != senha1)||
				(codigoPerfil==2 && senhaAcesso != senha2)||
				(codigoPerfil==3 && senhaAcesso != senha3)
		) { 
			System.out.println("======== ACESSO NEGADO ==============\nSenha incorreta para o perfil informado.\n");
		}else if((codigoPerfil==1 && senhaAcesso == senha1)) {
			System.out.println("======== ACESSO LIBERADO ============");
			System.out.printf("Bem-vindo, %s!\n \rPerfil: %s\n \rPermissões:\n \r- %s",nome, perfil1, permissao1);
		}else if((codigoPerfil==2 && senhaAcesso == senha2)) {
			System.out.println("======== ACESSO LIBERADO ============");
			System.out.printf("Bem-vindo, %s!\n \rPerfil: %s\n \rPermissões:\n \r- %s \r- %s",nome, perfil2, permissao2, permissao3);
		}else if((codigoPerfil==3 && senhaAcesso == senha3)) {
			System.out.println("======== ACESSO LIBERADO ============");
			System.out.printf("Bem-vindo, %s!\n \rPerfil: %s\n \rPermissões:\n \r- %s \r- %s",nome, perfil3, permissao4, permissao5);
		}else {
			System.out.println("======== ACESSO NEGADO ==============\nSenha incorreta para o perfil informado.\n");
		}
		
				
		
		scan.close();
		
	}

}
