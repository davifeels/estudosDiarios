package fundamentos; 

public class For1 { // Declara a classe For1

    public static void main(String[] args) { 

        // Primeiro laço for: conta de 1 até 10 (inclusive)
        for (int contador = 1; contador <= 10; contador++) {
            // Imprime o valor atual de 'contador' formatado com printf
            System.out.printf("i = %d\n", contador);
        }

        // Declara uma variável 'x' com valor inicial 2
        int x = 2;

        // Segundo laço for: conta de x (2) até 9 (enquanto x < 10)
        // Note que a inicialização e o incremento estão fora do cabeçalho do for
        for (; x < 10; ) {
            // Imprime o valor atual de 'x'
            System.out.println("x = " + x);
            
            // Incrementa x em 1 a cada repetição
            x++;
        }
    }
}
