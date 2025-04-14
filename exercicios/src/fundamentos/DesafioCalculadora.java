package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        // Criando um objeto Scanner para ler as entradas do usu�rio
        Scanner in = new Scanner(System.in);

        // Solicita ao usu�rio que digite o primeiro n�mero
        System.out.println("Digite um N�mero: ");
        double n1 = in.nextDouble();  // L� o primeiro n�mero (n1)

        // Solicita ao usu�rio que digite o segundo n�mero
        System.out.println("Digite outro N�mero: ");
        double n2 = in.nextDouble();  // L� o segundo n�mero (n2)

        // Informa ao usu�rio as opera��es que ele pode realizar
        System.out.println("\nQual Opera��o Voc� deseja Realizar com os n�meros [+  -  x   /  % ]");

        // L� o s�mbolo da opera��o escolhida pelo usu�rio
        String simbolo = in.next();  // L� a opera��o que o usu�rio deseja realizar

        // A opera��o � realizada com base no s�mbolo informado
        // Aqui usamos um operador tern�rio encadeado para decidir qual opera��o realizar
        System.out.println(
            simbolo.equals("+") ? n1 + n2  // Se o s�mbolo for "+", realiza a soma
            : simbolo.equals("-") ? n1 - n2  // Se o s�mbolo for "-", realiza a subtra��o
            : simbolo.equals("*") ? n1 * n2  // Se o s�mbolo for "*", realiza a multiplica��o
            : simbolo.equals("/") ? (n2 != 0 ? n1 / n2 : "Erro: Divis�o por zero")  // Se o s�mbolo for "/", verifica se n2 n�o � zero antes de dividir
            : simbolo.equals("%") ? n1 % n2  // Se o s�mbolo for "%", realiza o m�dulo (resto da divis�o)
            : "Opera��o n�o Encontrada"  // Se o s�mbolo n�o for um dos v�lidos, retorna "Opera��o n�o Encontrada"
        );

        // Fecha o objeto Scanner ap�s o uso para liberar os recursos
        in.close();
    }
}
