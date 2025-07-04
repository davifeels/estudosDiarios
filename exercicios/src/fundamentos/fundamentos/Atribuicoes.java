package fundamentos;

public class Atribuicoes {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;        // b recebe o valor de a (3)
		int c = a + b;    // c = 3 + 3 = 6
		
		c += b;           // c = c + b = 6 + 3 = 9
		c -= a;           // c = c - a = 9 - 3 = 6
		c *= b;           // c = c * b = 6 * 3 = 18
		c /= a;           // c = c / a = 18 / 3 = 6
		
		System.out.println(c);  // Exibe 6
		
		c %= 2;           // c = c % 2 = 6 % 2 = 0
		
		System.out.println(c);  // Exibe 0
	}
}
