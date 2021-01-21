package aufgabenMethoden;

public class AufgabenMethodenZeitspanne 
{
	public static void main(String[] args) 
	{
		System.out.println(getZeitspanneInGanzenTagen(new Date(15,9,2021), new Date(14,2,2022)));
		System.out.println(getZeitspanneInGanzenTagen(new Date(14,2,2022), new Date(15,9,2021)));
		System.out.println(getZeitspanneInGanzenTagen(new Date(19,9,2021), new Date(15,9,2021)));
	}
	
	static int getZeitspanneInGanzenTagen(Date tag1, Date tag2)
	{
		return Date.DaySpan(tag1, tag2);
	}
}