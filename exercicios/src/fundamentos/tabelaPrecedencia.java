package fundamentos;

public class tabelaPrecedencia {

    public static void main(String[] args) {
        // Esse arquivo é apenas uma referência de precedência de operadores.
        // Pode ser usado como base para testes ou revisões.
    }
    
    /*
     * 15 - (), [], .        → Parênteses, acesso a array, acesso a membros  (Esq → Dir)
     * 14 - ++, -- (pós)     → Incremento/Decremento pós-fixado             (Dir → Esq)
     * 13 - ++, --, +, -, !, ~, (tipo)
     *      → Pré-fixado, mais/menos unário, negação lógica, complemento    (Dir → Esq)
     * 12 - *, /, %          → Multiplicação, divisão, módulo               (Esq → Dir)
     * 11 - +, -             → Soma, subtração                              (Esq → Dir)
     * 10 - <<, >>, >>>      → Deslocamentos à esquerda/direita             (Esq → Dir)
     *  9 - <, <=, >, >=, instanceof → Comparações                          (Esq → Dir)
     *  8 - ==, !=           → Igualdade e desigualdade                     (Esq → Dir)
     *  7 - &                → E lógico (bit a bit)                         (Esq → Dir)
     *  6 - ^                → OU exclusivo (bit a bit)                     (Esq → Dir)
     *  5 - |                → OU lógico (bit a bit)                        (Esq → Dir)
     *  4 - &&               → E lógico (curto-circuito)                    (Esq → Dir)
     *  3 - ||               → OU lógico (curto-circuito)                   (Esq → Dir)
     *  2 - ?:               → Condicional ternário                         (Dir → Esq)
     *  1 - =, +=, -=, *=, /=, %= 
     *      → Atribuições simples e compostas                              (Dir → Esq)
     */