package wrapper;

import java.util.ArrayList;

public class WrapperDoubleTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> temperaturen = new ArrayList<>();
		temperaturen.add(-5.6);
		temperaturen.add(-7.5);
		//temperaturen.add( 9.1);
		temperaturen.add( 6.8);
		temperaturen.add(-3.4);
		temperaturen.add(-2.6);
		temperaturen.add( 1.2);
		
		temperaturen.forEach(System.out::println);
		
		double sum = 0;
		for (Double t : temperaturen) 
		{
			sum += t;
		}
		double avg = sum / temperaturen.size();
		
		double min = temperaturen.get(0);
		for (Double t : temperaturen) 
		{
			if (t < min)
			{
				min = t;
			}
		}	
		
		double max = temperaturen.get(0);
		for (Double t : temperaturen) 
		{
			if (t > max)
			{
				max = t;
			}
		}	
		
		int decimals = 1;
		System.out.println(String.format("Summe: %." + decimals + "f °C, Durchschnitt: %." + decimals + "f °C, Min: %." + decimals + "f °C, Max: %." + decimals + "f °C%n"
										, sum, avg, min, max));
	}
}