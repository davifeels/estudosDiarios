package fundamentos;

   class Aritmeticos {

	public static void main(String[] args) {

		// Soma simples
		System.out.println(2 + 3);

		var x = 34.56; // tipo double (inferido com var)
		double y = 2.2;

		// Operações com ponto flutuante
		System.out.println(x + y); // soma
		System.out.println(x - y); // subtração
		System.out.println(x * y); // multiplicação
		System.out.println(x / y); // divisão

		int a = 8;
		int b = 3;

		// Operações com inteiros
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);

		// Divisão com casting (conversão) pra double e float
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);

		// Módulo (resto da divisão)
		System.out.println(a % 3);
		System.out.println(8 % 3);
	}
}
