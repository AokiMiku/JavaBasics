package aufgabenVererbungen;

class Form
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
}

public class AufgabenGeometrie 
{
	public static void main(String[] args) 
	{
		Rechteck re = new Rechteck(3, 4);
		System.out.println(re);
		
		re.bewegen(12, -7);
		System.out.println(re);
		
		Kreis kr = new Kreis(4);
		System.out.println(kr);
		
		kr.bewegen(33, 1);
		System.out.println(kr);
	}
}








