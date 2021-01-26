package aufgabenArrays;

import java.util.Arrays;

class Kreis
{
	int radius = 0;
	
	public Kreis(int radius)
	{
		this.radius = radius;
	}
	
	@Override
	public String toString()
	{
		return String.format("Kreis mit einem Radius von %d", this.radius);
	}
}

public class AufgabenKreiseArrays 
{
	public static void main(String[] args) 
	{
		Kreis[] kreise = new Kreis[100];
		
		for (int i = 0; i < kreise.length; i++)
		{
			kreise[i] = new Kreis(basics.RandomGenerator.getRandomNumber(1, 20));
		}


		for (int i = 0; i < kreise.length; i++)
		{
			System.out.println(String.format("%d. %s", i + 1, kreise[i]));
		}
	}
}