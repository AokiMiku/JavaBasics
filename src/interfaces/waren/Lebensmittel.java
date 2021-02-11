package interfaces.waren;

public class Lebensmittel extends Ware
{
	int kalorien;
	
	public int getKalorien() 
	{
		return kalorien;
	}

	public void setKalorien(int kalorien) 
	{
		this.kalorien = kalorien;
	}

	public Lebensmittel(String bezeichnung, int preis, int kalorien)
	{
		super (bezeichnung, preis);
		this.setKalorien(kalorien);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + String.format(", Kalorien: %s", this.getKalorien());
	}
}