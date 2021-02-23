package mvc.model;

public class ZinsrechnerSchleifenModel implements IZinsrechnerModel
{

	@Override
	public double berechneEndkapital(double startkapital, int laufzeit, float zinsPA) 
	{
		double endkapital = startkapital;
		
		for (int i = 1; i <= laufzeit; i++)
		{
			endkapital *= (1 + zinsPA / 100.);
		}
		
		return endkapital;
	}

	@Override
	public double berechneLaufzeit(double startkapital, float zinsPA, double endkapital) 
	{
		double laufzeit = 0;
		double calcEK = startkapital;
		
		while (calcEK < endkapital)
		{
			calcEK = this.berechneEndkapital(startkapital, (int)(laufzeit += 1), zinsPA);
		}
		laufzeit--;
		
		double laufzeitEnde = this.berechneEndkapital(startkapital, (int)laufzeit + 1, zinsPA);
		double laufzeitStart = this.berechneEndkapital(startkapital, (int)laufzeit, zinsPA);//
		double diff = laufzeitEnde - laufzeitStart;
		double diffStartEnde = endkapital - laufzeitStart;
		
		System.out.println(laufzeitStart);
		System.out.println(endkapital);
		System.out.println(laufzeitEnde);
		System.out.println(diff);
		System.out.println(diffStartEnde);
		
		laufzeit += diffStartEnde / diff;
		
		return laufzeit;
	}
} 