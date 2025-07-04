package fundamentos;

import java.util.Scanner;

public class estudo0407 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu time?");
        String time = sc.nextLine();  // Lê a linha inteira digitada

        if (time.equalsIgnoreCase("Corinthians")) {
            System.out.println("Você é sofredor raiz! Vai, Corinthians!");
        } else if (time.equalsIgnoreCase("Palmeiras")) {
            System.out.println("Não gosto muito do Palmeiras, mas respeito kkk.");
        } else {
            System.out.println("Legal! Cada um com seu time. Respeito é tudo!");
        }

        sc.close(); // Sempre bom fechar o Scanner
    }
}

