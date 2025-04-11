package fundamentos;



public class Logicas {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
					
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NOT");
		System.out.println(true);
		System.out.println(false);
		
	}
	}

//
//		
//		// Criando duas vari�veis booleanas
//		boolean condicao1 = true;
//		boolean condicao2 = 3 > 7; // Isso d� false, porque 3 N�O � maior que 7
//		
//		// Testando operadores l�gicos com essas vari�veis
//
//		// && (E l�gico): s� retorna true se as duas condi��es forem verdadeiras
//		// Aqui: condicao1 = true, !condicao2 = !false = true -> true && true = true
//		System.out.println(condicao1 && !condicao2); // Resultado: true
//
//		// || (OU l�gico): retorna true se PELO MENOS uma for verdadeira
//		// condicao1 = true, condicao2 = false -> true || false = true
//		System.out.println(condicao1 || condicao2); // Resultado: true
//
//		// ^ (OU exclusivo - XOR): retorna true se as duas forem DIFERENTES
//		// true ^ false = true (valores diferentes)
//		System.out.println(condicao1 ^ condicao2); // Resultado: true
//
//		// !! (nega��o dupla): inverter duas vezes o valor -> volta ao original
//		// !!true = !(!true) = !false = true
//		System.out.println(!!condicao1); // Resultado: true
//
//		// ! (nega��o simples): inverte o valor booleano
//		// !condicao2 = !false = true
//		System.out.println(!condicao2); // Resultado: true
//
//		// Agora vem a famosa TABELA VERDADE dos operadores l�gicos
//		// Serve pra voc� entender o comportamento puro de cada operador
//
//		// ----- TABELA VERDADE DO E (&&) -----
//		System.out.println("Tabela verdade E (AND)");
//		System.out.println(true && true);   // Resultado: true
//		System.out.println(true && false);  // Resultado: false
//		System.out.println(false && true);  // Resultado: false
//		System.out.println(false && false); // Resultado: false
//
//		// ----- TABELA VERDADE DO OU (||) -----
//		System.out.println("\nTabela verdade OU (OR)");
//		System.out.println(true || true);   // Resultado: true
//		System.out.println(true || false);  // Resultado: true
//		System.out.println(false || true);  // Resultado: true
//		System.out.println(false || false); // Resultado: false
//
//		// ----- TABELA VERDADE DO XOR (^ - OU Exclusivo) -----
//		System.out.println("\nTabela verdade OU Exclusivo (XOR)");
//		System.out.println(true ^ true);    // Resultado: false
//		System.out.println(true ^ false);   // Resultado: true
//		System.out.println(false ^ true);   // Resultado: true
//		System.out.println(false ^ false);  // Resultado: false
//
//		// ----- TABELA VERDADE DO NOT (!) -----
//		System.out.println("\nTabela verdade NOT");
//		System.out.println(!true);  // Resultado: false
//		System.out.println(!false); // Resultado: true
//	}
//}
