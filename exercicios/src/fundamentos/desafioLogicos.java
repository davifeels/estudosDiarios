package fundamentos;


		public class desafioLogicos {
	
				public static void main(String[] args) {
					
					boolean trabalho1 = false;
					boolean trabalho2 = false;
					
					boolean comprouTV50 = trabalho1 && trabalho2;
					boolean comprouTV32 = trabalho1 ^ trabalho2;
					boolean comprouSorvete = trabalho1 || trabalho2;
					
                            //	Operador �nario
					boolean maisSaudavel = !comprouSorvete;
					
					System.out.println("Comprou TV 50\"?" + comprouTV50);
					System.out.println("Comprou TV 32\"/" + comprouTV32);
					System.out.println("Comprou Sorvete? " + comprouSorvete);
					System.out.println("Mais saud�vel? " + maisSaudavel);
					
				}

}
		
				
//				// Simulando se conseguiu trabalho na ter�a e na quinta
//				boolean trabalho1 = false; // Exemplo: ter�a
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
//				// Se n�o tomou sorvete, foi mais saud�vel
//				// ! (NOT) inverte o valor: se n�o comprou sorvete = mais saud�vel
//				boolean maisSaudavel = !comprouSorvete;
//
//				// Resultados do "mundo real" baseados nas condi��es
//				System.out.println("Comprou TV 50\"? " + comprouTV50);  // true s� se fez os dois trabalhos
//				System.out.println("Comprou TV 32\"? " + comprouTV32);  // true se fez s� UM dos dois trabalhos
//				System.out.println("Comprou Sorvete? " + comprouSorvete); // true se fez pelo menos um
//				System.out.println("Mais saud�vel? " + maisSaudavel);  // true se N�O comprou sorvete

