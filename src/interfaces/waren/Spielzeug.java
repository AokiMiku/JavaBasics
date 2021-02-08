package interfaces.waren;

public class Spielzeug extends Ware implements Verleihbar
{
	private int mindestalter;
	private int verleihpreis;

	public int getMindestalter() 
	{
		return mindestalter;
	}

	public void setMindestalter(int mindestalter) 
	{
		this.mindestalter = mindestalter;
	}

	public Spielzeug(String bezeichnung, int preis, int mindestalter) {
		super(bezeichnung, preis);
		this.setMindestalter(mindestalter);
	}

	@Override
	public double getVerleihpreis() 
	{
		return this.verleihpreis / 100.;
	}

	@Override
	public void setVerleihpreis(int preis) 
	{
		this.verleihpreis = preis * 100;
	}
	
}