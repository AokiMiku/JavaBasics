package aufgabenPolymorphie;

import basics.RandomGenerator;

abstract class Form
{
	private int xCoord;
	private int yCoord;
	
	public int getXCoord()
	{
		return this.xCoord;
	}
	
	public void setXCoord(int value)
	{
		this.xCoord = value;
	}
	
	public int getYCoord()
	{
		return this.yCoord;
	}
	
	public void setYCoord(int value)
	{
		this.yCoord = value;
	}
	
	public void bewegen(int x, int y)
	{
		this.xCoord = x;
		this.yCoord = y;
	}
	
	public String toString()
	{
		return String.format("Koordinaten [X: %d, Y: %d]", this.getXCoord(), this.getYCoord());
	}
	
	public abstract double getFlaeche();
}

class Rechteck extends Form
{
	private int breite;
	private int hoehe;

	public int getBreite()
	{
		return this.breite;
	}
	
	public int getHoehe()
	{
		return this.hoehe;
	}
	
	public Rechteck(int breite, int hoehe)
	{
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public String toString()
	{
		return String.format("Ein Rechteck mit den Maßen %d x %d.\n", 
							this.getBreite(), this.getHoehe()) 
							+ super.toString();
	}

	@Override
	public double getFlaeche() 
	{
		return (this.breite * this.hoehe);
	}
}

class Kreis extends Form
{
	private int radius;
	
	public int getRadius()
	{
		return this.radius;
	}
	
	public Kreis(int radius)
	{
		this.radius = radius;
	}
	
	public String toString()
	{
		return String.format("Ein Kreis mit einem Radius von %d.\n", this.getRadius())
							+ super.toString();
	}

	@Override
	public double getFlaeche() 
	{
		return (Math.PI * Math.pow(this.radius, 2));
	}
}

public class AufgabenGeometrie 
{
	public static void main(String[] args) 
	{
		Form[] formen = new Form[100];
		
		for (int i = 0; i < formen.length; i++) 
		{
			if (RandomGenerator.getRandomNumber(1, 2) == 1)
			{
				formen[i] = new Rechteck(RandomGenerator.getRandomNumber(1, 20), RandomGenerator.getRandomNumber(1, 20));
				
			}
			else
			{
				formen[i] = new Kreis(RandomGenerator.getRandomNumber(1, 20));
			}
		}
		
		printFlaechen(formen);
		
	}
	
	static void printFlaechen(Form[] formen)
	{
		for (int i = 0; i < formen.length; i++) 
		{
			System.out.println(formen[i]);
			System.out.println(formen[i].getFlaeche());
			System.out.println("***********");
		}
	}
}

















