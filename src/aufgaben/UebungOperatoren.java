package aufgaben;

public class UebungOperatoren {

	public static void main(String[] args) {
		
		int anzahlFlaschen = 13;
		
		int anzahlFlaschenProKiste = 6;
		int anzahlKisten = 0;
		
		while (anzahlFlaschen >= anzahlFlaschenProKiste)
		{
			anzahlFlaschen -= anzahlFlaschenProKiste;
			
			System.out.format("Die %d. Kiste wurde gefuellt.\n", ++anzahlKisten);
		}
		
		System.out.format("Es sind %d Flaschen uebrig.\n", anzahlFlaschen);
	}

}
