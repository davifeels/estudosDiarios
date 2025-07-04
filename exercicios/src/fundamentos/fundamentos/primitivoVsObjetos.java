package fundamentos;

public class primitivoVsObjetos {

	public static void main(String[] args) {
		
		// String é uma classe (objeto), por isso tem métodos como toUpperCase, length, etc.
		String s = new String("Texto");
		System.out.println(s.toUpperCase()); // Converte para maiúsculas e imprime

		// Tipos primitivos NÃO têm métodos
		int a = 123;
		System.out.println(a); // Só imprime, não dá pra fazer a.toString() por exemplo

		// Usando o tipo wrapper Integer (versão objeto do int)
		Integer b = 456; // Pode usar métodos porque é um objeto
		System.out.println(b.toString()); // Converte o número para texto
		System.out.println(b.compareTo(100)); // Compara com 100 (retorna >0, =0 ou <0)
		System.out.println(b.equals(456)); // Verifica se é igual a 456 (true)
		System.out.println(b + 10); // Pode fazer operações normalmente

		// Outro exemplo com Double (versão objeto de double)
		Double d = 3.1415;
		System.out.println(d.toString()); // Converte para String
		System.out.println(d.compareTo(2.0)); // Compara com outro double
		System.out.println(d.isInfinite()); // Verifica se é infinito (false aqui)

		// Boolean (objeto) ao invés de boolean (primitivo)
		Boolean bo = true;
		System.out.println(bo.toString()); // "true"
		System.out.println(bo.equals(false)); // false

		// Character (objeto) ao invés de char (primitivo)
		Character c = 'A';
		System.out.println(Character.isLowerCase(c)); // Verifica se é minúsculo
		System.out.println(Character.toLowerCase(c)); // Converte para minúsculo

		// Diferença geral:
		// Primitivos são mais rápidos e consomem menos memória.
		// Wrappers (objetos) permitem usar métodos e funcionar com generics (ex: listas).

	}
}
