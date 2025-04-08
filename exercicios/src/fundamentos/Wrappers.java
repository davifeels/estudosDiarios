package fundamentos; // Define o pacote onde essa classe est�

public class Wrappers { // Nome da classe (por conven��o, deveria come�ar com letra mai�scula: Wrappers)

	public static void main(String[] args) {
		
		// Usando classes *wrapper* ao inv�s de tipos primitivos
		// Essas classes permitem usar m�todos �teis e armazenar valores como objetos
		
		// Byte � o wrapper do tipo primitivo byte
		Byte b = 100;
		
		// Short � o wrapper para short
		Short s = 1000;
		
		// Integer � o wrapper para int
		// (Nota: tem um erro comentado acima, o correto seria "Integer.parseInt(...)")
		Integer i = 10000;
		
		// Long � o wrapper para long. O 'L' no final indica que � um literal do tipo long
		Long l = 10000L;
		
		// Mostrando os valores usando m�todos dos wrappers ou opera��es
		System.out.println(b.byteValue());       // Converte para tipo primitivo byte
		System.out.println(s.toString());        // Converte para String
		System.out.println(i * 3);               // Faz uma multiplica��o com o valor inteiro
		System.out.println(l / 3);               // Faz uma divis�o com long
		
		// Float � o wrapper para float. 'f' no final indica que � um literal do tipo float
		Float f = 123.10f;
		System.out.println(f);
		
		// Double � o wrapper para double
		Double d = 1234.5678;
		System.out.println(d);
		
		// Boolean � o wrapper para boolean
		Boolean bo = Boolean.parseBoolean("true"); // Converte a String "true" para boolean verdadeiro
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Converte para String e deixa em mai�sculas
		
		// Character � o wrapper para char
		Character c = '#';
		System.out.println(c + "..."); // Imprime o caractere seguido de retic�ncias

	}
}
