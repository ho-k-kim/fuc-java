package loopFor;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Usando For
		
			Scanner scan = new Scanner(System.in);
			boolean inter = true;
			int numero=0;
			
			
			
			for(int i = 1;i<=150;i+=3) {
				System.out.println("Ola mundo");
				System.out.println(i +" " + ((numero++)+1));
			}
		
		scan.close();

	}

}
