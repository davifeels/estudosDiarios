package fundamentos;
import java.util.Scanner;

public class contolesIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Cores principais
        String color = "\u001B[31m"; // vermelho
        String reset = "\u001B[0m";

        String frase = "Davi Anderson Batista";
        String idade = "24 anos";
        String cidade = "Cidade: " + color + "Brasília" + reset;
        String relacionamento = "Solteiro";

        String nome = "Davi Anderson Batista";
        String fraseComNomeMaiusculo = frase.replace(nome, nome.toUpperCase());
        nome = nome.replace("Batista", "Silva");


        System.out.println(color + fraseComNomeMaiusculo + reset);
        System.out.println("Davi tem: " + color + idade + reset);
        System.out.println(cidade);
        System.out.println("Status de relacionamento: " + color + relacionamento + reset);


        System.out.println("///////////////////////////////////////////");
        System.out.println("//           NOTA FINAL                  //");
        System.out.println("///////////////////////////////////////////");


        String color1 = "\u001B[34m";
        String reset2 = "\u001B[0m";
        String color2 = "\u001B[33m";
        String reset3 = "\u001B[0m";
        String color3 = "\u001B[36m";
        String reset4 = "\u001B[0m";

        System.out.print(color1 + "Informe a média: " + reset2);
        double media = entrada.nextDouble();

        if (media >= 0.0 && media <= 10.0) {
            if (media >= 7.0) {
                System.out.println("Aprovado.");
                System.out.println(color2 + "Parabéns, FOI PROMOVIDO A BORBADILLO KROKODILE!!!" + reset3);
            } else if (media >= 4.5) {
                System.out.println(color + "Recuperação!!!" + reset);
                System.out.println("Estude mais um pouco, tralalero tralala");
            } else {
                System.out.println(color + "REPROVADO!!!!!!!!" + reset);
                System.out.println(color2 + "Cara, sai do zap, vai estudaaaaaaar" + reset3);
            }
        } else {
            System.out.println(color3 + "Média inválida! Informe um valor entre 0 e 10." + reset4);
        }

        entrada.close();
    }
}
