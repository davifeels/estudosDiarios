package fundamentos; 

import java.util.Scanner; 


public class impaOuPar {

    public static void main(String[] args) {

        // Cria o Scanner pra capturar entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt(); // Lê um número inteiro e armazena na variável 'numero'

        // Verifica se o número é par ou ímpar usando o operador de módulo (%)
        if (numero % 2 == 0) {
            // Se o resto da divisão por 2 for 0, é par
            System.out.println("O número " + numero + " é PAR.");
        } else {
            // Caso contrário, é ímpar
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        // Fecha o Scanner (boa prática)
        entrada.close();
    }
}
