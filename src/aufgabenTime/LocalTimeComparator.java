package aufgabenTime;

import java.time.LocalTime;
import java.util.Comparator;

public class LocalTimeComparator implements Comparator<LocalTime>
{
	@Override
	public int compare(LocalTime t1, LocalTime t2) 
	{
		if (t1.getHour() == t2.getHour())
		{
			return t1.getMinute() - t2.getMinute();
		}
		
		return t1.getHour() - t2.getHour();
	}

}