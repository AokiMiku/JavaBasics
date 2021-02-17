package kapselung.aufgaben;

public class App 
{
	public static void main(String[] args) 
	{
		Person miku = new Person("Miku", "M.", 27, "32156");
		Person tosh = new Person("Toshio", "S.", 28, "35642");
		
		Person cynthia = new Person();
		cynthia.setVorname("Cynthia");
		cynthia.setNachname("L.");
		cynthia.setAlter(22);
		cynthia.setPlz("35462");
		
		System.out.println(miku);
		Person.testAlter(miku.getAlter());
		
		System.out.println(tosh);
		Person.testAlter(tosh.getAlter());
		
		System.out.println(cynthia);
		Person.testAlter(cynthia.getAlter());
	}
}