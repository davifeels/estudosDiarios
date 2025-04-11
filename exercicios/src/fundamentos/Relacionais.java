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


////Comparando um número inteiro com um caractere (char)
//		int a = 97;
//		int b = 'a'; // o caractere 'a' tem o valor numérico 97 na tabela ASCII
//		
//		// Aqui os dois são 97, então a == b é true
//		System.out.println(a == b); // true
//
//		// Diferente de
//		System.out.println(30 != 7); // true, porque 30 é diferente de 7
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
//		// --- Parte lógica com booleans ---
//
//		double nota = 9.9;
//		boolean bomComportamento = false;
//		boolean passouPorMedia = true;
//
//		// Só tem desconto se teve bom comportamento E passou por média
//		boolean temDesconto = bomComportamento && passouPorMedia;
//
//		System.out.println("Tem desconto? " + temDesconto); // false, porque bom comportamento é false
 