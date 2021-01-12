package aufgabenKontrollstrukturen;

public class AufgabenKontrollstrukturenSwitchIfAmpelfarben {
	public static void main(String[] args) {

		String farbe = "Grün";
		String ausgabe = "";
		farbe = farbe.toLowerCase();
		
		switch (farbe)
		{
			case "rot":
				ausgabe = "Rot. Bitte warten.";
				break;
			case "gelb":
				ausgabe = "Gelb. Gleich geht es los.";
				break;
			case "grün":
				ausgabe = "Grün. Weg frei.";
				break;
			default:
				ausgabe = String.format("Fehler! Die Farbe %s gibt es nicht.", farbe);
		}
		
		System.out.println(ausgabe);
		
		if (farbe.equals("rot"))
		{
			ausgabe = "Rot. Bitte warten.";
		}
		else if (farbe.equals("gelb"))
		{
			ausgabe = "Gelb. Gleich geht es los.";
		}
		else if (farbe.equals("grün"))
		{
			ausgabe = "Grün. Weg frei.";
		}
		else
		{
			ausgabe = String.format("Fehler! Die Farbe %s gibt es nicht.", farbe);
		}

		System.out.println(ausgabe);
		
	}
}