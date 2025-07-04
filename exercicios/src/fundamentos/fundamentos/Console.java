package fundamentos;

import java.util.Scanner; // Importa a classe Scanner pra ler dados do teclado

public class Console {

	public static void main(String[] args) {

		// print n�o quebra a linha, ent�o "Bom" e " dia!" v�o sair grudados
		System.out.print("Bom");
		System.out.print(" dia!\n\n"); // \n pula linha. \n\n pula duas linhas

		// println j� quebra a linha automaticamente
		System.out.println("Bom");
		System.out.println("dia!");

		// printf permite formatar a sa�da
		// %d = n�mero inteiro, cada n�mero ser� colocado em ordem
		System.out.printf("Megasena: %d %d %d %d %d%n", 1, 2, 3, 4, 5);

		// %.1f = n�mero decimal com 1 casa ap�s o ponto
		System.out.printf("S�lario: %.1f%n", 1234.5678);

		// %s = texto (String)
		System.out.printf("Nome: %s%n", "Davi");

		// Cria um objeto Scanner pra capturar entradas do usu�rio
		Scanner entrada = new Scanner(System.in);

		// L� o nome digitado
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine(); // L� a linha inteira

		// L� o sobrenome
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		// L� a idade (n�mero inteiro)
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // L� um n�mero inteiro

		// Mostra tudo formatado na tela
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

		// Fecha o Scanner pra liberar recursos do sistema
		entrada.close();
	}
}
