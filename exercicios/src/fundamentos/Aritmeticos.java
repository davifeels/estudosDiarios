package fundamentos;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		// Soma simples
		System.out.println(2 + 3);
		
		var x = 34.56; // tipo double (inferido com var)
		double y = 2.2;
		
		// Opera��es com ponto flutuante
		System.out.println(x + y); // soma
		System.out.println(x - y); // subtra��o
		System.out.println(x * y); // multiplica��o
		System.out.println(x / y); // divis�o
		
		int a = 8;
		int b = 3;
		
		// Opera��es com inteiros
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		// Divis�o com casting (convers�o) pra double e float
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		// M�dulo (resto da divis�o)
		System.out.println(a % 3);
		System.out.println(8 % 3);
	}
}
