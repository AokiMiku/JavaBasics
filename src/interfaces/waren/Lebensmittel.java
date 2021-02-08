package interfaces.waren;

public class Lebensmittel extends Ware
{
	int kalorien;
	
	public Lebensmittel(String bezeichnung, int preis, int kalorien)
	{
		super (bezeichnung, preis);
		
	}
}