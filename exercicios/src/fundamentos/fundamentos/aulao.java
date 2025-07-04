package fundamentos;

import java.util.Date; // Importa a classe Date para pegar data e hora
import javax.swing.JButton; // Importa bot�o gr�fico (usado no Swing, interface gr�fica)

public class aulao {
	
	public static void main(String[] args) {
		
		String x = "Bom Dia!!!"; // Declara uma string
		System.out.println(x); // Imprime a string no console

		Date agora = new Date(); // Cria um objeto com a data e hora atual
		System.out.println("Data e hora atual " + agora); // Mostra a data e hora
		
		JButton botao = new JButton(); // Cria um bot�o (interface gr�fica - Swing)
		// N�o est� sendo usado no momento, mas serve para pr�tica com GUI
		
		System.out.println("Ol� pessoal".charAt(2)); // Mostra o caractere na posi��o 2 (�ndice come�a em 0)

		String s = "Boa Tarde"; // Outra string pra testar fun��es

		System.out.println(s.concat("!!!")); // Junta strings (mesmo que usar +)
		System.out.println(s + "!!!"); // Outra forma de concatenar

		System.out.println(s.startsWith("Boa")); // Verifica se come�a com "Boa" (true)
		System.out.println(s.toLowerCase().startsWith("boa")); // Ignora caixa alta/baixa

		System.out.println(s.endsWith("dia")); // Verifica se termina com "dia" (false nesse caso)

		System.out.println(s.toUpperCase().length()); // Converte pra mai�sculo e mostra o tamanho

		System.out.println(s.trim()); // Remove espa�os no in�cio/fim (se tiver)

		System.out.println(s.toLowerCase().equals("boa tarde")); // Verifica se � igual ignorando caixa

		System.out.println(s.equalsIgnoreCase("boa tarde")); // Outra forma de comparar ignorando mai�sculas/min�sculas

		// Vari�veis usando 'var' (o tipo � inferido automaticamente)
		var nome = "Davi";
		var sobrenome = "Anderson";
		var idade = 23;
		var salario = 7387.26;

		// Montando uma string personalizada
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase); // Imprime a frase completa

		// Outra forma mais organizada: String.format
		String frase = String.format("\nO senhor %s %s tem, %d anos e ganha R$%.3f.", nome, sobrenome, idade, salario);
		System.out.println(frase);

		// Forma mais enxuta com printf
		System.out.printf("O senhor %s %s tem, %d anos e ganha R$%.3f.",
				nome, sobrenome, idade, salario);
		
		
	}
}
