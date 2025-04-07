package fundamentos;

import java.util.Scanner;

public class atividade03April {
	
			public static void main(String []args) {
				
				
				System.out.println("Davi");
				 
				
//				      manipulandoString
				
				String x ="  Meu nome é Davi Anderson"; 
				x = x.replace("Meu", "Seu ");
				x = x.replace("Anderson", "Batista ");
				x = x.replace("Davi", "David");
			
				     System.out.println(x);    //  Seu  nome é David Batista 
				
				
			x ="David";
			x = x.toUpperCase(); //DAVID
				  System.out.println(x);
				
			x ="Batista";
			x = x.toUpperCase(); 
				System.out.println(x); //BATISTA
				
			
			
			
			
//			        usandoUmaTrim - removendoEspaços
			
			String texto ="  Meu nome é Davi Anderson";
              System.out.println ("Antes do Trim: [" + texto + "]"); //Antes do Trim: [  Meu nome é Davi Anderson]
              texto = texto.trim();
              System.out.println ("Depois do Trim: [" + texto + "]");  //Depois do Trim: [Meu nome é Davi Anderson]
              
              
              
              
//                             usandoSubstring
              
              
                  String nome = "Davi Batista";
                  String primeiroNome = nome.substring(0,4);  // Pega os caracteres de 0 a 3
                  String sobrenome = nome.substring(5);     //Pega a partir do índice 5 até o final
              
			
                  			System.out.println("Primeiro nome:  " + primeiroNome);
                  			System.out.println("Sobrenome: " + sobrenome );
                  			
                  			
//                  			   UsandocharAt(), length()
                  			
//                  			UsandocharAt() Retorna o caractere de uma posição específica na string.
//                  			length() Retorna a quantidade de caracteres na string.
                  			
                  			
                  			
                  String palavra = "Programacão";
                  System.out.println(" Última letra: " + palavra.charAt(0));     //Primeira letra: P
                  System.out.println(" Última letra: " + palavra.charAt(palavra.length() -1));  //Última letra: o
                  System.out.println("Quantidade de caracteres: " + palavra.length()); // Quantidade de caracteres: 11
                  
                  
                  
                  
//                  							testeQueFizEDeuErrado
                  
                  Scanner sc = new Scanner(System.in);
                  
                  
                  String frase = "Digite uma frase: "; 

                   
                   		System.out.print(frase);
                   		frase = sc.nextLine();
                   		frase = frase.trim();
                   		System.out.println("Frase sem espaços extras: [" + frase + "]");
                   		System.out.println("Quantidade de caracteres: " + frase.length());
                   		System.out.println("Última Palavra: " + frase.charAt(1));
                   		System.out.println("Terceira Letra: " + frase.charAt(6));
 
            sc.close();
            
            
            
            
            
            
//            									testeCerto
            
            
//            
//            Scanner sc = new Scanner(System.in);
//
//            String frase = "Digite uma frase: "; 
//
//            System.out.print(frase);
//            frase = sc.nextLine();
//            frase = frase.trim();
//
//            System.out.println("Frase sem espaços extras: [" + frase + "]");
//            System.out.println("Quantidade de caracteres: " + frase.length());
//            
//
// //                      Só imprime se a frase tiver tamanho suficiente
//            
//            
//            if (frase.length() > 1) {
//                System.out.println("Última Palavra: " + frase.charAt(1));
//            }
//            if (frase.length() > 6) {
//                System.out.println("Terceira Letra: " + frase.charAt(6));
//            }
//
//            sc.close();
//            
//            
//            aaa
//            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
  
                  
                  			
                  			
                  			
                  			
                  			
                  			
                  			
                  			
                  			
                  			
                  			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}	
			
			
			
}
