package test;

public class Testgugudan {
	public static void main(String[] args) {
		
		for (int a=2; a <= 9; a++) {
			System.out.println("----" + a + "단 ----");
			for (int b = 1; b <= 9; b++ ) {
				System.out.println( a + "X" + b + "=" + a * b);
			}
		}
		
	}
}
