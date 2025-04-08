package fundamentos;

import java.util.Scanner; // Importa a classe Scanner pra ler dados do teclado

public class Console {

	public static void main(String[] args) {

		// print não quebra a linha, então "Bom" e " dia!" vão sair grudados
		System.out.print("Bom");
		System.out.print(" dia!\n\n"); // \n pula linha. \n\n pula duas linhas

		// println já quebra a linha automaticamente
		System.out.println("Bom");
		System.out.println("dia!");

		// printf permite formatar a saída
		// %d = número inteiro, cada número será colocado em ordem
		System.out.printf("Megasena: %d %d %d %d %d%n", 1, 2, 3, 4, 5);

		// %.1f = número decimal com 1 casa após o ponto
		System.out.printf("Sálario: %.1f%n", 1234.5678);

		// %s = texto (String)
		System.out.printf("Nome: %s%n", "Davi");

		// Cria um objeto Scanner pra capturar entradas do usuário
		Scanner entrada = new Scanner(System.in);

		// Lê o nome digitado
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine(); // Lê a linha inteira

		// Lê o sobrenome
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		// Lê a idade (número inteiro)
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // Lê um número inteiro

		// Mostra tudo formatado na tela
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

		// Fecha o Scanner pra liberar recursos do sistema
		entrada.close();
	}
}
