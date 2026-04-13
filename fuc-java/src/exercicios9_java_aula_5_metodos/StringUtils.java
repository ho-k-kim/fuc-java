package exercicios9_java_aula_5_metodos;

import java.util.Scanner;

public class StringUtils {

	public static int contarVogais(String s){
		 	Scanner scan = new Scanner(System.in);
			//String palavra="";
			int vogal=0;
			//System.out.println("Digite uma palavra");
			//palavra = scan.nextLine();
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					vogal +=1;
				scan.close();
					
				}
								
			 }
			return vogal;
	}
	
	
	public static String  inverter(String s){
	 	Scanner scan = new Scanner(System.in);
		//String palavra="";
	 	StringBuilder sb = new StringBuilder(s);
	 	s= sb.reverse().toString();
		return s;
}
	
	public static String  isPalindromo(String s) {
	 	Scanner scan = new Scanner(System.in);
		//String palavra="";
	 	if(StringUtils.inverter(s).equalsIgnoreCase(s)) {
	 		return "Sim";
	 	 		
	 	}
	 	else { 
	 		return "Não";
	 	}
	 		
		
}
	
	
	
	
}
			
	
	 

