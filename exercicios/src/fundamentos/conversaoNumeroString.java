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
//		// Criando um n�mero do tipo wrapper Integer
//		Integer num1 = 10000;
//
//		// Converte para String usando .toString() e mede o tamanho (n�mero de caracteres)
//		System.out.println(num1.toString().length()); // Sa�da: 5
//
//		// N�mero primitivo (int)
//		int num2 = 100000;
//
//		// Converte o n�mero primitivo usando Integer.toString()
//		System.out.println(Integer.toString(num2).length()); // Sa�da: 6
//
//		// Outra forma de converter n�mero em String: somando com string vazia
//		System.out.println(("" + num1).length()); // Sa�da: 5
//
//		// Tamb�m funciona com tipos primitivos
//		System.out.println(("" + num2).length()); // Sa�da: 6
//	}
//}
//
