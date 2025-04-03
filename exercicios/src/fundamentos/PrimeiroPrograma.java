package fundamentos;
import java.util.Scanner; 

public class PrimeiroPrograma {

	
		public static void main(String[] args) {
			
			//Escola entre times 
			
			// usuario escolherá entre dois times
			
			// usuario deverá escolher entre time A e time B;
			
			// Atraves de um input de String 
			
			// Verificar a entrada do usuario
			
			// se a entrada do usuario for corinthians escreva vai corinthians
			
			// se a entrada for botafogo manda ir pra casa do carai
			
			
			
			String a = "Corinthians";
			String b = "Botafogo";
			String c;
			
			System.out.println("Escolha seu time favorito entre SCCP ou VARMEIRAS:"); 
			
			Scanner sc = new Scanner(System.in);
			
			
			c = sc.next();
			System.out.println(c);
			
			if (c.equals(a)) {
				System.out.println("Vai corinthians");
			}
			else if (c.equals(b)) {
				
				System.out.println("Vai pra casa do carai");
			}
			else {
				System.out.println("Campeao");
			}			
			
			sc.close();
	
		}
}