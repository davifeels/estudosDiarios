package fundamentos;

import java.util.Scanner;

public class atividade03April {

	public static void main(String []args) {

		// ? NOVO: Mova o bloco do Scanner para o in�cio
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String fraseDigitada = sc.nextLine();
		fraseDigitada = fraseDigitada.trim();

		System.out.println("Frase sem espa�os extras: [" + fraseDigitada + "]");
		System.out.println("Quantidade de caracteres: " + fraseDigitada.length());

		if (fraseDigitada.length() > 1) {
			System.out.println("Caractere no �ndice 1: " + fraseDigitada.charAt(1));
		} else {
			System.out.println("Caractere no �ndice 1: Frase muito curta para ter um caractere neste �ndice.");
		}

		if (fraseDigitada.length() > 6) {
			System.out.println("Caractere no �ndice 6: " + fraseDigitada.charAt(6));
		} else {
			System.out.println("Caractere no �ndice 6: Frase muito curta para ter um caractere neste �ndice.");
		}

		//sc.close(); // Mantenha o close() no final do main se o scanner for usado apenas aqui.
		// Ou se voc� us�-lo depois, mova-o para o final de onde ele � usado.
		// Para o restante do seu c�digo, � mais seguro fech�-lo s� no final.

		System.out.println("\nDavi"); // Adicione uma quebra de linha para separar

		//                 manipulandoString
		String x ="  Meu nome � Davi Anderson";
		x = x.replace("Meu", "Seu ");
		x = x.replace("Anderson", "Batista ");
		x = x.replace("Davi", "David");
		System.out.println(x);    //  Seu  nome � David Batista

		x ="David";
		x = x.toUpperCase(); //DAVID
		System.out.println(x);

		x ="Batista";
		x = x.toUpperCase();
		System.out.println(x); //BATISTA

		//                usandoUmaTrim - removendoEspa�os
		String texto ="  Meu nome � Davi Anderson";
		System.out.println ("Antes do Trim: [" + texto + "]");
		texto = texto.trim();
		System.out.println ("Depois do Trim: [" + texto + "]");

		//                             usandoSubstring
		String nome = "Davi Batista";
		String primeiroNome = nome.substring(0,4);
		String sobrenome = nome.substring(5);
		System.out.println("Primeiro nome:  " + primeiroNome);
		System.out.println("Sobrenome: " + sobrenome );

		//                               UsandocharAt(), length()
		String palavra = "Programac�o";
		System.out.println(" �ltima letra: " + palavra.charAt(0));
		System.out.println(" �ltima letra: " + palavra.charAt(palavra.length() -1));
		System.out.println("Quantidade de caracteres: " + palavra.length());

		sc.close(); // Feche o scanner ao final de TODO o seu main, depois de todos os System.out.println
	}
}