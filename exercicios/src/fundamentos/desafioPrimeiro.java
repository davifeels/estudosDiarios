package fundamentos;

import java.util.Scanner;

public class desafioPrimeiro {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Cria o scanner para ler entradas do usu�rio

        		// Primeiro sal�rio
        System.out.print("Qual o seu primeiro sal�rio? ");
        String salario1 = sc.nextLine();
        salario1 = salario1.replace(".", "").replace(",", "."); // Ajusta o formato para decimal
        double s1 = Double.parseDouble(salario1);

        		// Segundo sal�rio
        System.out.print("Qual o seu segundo sal�rio? ");
        String salario2 = sc.nextLine();
        salario2 = salario2.replace(".", "").replace(",", ".");
        double s2 = Double.parseDouble(salario2);

        		// Terceiro sal�rio
        System.out.print("Qual o seu terceiro sal�rio? ");
        String salario3 = sc.nextLine();
        salario3 = salario3.replace(".", "").replace(",", ".");
        double s3 = Double.parseDouble(salario3);

        		// C�lculo da m�dia
        double media = (s1 + s2 + s3) / 3;

        		// Exibe a m�dia com 2 casas decimais//
        System.out.printf("A m�dia dos seus sal�rios �: %.2f\n", media);

        sc.close(); // Fecha o scanner
    }

}
//                                 DESAFIO TESTE, NAO SEI SE EST� CERTO