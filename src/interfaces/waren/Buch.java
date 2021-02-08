package interfaces.waren;

public class Buch extends Ware implements Verleihbar
{
	private String autor;

	public String getAutor() 
	{
		return autor;
	}

	public void setAutor(String autor) 
	{
		this.autor = autor;
	}
	
	public Buch(String titel, int preis, String autor) 
	{
		super (titel, preis);
		this.setAutor(autor);
	}
	
	public String toString()
	{
		return super.toString() + String.format(", Autor: %s", this.getAutor());
	}

	@Override
	public int getVerleihPreis() 
	{
		return 200;
	}
}