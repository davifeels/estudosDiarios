package fundamentos; 

import java.util.Scanner; 


public class impaOuPar {

    public static void main(String[] args) {

        // Cria o Scanner pra capturar entrada do usu�rio
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usu�rio que digite um n�mero
        System.out.print("Digite um n�mero inteiro: ");
        int numero = entrada.nextInt(); // L� um n�mero inteiro e armazena na vari�vel 'numero'

        // Verifica se o n�mero � par ou �mpar usando o operador de m�dulo (%)
        if (numero % 2 == 0) {
            // Se o resto da divis�o por 2 for 0, � par
            System.out.println("O n�mero " + numero + " � PAR.");
        } else {
            // Caso contr�rio, � �mpar
            System.out.println("O n�mero " + numero + " � �MPAR.");
        }

        // Fecha o Scanner (boa pr�tica)
        entrada.close();
    }
}
