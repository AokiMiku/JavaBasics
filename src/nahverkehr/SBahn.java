package nahverkehr;

public class SBahn extends Verkehrsmittel
{
	private String schaffnerName;
	private int anzahlWagen;
	private int sitzplaetzeProWagen;
	
	public String getSchaffnerName() 
	{
		return schaffnerName;
	}
	
	public void setSchaffnerName(String schaffner) 
	{
		this.schaffnerName = schaffner;
	}
	
	public int getAnzahlWagen() 
	{
		return anzahlWagen;
	}
	
	public void setAnzahlWagen(int anzahlWagen) 
	{
		if (anzahlWagen <= 0)
		{
			throw new IllegalArgumentException("Anzahl der Wagen darf nicht gleich oder weniger 0 sein! " + anzahlWagen);
		}
		
		this.anzahlWagen = anzahlWagen;
	}
	
	public int getSitzplaetzeProWagen() 
	{
		return sitzplaetzeProWagen;
	}
	
	public void setSitzplaetzeProWagen(int sitzplaetzeProWagen) 
	{
		if (sitzplaetzeProWagen <= 0)
		{
			throw new IllegalArgumentException("Anzahl der Sitzplaetze darf nicht gleich oder weniger 0 sein! " + sitzplaetzeProWagen);
		}
		
		this.sitzplaetzeProWagen = sitzplaetzeProWagen;
	}

	public SBahn(int linienNummer, String fahrer, String startHaltestelle, String endHaltestelle, String schaffnerName, int anzahlWagen, int sitzplaetzeProWagen) 
	{
		super(linienNummer, fahrer, startHaltestelle, endHaltestelle);
		this.setSchaffnerName(schaffnerName);
		this.setAnzahlWagen(sitzplaetzeProWagen);
		this.setSitzplaetzeProWagen(sitzplaetzeProWagen);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + String.format("Schaffner: %s, Anzahl Wagen: %d, Anzahl Sitzplätze pro Wagen: %d", 
												this.schaffnerName, this.anzahlWagen, this.sitzplaetzeProWagen);
	}
}