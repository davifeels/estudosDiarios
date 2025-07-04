package fundamentos.tela;
import java.util.Scanner;

public class TelaLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usuário e senha pré-definidos
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.println("====== TELA DE LOGIN ======\n");

        System.out.print("Usuário: ");
        String usuarioDigitado = sc.nextLine();

        System.out.print("Senha: ");
        String senhaDigitada = sc.nextLine();

        // Verifica se usuário e senha estão corretos
        if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("\nLogin realizado com sucesso! ?");
        } else {
            System.out.println("\nUsuário ou senha incorretos. ?");
        }

        sc.close();
    }
}
