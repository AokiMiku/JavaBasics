package aufgabenKontrollstrukturen;

import java.util.Random;

public class AufgabenSwitch {
	public static void main(String[] args) {
	
		System.out.println(vokalOderKonsonant('ä'));
		System.out.println(vokalOderKonsonant('ö'));
		System.out.println(vokalOderKonsonant('ü'));
		System.out.println(vokalOderKonsonant('ß'));
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println(vokalOderKonsonant((char)getRandomNumber('A', 'Z')));
			System.out.println(vokalOderKonsonant((char)getRandomNumber('a', 'z')));
		}
	}
	
	public static String vokalOderKonsonant(char ch)
	{
		String ausgabe = "";
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') 
				|| (ch == 'ä' || ch == 'ö' || ch == 'ü' )
				|| (ch == 'Ä' || ch == 'Ö' || ch == 'Ü' )
				|| ch == 'ß')
		{
			switch (ch)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'ä':
				case 'ö':
				case 'ü':
					ausgabe = String.format("Der Buchstabe %s ist ein Vokal.", ch);
					break;
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'Ä':
				case 'Ö':
				case 'Ü':
					ausgabe = String.format("Der Buchstabe %s ist ein Vokal.", ch);
					break;
				default:
					ausgabe = String.format("Der Buchstabe %s ist ein Konsonant.", ch);
			}
			
		}
		else
		{
			ausgabe = "Kein gültiger Wert: " + ch;
		}
		
		return ausgabe;
	}
	
	public static int getRandomNumber(int min, int max)
	{
		if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
	}
}
