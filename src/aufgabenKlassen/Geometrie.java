package aufgabenKlassen;

class Form
{
	public void print()
	{
		System.out.println(this);
	}
}

class Rechteck extends Form
{
	public int Breite;
	public int Hoehe;
	
	public Rechteck(int breite, int hoehe)
	{
		this.Breite = breite;
		this.Hoehe = hoehe;
	}
	
	public String toString()
	{
		return String.format("Das Rechteck ist %d x %d groß.", this.Breite, this.Hoehe);				
	}
}

class Kreis extends Form
{
	public int Radius;
	
	public Kreis(int radius)
	{
		this.Radius = radius;
	}
	
	public String toString()
	{
		return String.format("Der Kreis hat einen Radius von %d.", this.Radius);
	}
}

public class Geometrie 
{
	public static void main(String[] args) 
	{
		new Rechteck(5, 4).print();
		new Kreis(2).print();
	}
}