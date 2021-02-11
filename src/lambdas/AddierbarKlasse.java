package lambdas;

public class AddierbarKlasse implements Addierbar
{
	@Override
	public int addieren(int zahl1, int zahl2) 
	{
		return zahl1 + zahl2;
	}
}