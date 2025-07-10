public class whileDeterminado {

    public static void main(String[] args) {

        // Declara e inicializa a variável contador com 0
        int contador = 0;

        // Estrutura de repetição while: executa enquanto contador for menor ou igual a 20
        while (contador <= 20) {

            // Imprime o valor atual do contador formatado com printf (melhor para mostrar com %d)
            System.out.printf("i = %d\n", contador);

            // Incrementa o contador em 1 a cada repetição
            contador += 1;
        }
    }
}
