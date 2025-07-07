package fundamentos;
import java.util.Scanner;

public class test011 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String usuarioCorreto = "admin";
		String senhaCorreta = "davi080401";
		
		System.out.println("====== TELA DE LOGIN ====== ");
		
		System.out.print("Usuário: ");
		String usuarioDigitado = scanner.nextLine();
		
		System.out.print("Senha: ");
		String senhaDigitada = scanner.nextLine();		
		
		if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
		
		System.out.println("Login bem-sucedido! Bem vindo, " + usuarioDigitado + "!");
	}   else {
		System.out.println("Usuário ou senha incorretos. Tente novamente" + "!");
	}
		
		
		scanner.close();
		
		
	}

}
