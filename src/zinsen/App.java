package zinsen;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Rechner r = new Rechner(1000, 5, 5);
		r.berechne();
		System.out.println(r);
		
		System.out.println("************");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie das Startkapital ein: ");
		r.setStartKapital(sc.nextDouble());

		System.out.print("Bitte geben Sie die Laufzeit int Jahren ein: ");
		r.setLaufzeit(sc.nextInt());
		
		System.out.print("Bitte geben Sie den Zinssatz in Prozent ein: ");
		r.setZinsPA(sc.nextFloat());
		
		sc.close();
		r.berechne();
		
		System.out.println("************");
		System.out.println(r);
	}
}