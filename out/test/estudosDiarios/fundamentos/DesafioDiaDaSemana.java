package fundamentos;
import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Entrada do usuário

        System.out.println("Digite o dia da semana: ");
        String dia = entrada.next(); // Lê o dia digitado

        // Verifica o dia da semana e imprime o número correspondente
        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println("1 - Domingo");
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2 - Segunda");
        } else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
            System.out.println("3 - Terça");
        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("4 - Quarta");
        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("5 - Quinta");
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("6 - Sexta");
        } else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
            System.out.println("7 - Sábado");
        } else {
            System.out.println("Dia inválido!");
        }

        entrada.close(); // Fecha o Scanner
    }
}
