package nahverkehr;

public class App 
{
	public static void main(String[] args) 
	{
		Bus b1 = new Bus(130, "Smith", "S Stresow", "Waldkrankenhaus", 99);
		Bus b2 = new Bus(130, "Menzel", "Waldkrankenhaus","S Stresow", 99);
		SBahn s1 = new SBahn(9, "Leﬂner", "S Spandau", "S Mahlsdorf", "Sokolski", 4, 150);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(s1));
	}
}