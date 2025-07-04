package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        // Criando um objeto Scanner para ler as entradas do usuário
        Scanner in = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um Número: ");
        double n1 = in.nextDouble();  // Lê o primeiro número (n1)

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite outro Número: ");
        double n2 = in.nextDouble();  // Lê o segundo número (n2)

        // Informa ao usuário as operações que ele pode realizar
        System.out.println("\nQual Operação Você deseja Realizar com os números [+  -  x   /  % ]");

        // Lê o símbolo da operação escolhida pelo usuário
        String simbolo = in.next();  // Lê a operação que o usuário deseja realizar

        // A operação é realizada com base no símbolo informado
        // Aqui usamos um operador ternário encadeado para decidir qual operação realizar
        System.out.println(
            simbolo.equals("+") ? n1 + n2  // Se o símbolo for "+", realiza a soma
            : simbolo.equals("-") ? n1 - n2  // Se o símbolo for "-", realiza a subtração
            : simbolo.equals("*") ? n1 * n2  // Se o símbolo for "*", realiza a multiplicação
            : simbolo.equals("/") ? (n2 != 0 ? n1 / n2 : "Erro: Divisão por zero")  // Se o símbolo for "/", verifica se n2 não é zero antes de dividir
            : simbolo.equals("%") ? n1 % n2  // Se o símbolo for "%", realiza o módulo (resto da divisão)
            : "Operação não Encontrada"  // Se o símbolo não for um dos válidos, retorna "Operação não Encontrada"
        );

        // Fecha o objeto Scanner após o uso para liberar os recursos
        in.close();
    }
}
