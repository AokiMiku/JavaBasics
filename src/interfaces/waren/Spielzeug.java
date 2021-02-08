package interfaces.waren;

public class Spielzeug extends Ware implements Verleihbar
{
	int mindestalter;

	public Spielzeug(String bezeichnung, int preis, int mindestalter) {
		super(bezeichnung, preis);
		this.mindestalter = mindestalter;
	}

	@Override
	public int getVerleihPreis() 
	{
		return 200;
	}
	
}