package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
    public static void main(String[] args) {

        // Conversão implícita (int → double)
        // Java permite essa conversão automaticamente, sem precisar "forçar"
        double a = 1;
        System.out.println(a); // Saída: 1.0

        // Conversão explícita (double → float)
        // float tem menos precisão que double, por isso precisa "forçar" com (float)
        float b = (float) 1.123456788888;
        System.out.println(b); // Saída: valor com menos casas decimais

        // Conversão explícita (int → byte)
        int c = 340;
        byte d = (byte) c; // byte só vai de -128 até 127 → valor vai ser distorcido
        System.out.println(d); // Saída: valor inesperado (overflow, resultado: 84)

        // Conversão explícita (double → int)
        double e = 1.99999999;
        int f = (int) e; // Corta as casas decimais, sem arredondar
        System.out.println(f); // Saída: 1

    }

}