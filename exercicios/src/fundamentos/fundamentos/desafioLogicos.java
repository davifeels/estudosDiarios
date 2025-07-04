package fundamentos;


		public class desafioLogicos {
	
				public static void main(String[] args) {
					
					boolean trabalho1 = false;
					boolean trabalho2 = false;
					
					boolean comprouTV50 = trabalho1 && trabalho2;
					boolean comprouTV32 = trabalho1 ^ trabalho2;
					boolean comprouSorvete = trabalho1 || trabalho2;
					
                            //	Operador únario
					boolean maisSaudavel = !comprouSorvete;
					
					System.out.println("Comprou TV 50\"?" + comprouTV50);
					System.out.println("Comprou TV 32\"/" + comprouTV32);
					System.out.println("Comprou Sorvete? " + comprouSorvete);
					System.out.println("Mais saudável? " + maisSaudavel);
					
				}

}
		
				
//				// Simulando se conseguiu trabalho na terça e na quinta
//				boolean trabalho1 = false; // Exemplo: terça
//				boolean trabalho2 = false; // Exemplo: quinta
//				
//				// Se conseguiu os dois trabalhos, vai comprar uma TV de 50"
//				boolean comprouTV50 = trabalho1 && trabalho2;
//
//				// Se conseguiu apenas UM dos dois trabalhos, compra a TV de 32"
//				// ^ (XOR) retorna true se for apenas um verdadeiro
//				boolean comprouTV32 = trabalho1 ^ trabalho2;
//
//				// Se conseguiu pelo menos um trabalho, vai tomar sorvete
//				boolean comprouSorvete = trabalho1 || trabalho2;
//
//				// Se não tomou sorvete, foi mais saudável
//				// ! (NOT) inverte o valor: se não comprou sorvete = mais saudável
//				boolean maisSaudavel = !comprouSorvete;
//
//				// Resultados do "mundo real" baseados nas condições
//				System.out.println("Comprou TV 50\"? " + comprouTV50);  // true só se fez os dois trabalhos
//				System.out.println("Comprou TV 32\"? " + comprouTV32);  // true se fez só UM dos dois trabalhos
//				System.out.println("Comprou Sorvete? " + comprouSorvete); // true se fez pelo menos um
//				System.out.println("Mais saudável? " + maisSaudavel);  // true se NÃO comprou sorvete

