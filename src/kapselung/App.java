package kapselung;

public class App 
{
	public static void main(String[] args) 
	{
		Buch buch = new Buch("978-3-86680-192-9", "Test", "ABC", 2019, 1900);

		buch.setIsbn("978-3-86680-192-9");
		//buch.setIsbn("978-3-12-732320-7");
		//buch.setIsbn("XYZ");
		System.out.println(buch);  
	}
}