package fundamentos;

public class Relacionais {
	
	
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a ==b);
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = true;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
	}

}


////Comparando um n�mero inteiro com um caractere (char)
//		int a = 97;
//		int b = 'a'; // o caractere 'a' tem o valor num�rico 97 na tabela ASCII
//		
//		// Aqui os dois s�o 97, ent�o a == b � true
//		System.out.println(a == b); // true
//
//		// Diferente de
//		System.out.println(30 != 7); // true, porque 30 � diferente de 7
//
//		// Maior que
//		System.out.println(3 > 4); // false
//
//		// Maior ou igual
//		System.out.println(3 >= 3); // true
//
//		// Menor que
//		System.out.println(3 < 7); // true
//
//		// Menor ou igual
//		System.out.println(30 <= 7); // false
//
//		// --- Parte l�gica com booleans ---
//
//		double nota = 9.9;
//		boolean bomComportamento = false;
//		boolean passouPorMedia = true;
//
//		// S� tem desconto se teve bom comportamento E passou por m�dia
//		boolean temDesconto = bomComportamento && passouPorMedia;
//
//		System.out.println("Tem desconto? " + temDesconto); // false, porque bom comportamento � false
 