package aufgabenKontrollstrukturen;

public class DoWhile {
	public static void main(String[] args) {
		
		int a = 1, b = 3, summe = 0;
		
		while(a + b <= 100) { a++; b++; summe = a + b; }
		System.out.println("While: a = " + a + "; b = " + b + "; summe = " + summe);
		
		a = 1; 
		b = 3;
		do
		{
			a++; 
			b++;
			summe = a + b;
		} while (a + b <= 100);
		System.out.println("Do-While: a = " + a + "; b = " + b + "; summe = " + summe);
	}
}