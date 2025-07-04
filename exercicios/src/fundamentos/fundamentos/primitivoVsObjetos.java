package fundamentos;

public class primitivoVsObjetos {

	public static void main(String[] args) {
		
		// String � uma classe (objeto), por isso tem m�todos como toUpperCase, length, etc.
		String s = new String("Texto");
		System.out.println(s.toUpperCase()); // Converte para mai�sculas e imprime

		// Tipos primitivos N�O t�m m�todos
		int a = 123;
		System.out.println(a); // S� imprime, n�o d� pra fazer a.toString() por exemplo

		// Usando o tipo wrapper Integer (vers�o objeto do int)
		Integer b = 456; // Pode usar m�todos porque � um objeto
		System.out.println(b.toString()); // Converte o n�mero para texto
		System.out.println(b.compareTo(100)); // Compara com 100 (retorna >0, =0 ou <0)
		System.out.println(b.equals(456)); // Verifica se � igual a 456 (true)
		System.out.println(b + 10); // Pode fazer opera��es normalmente

		// Outro exemplo com Double (vers�o objeto de double)
		Double d = 3.1415;
		System.out.println(d.toString()); // Converte para String
		System.out.println(d.compareTo(2.0)); // Compara com outro double
		System.out.println(d.isInfinite()); // Verifica se � infinito (false aqui)

		// Boolean (objeto) ao inv�s de boolean (primitivo)
		Boolean bo = true;
		System.out.println(bo.toString()); // "true"
		System.out.println(bo.equals(false)); // false

		// Character (objeto) ao inv�s de char (primitivo)
		Character c = 'A';
		System.out.println(Character.isLowerCase(c)); // Verifica se � min�sculo
		System.out.println(Character.toLowerCase(c)); // Converte para min�sculo

		// Diferen�a geral:
		// Primitivos s�o mais r�pidos e consomem menos mem�ria.
		// Wrappers (objetos) permitem usar m�todos e funcionar com generics (ex: listas).

	}
}
