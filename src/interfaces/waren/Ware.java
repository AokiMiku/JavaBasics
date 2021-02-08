package interfaces.waren;

public class Ware 
{
	private String bezeichnung;
	private int preis;
	
	public String getBezeichnung() 
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) 
	{
		this.bezeichnung = bezeichnung;
	}

	public int getPreis() 
	{
		return preis;
	}

	public void setPreis(int preis) 
	{
		this.preis = preis;
	}

	public Ware(String bezeichnung, int preis) 
	{
		super();
		this.setBezeichnung(bezeichnung);
		this.setPreis(preis);
	}
	
	public String toString()
	{
		return String.format("%s: %s, Preis: %.2f", this.getClass().getSimpleName(), this.getBezeichnung(), this.getPreis() / 100.0);
	}
}