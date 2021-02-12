package lotto;

import java.util.*;

import basics.*;

public class App 
{
	public static void main(String[] args) 
	{
		UniqueList<Integer> lottoZahlen = new UniqueList<Integer>();
		
		for (int i = 0; i < 6; i++) 
		{
			int zahl = 0;
			do
			{ 
				zahl = RandomGenerator.getRandomNumber(1, 49);
			} while (!lottoZahlen.add(zahl));
		}
		
		lottoZahlen.sort(Comparator.naturalOrder());
		lottoZahlen.forEach(System.out::println);
	}
}
