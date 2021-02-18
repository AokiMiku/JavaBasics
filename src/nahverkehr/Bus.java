package nahverkehr;

public class Bus extends Verkehrsmittel
{
	private int sitzplaetze;

	public int getSitzplaetze() 
	{
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) 
	{
		if (sitzplaetze <= 0)
		{
			throw new IllegalArgumentException("Anzahl der Sitzplaetze darf nicht gleich oder weniger 0 sein! " + sitzplaetze);
		}
		
		this.sitzplaetze = sitzplaetze;
	}
	
	public Bus() { }
	
	public Bus(int linienNummer, String fahrer, String startHaltestelle, String endHaltestelle, int sitzplaetze) 
	{
		super(linienNummer, fahrer, startHaltestelle, endHaltestelle);
		this.setSitzplaetze(sitzplaetze);
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + String.format("Sitzplätze: %d", this.sitzplaetze);
	}
}