package fundamentos;

public class conversaoNumeroString {

	public static void main(String[] args) {
		
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	}
}

//		
//		// Criando um número do tipo wrapper Integer
//		Integer num1 = 10000;
//
//		// Converte para String usando .toString() e mede o tamanho (número de caracteres)
//		System.out.println(num1.toString().length()); // Saída: 5
//
//		// Número primitivo (int)
//		int num2 = 100000;
//
//		// Converte o número primitivo usando Integer.toString()
//		System.out.println(Integer.toString(num2).length()); // Saída: 6
//
//		// Outra forma de converter número em String: somando com string vazia
//		System.out.println(("" + num1).length()); // Saída: 5
//
//		// Também funciona com tipos primitivos
//		System.out.println(("" + num2).length()); // Saída: 6
//	}
//}
//
