package kapselung;

import java.time.LocalDate;

public class Buch 
{
	private static final int MIN_ERSCHEINUNGSJAHR = 1800; 
	
	private String isbn;
	private String autor;
	private String titel;
	private int erscheinungsjahr;
	private int preis;
	private StringBuilder beschreibung;
	
	public String getIsbn() 
	{
		return isbn;
	}
	
	public void setIsbn(String isbn) 
	{
		String normalISBN = isbn.replace("-", ""); 
		if (normalISBN.length() != 13)
		{
			throw new IllegalArgumentException(String.format("Length of %s is not as expected.", isbn));
		}
		
		try
		{
			Long.parseLong(normalISBN);
		}
		catch (NumberFormatException e)
		{
			throw new IllegalArgumentException(e);
		}
		
		if (!normalISBN.substring(0, 3).equals("978") && !normalISBN.substring(0, 3).equals("979"))
		{
			throw new IllegalArgumentException(String.format("Wrong prefix: %s.", normalISBN.substring(0, 3)));
		}
		
		// start check number
		int sumForCheckNumber = 0;
		for (int i = 0; i < normalISBN.length() - 1; i++) 
		{
			if (i % 2 == 0)
			{
			 	sumForCheckNumber += Integer.parseInt(normalISBN.charAt(i) + "");	
			}
			else
			{
				sumForCheckNumber += Integer.parseInt(normalISBN.charAt(i) + "") * 3;
			}
		}
		
		int timesTen = 10;
		while (timesTen < sumForCheckNumber)
		{
			timesTen += 10;
		}
		
		int difference = timesTen - sumForCheckNumber;
		if (!(difference + "").equals(normalISBN.substring(normalISBN.length() - 1)))
		{
			throw new IllegalArgumentException("Checknumber is not valid!");
		}
		// end check number
		
		this.isbn = isbn;
	}
	
	public String getAutor() 
	{
		return autor;
	}
	
	public void setAutor(String autor) 
	{
		if (autor.length() < 2)
		{
			throw new IllegalArgumentException("Author too short! " + autor);
		}
		this.autor = autor;
	}
	
	public String getTitel() 
	{
		return titel;
	}
	
	public void setTitel(String titel) 
	{
		if (titel.length() < 2)
		{
			throw new IllegalArgumentException("Title too short! " + titel);
		}
		this.titel = titel;
	}
	
	public int getErscheinungsjahr() 
	{
		return erscheinungsjahr;
	}
	
	public void setErscheinungsjahr(int erscheinungsjahr) 
	{
		if (erscheinungsjahr < MIN_ERSCHEINUNGSJAHR || erscheinungsjahr > LocalDate.now().getYear())
		{
			throw new IllegalArgumentException("Illegal release date! " + erscheinungsjahr);
		}
		this.erscheinungsjahr = erscheinungsjahr;
	}
	
	public int getPreis() 
	{
		return preis;
	}
	
	public void setPreis(int preis) 
	{
		if (preis <= 0)
		{
			throw new IllegalArgumentException("Price is zero!");
		}
		
		this.preis = preis;
	}

	public StringBuilder getBeschreibung() 
	{
		return new StringBuilder(beschreibung);
	}

	public void setBeschreibung(StringBuilder beschreibung) 
	{ 
		if (beschreibung.length() < 5 || beschreibung.length() > 100) 
		{
			throw new IllegalArgumentException("Beschreibung zu kurz oder zu lang: " + beschreibung);
		}
		this.beschreibung = beschreibung;
	}
	
	public Buch() {}

	public Buch(String isbn, String autor, String titel, int erscheinungsjahr, int preis) 
	{
		super();
		this.setIsbn(isbn);
		this.setAutor(autor);
		this.setTitel(titel);
		this.setErscheinungsjahr(erscheinungsjahr);
		this.setPreis(preis);
	}
	
	@Override
	public String toString() 
	{
		return String.format("Buch ISBN: %s, Autor: %s, Titel: %s, Erscheinungsjahr: %d, Preis: %,.2f €, Beschreibung: %s", 
								this.isbn, this.autor, this.titel, this.erscheinungsjahr, this.preis / 100., this.beschreibung);
	}
}