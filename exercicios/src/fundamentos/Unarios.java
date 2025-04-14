package fundamentos;

public class Unarios {
	
	public static void main(String[] args) {
	
		int a = 1;
		int b = 2;
		
		a++; // a = 2
		a--; // a volta pra 1
		
		++b; // b = 3
		--b; // b volta pra 2
		
		System.out.println(a); // 1
		System.out.println(b); // 2
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // ++a = 2, b-- = 2 (mas depois vira 1) → true
		System.out.println(a == b);     // 2 == 1 → false
		System.out.println(a); // 2
		System.out.println(b); // 1
	}
}
