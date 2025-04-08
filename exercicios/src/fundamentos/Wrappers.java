package fundamentos; // Define o pacote onde essa classe está

public class Wrappers { // Nome da classe (por convenção, deveria começar com letra maiúscula: Wrappers)

	public static void main(String[] args) {
		
		// Usando classes *wrapper* ao invés de tipos primitivos
		// Essas classes permitem usar métodos úteis e armazenar valores como objetos
		
		// Byte é o wrapper do tipo primitivo byte
		Byte b = 100;
		
		// Short é o wrapper para short
		Short s = 1000;
		
		// Integer é o wrapper para int
		// (Nota: tem um erro comentado acima, o correto seria "Integer.parseInt(...)")
		Integer i = 10000;
		
		// Long é o wrapper para long. O 'L' no final indica que é um literal do tipo long
		Long l = 10000L;
		
		// Mostrando os valores usando métodos dos wrappers ou operações
		System.out.println(b.byteValue());       // Converte para tipo primitivo byte
		System.out.println(s.toString());        // Converte para String
		System.out.println(i * 3);               // Faz uma multiplicação com o valor inteiro
		System.out.println(l / 3);               // Faz uma divisão com long
		
		// Float é o wrapper para float. 'f' no final indica que é um literal do tipo float
		Float f = 123.10f;
		System.out.println(f);
		
		// Double é o wrapper para double
		Double d = 1234.5678;
		System.out.println(d);
		
		// Boolean é o wrapper para boolean
		Boolean bo = Boolean.parseBoolean("true"); // Converte a String "true" para boolean verdadeiro
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Converte para String e deixa em maiúsculas
		
		// Character é o wrapper para char
		Character c = '#';
		System.out.println(c + "..."); // Imprime o caractere seguido de reticências

	}
}
