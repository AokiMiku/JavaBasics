package aufgabenKlassen;

class PrintChars
{
	public char From;
	public char To;
	
	public void printFromTo()
	{		
		for(int i = this.From; i <= this.To; i++)
		{
			System.out.print((char)i + " ");
		}
		System.out.println();
	}
	
	public void printFromTo(char from, char to)
	{
		this.From = from;
		this.To = to;
		
		this.printFromTo();
	}
}

public class Unicode 
{
	public static void main(String[] args) 
	{
		PrintChars pc = new PrintChars();
		
		pc.printFromTo();
		pc.printFromTo('a', 'f');
		pc.printFromTo('x', 'z');
		pc.printFromTo('A', 'D');
		pc.printFromTo('M', 'P');
		
		PrintChars aBisF = new PrintChars();
		aBisF.From = 'a';
		aBisF.To = 'f';
		aBisF.printFromTo();
		
	}
}