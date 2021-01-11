package aufgabenKontrollstrukturen;

public class KleineWhileSchleife {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		int i = 0;
		while (i < 4)
		{
			System.out.print(i++ + " ");
		}
	}

}