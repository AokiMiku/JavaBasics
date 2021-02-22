package mvc.model;

public class ZinsrechnerMatheModel implements IZinsrechnerModel
{

	@Override
	public double berechneEndkapital(double startkapital, int laufzeit, float zinsPA) 
	{
		return startkapital * Math.pow((1 + zinsPA / 100.), laufzeit);
	}

	@Override
	public double berechneLaufzeit(double startkapital, float zinsPA, double endkapital) 
	{
		return Math.log(endkapital / startkapital) / Math.log(1 + zinsPA / 100.);
	}
}