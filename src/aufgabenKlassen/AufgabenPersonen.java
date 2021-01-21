package aufgabenKlassen;

public class AufgabenPersonen 
{
	public static void main(String[] args) 
	{

		Person p1 = new Person();
		p1.setVorname("Miku");
		p1.setNachname("Menzel");
		p1.setGeburtsjahr(1993);
		p1.setPlz(13583);
		
		Person p2 = new Person("Toshio", "Smith", 1992, 10367);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println(Person.getMustermann());
		
		System.out.println(new Person.PersonBuilder()
										.vorname("John")
										.nachname("Doe")
										.geburtsjahr(1987)
										.build());
	}
}