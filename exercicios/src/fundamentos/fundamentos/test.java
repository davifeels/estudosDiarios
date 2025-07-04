package fundamentos;
import java.util.Scanner; 

public class test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Digite o nome de um time:");
		 String time = sc.nextLine(); 
		
		if (time.equalsIgnoreCase("Corinthians")) {
			System.out.println("Eu tbm sou Corinthians");
		}
			
			else {
				System.out.println("Desculpe, só aceitamos se for da Fiel");
		}
		
		
		
		
		
		sc.close();
		
		
	}}