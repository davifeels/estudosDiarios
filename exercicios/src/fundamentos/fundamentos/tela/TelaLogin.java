package fundamentos.tela;
import java.util.Scanner;

public class TelaLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usu�rio e senha pr�-definidos
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.println("====== TELA DE LOGIN ======\n");

        System.out.print("Usu�rio: ");
        String usuarioDigitado = sc.nextLine();

        System.out.print("Senha: ");
        String senhaDigitada = sc.nextLine();

        // Verifica se usu�rio e senha est�o corretos
        if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("\nLogin realizado com sucesso! ?");
        } else {
            System.out.println("\nUsu�rio ou senha incorretos. ?");
        }

        sc.close();
    }
}
