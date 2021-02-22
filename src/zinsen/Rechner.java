package zinsen;

import java.util.*;

public class Rechner 
{
	private double startKapital;
	private int laufzeit;
	private float zinsPA;
	private ArrayList<Double> werteProJahr;
	
	public double getStartKapital() 
	{
		return startKapital;
	}
	
	public void setStartKapital(double startKapital) 
	{
		this.startKapital = startKapital;
	}
	
	public int getLaufzeit() 
	{
		return laufzeit;
	}
	
	public void setLaufzeit(int laufzeit) 
	{
		this.laufzeit = laufzeit;
	}
	
	public float getZinsPA() 
	{
		return zinsPA;
	}
	
	public void setZinsPA(float zinsPA) 
	{
		this.zinsPA = zinsPA;
	}
	
	public ArrayList<Double> getWerteProJahr() 
	{
		return new ArrayList<Double>(this.werteProJahr);
	}

//	public void setWerteProJahr(ArrayList<Double> werteProJahr) 
//	{
//		this.werteProJahr = werteProJahr;
//	}

	public Rechner() { 	}

	public Rechner(double startKapital, int laufzeit, float zinsPA) 
	{
		super();
		this.setStartKapital(startKapital);
		this.setLaufzeit(laufzeit);
		this.setZinsPA(zinsPA);
		this.werteProJahr = new ArrayList<Double>();
	}
	
	public double berechne()
	{
		this.werteProJahr.clear();
		
		double endkapital = this.startKapital;
		for (int i = 1; i <= this.getLaufzeit(); i++)
		{
			this.werteProJahr.add(endkapital *= (1 + this.zinsPA / 100.));
		}
		
		return (double)this.werteProJahr.get(this.werteProJahr.size() - 1);
	}
	
	@Override
	public String toString() 
	{
		StringBuilder toString = new StringBuilder();
		toString.append(String.format("Zinsrechner%nStartkapital: %,.2f €, Zinssatz p.a.: %,.2f %s, Laufzeit: %d Jahre%n", this.startKapital, this.zinsPA, "%", this.laufzeit));
		
		for (int i = 1; i <= this.werteProJahr.size(); i++) 
		{
			toString.append(String.format("Nach dem %" + this.expOf10(this.werteProJahr.size()) + "d. Jahr haben Sie ein Kapital von %,.2f €.%n", i, this.werteProJahr.get(i - 1)));
		}
		
		
		return toString.toString();
	}
	
	private int expOf10(int zahl)
	{
		return ((zahl / 10. >= 1) ? (zahl / 100. >= 1) ? 3 : 2 : 1);
//		return Math.max(1, (int)Math.sqrt(zahl / 10));
	}
}