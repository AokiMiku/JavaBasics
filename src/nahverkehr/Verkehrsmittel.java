package nahverkehr;

public class Verkehrsmittel 
{
	private int linienNummer;
	private String fahrerName;
	private String startHaltestelle;
	private String endHaltestelle;
	
	public int getLinienNummer() 
	{
		return linienNummer;
	}
	
	public void setLinienNummer(int linienNummer)
	{
		this.linienNummer = linienNummer;
	}
	
	public String getFahrerName() 
	{
		return fahrerName;
	}
	
	public void setFahrerName(String fahrer) 
	{
		this.fahrerName = fahrer;
	}
	
	public String getStartHaltestelle() 
	{
		return startHaltestelle;
	}
	
	public void setStartHaltestelle(String startHaltestelle) 
	{
		this.startHaltestelle = startHaltestelle;
	}
	
	public String getEndHaltestelle() 
	{
		return endHaltestelle;
	}
	
	public void setEndHaltestelle(String endHaltestelle) 
	{
		this.endHaltestelle = endHaltestelle;
	}
	
	public Verkehrsmittel() { }

	public Verkehrsmittel(int linienNummer, String fahrer, String startHaltestelle, String endHaltestelle) 
	{
		this.setLinienNummer(linienNummer);
		this.setFahrerName(fahrer);
		this.setStartHaltestelle(startHaltestelle);
		this.setEndHaltestelle(endHaltestelle);
	}
	
	@Override
	public String toString() 
	{
		return String.format("%s Linie: %d, Fahrer: %s%nStartet bei %s und fährt bis %s.", 
							this.getClass().getSimpleName(), this.linienNummer, this.fahrerName, this.startHaltestelle, this.endHaltestelle)
							+ System.lineSeparator();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		return this.linienNummer == ((Verkehrsmittel)obj).linienNummer;
	}
}