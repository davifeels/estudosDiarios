package fundamentos;

import java.util.Scanner;

public class TipoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] times = {"Corinthians", "Flamengo", "PorCus", "Santos", "Fluminense"};

        System.out.println("Times Brasileiros:");
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + " - " + times[i]);
        }

        System.out.print("Digite o número do seu time: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("VAI CORINTHIANS");
            
        } else if (escolha == 2) {
            System.out.println("Eco, o Varmengo");
            
        } else if (escolha == 3) {
            System.out.println("porCÙs");
            
        } else if (escolha == 4) {
            System.out.println("Sereias da vila");
            
        } else if (escolha == 5) {
            System.out.println("Serie C kkkkkk");
            
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
