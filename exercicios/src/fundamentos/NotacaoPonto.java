package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Davi");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
			System.out.println(s);
			
			String x = "Leo";
			System.out.println(x);
		
	String V = "Saia, eu nao quero"; 
	V = V.replace("Saia", "Fica");
	V = V.concat("!!!");
		System.out.println(V);
		
		
		String X = "Fica, eu mandei voce ficar";
		X = X.replace("Fica","vaza");
		X = X.replace("ficar", "Vazar");
		X = X.toUpperCase();
		
		System.out.println(X);
		

		
		
	}

}
