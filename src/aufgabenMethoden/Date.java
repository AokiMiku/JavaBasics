package aufgabenMethoden;

public class Date
{
	private int Day = 1;
	private int Month = 1;
	private int Year = 1;
	
	public int getDay() 
	{
		return Day;
	}
	public void setDay(int day) 
	{
		while (day < 1)
		{
			setMonth(getMonth() - 1);
			day += getDaysInMonth(getMonth(), getYear());
		}
		while (day > getDaysInMonth(getMonth(), getYear()))
		{
			day -= getDaysInMonth(getMonth(), getYear());
			setMonth(getMonth() + 1);
		}
		
		Day = day;
	}
	public int getMonth() 
	{
		return Month;
	}
	public void setMonth(int month) 
	{
		while (month < 1)
		{
			setYear(getYear() - 1);
			month += 12;
		}
		while (month > 12)
		{
			month -= 12;
			setYear(getYear() + 1);
		}
		
		Month = month;
	}
	public int getYear() 
	{
		return Year;
	}
	public void setYear(int year) 
	{
		Year = year;
	}
	
	public int getDaysInMonth(int month, int year)
	{
		if (month == 1 || month == 3 || month == 5 
				|| month == 7 || month == 8 || month == 10
						|| month == 12)
		{
			return 31;
		}
		else if (month == 4 || month == 6 || month == 9 
				|| month == 11)
		{
			return 30;
		}
		else if (month == 2)
		{
			if (IstSchaltjahr(year))
			{
				return 29;
			}
			else
			{
				return 28;
			}
		}
		else
		{
			return 0;
		}
	}
	
	public void setDate(String date)
	{
		String[] dayMonthYear = date.split(".");
		setYear(Integer.parseInt(dayMonthYear[2]));
		setMonth(Integer.parseInt(dayMonthYear[1]));
		setDay(Integer.parseInt(dayMonthYear[0]));
	}
	
	public void setDate(int day, int month, int year)
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public Date(int day, int month, int year)
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public Date()
	{
		setDay(1);
		setMonth(1);
		setYear(1);
	}
	
	public String toString()
	{
		return String.format("%02d.%02d.%04d", getDay(), getMonth(), getYear());
	}
	
	public boolean equals(Date other)
	{
		return (this.getYear() == other.getYear() 
				&& this.getMonth() == other.getMonth() 
				&& this.getDay() == other.getDay());
	}
	
	public static Date Add(Date left, Date right)
	{
		Date result = new Date();
		
		result.setYear(left.Year + right.Year);
		result.setMonth(left.Month + right.Month);
		result.setDay(left.Day + right.Day);
		
		return result;
	}
	
	public static Date Substract(Date left, Date right)
	{
		Date result = new Date();
		
		result.setYear(left.Year - right.Year);
		result.setMonth(left.Month - right.Month);
		result.setDay(left.Day - right.Day);
		
		return result;
	}
	
	public static int DaySpan(Date left, Date right)
	{
		int daySpan = 0;
		
		// rechtes Jahr groesser
		if (left.getYear() < right.getYear())
		{
			while (!left.equals(right))
			{
				daySpan++;
				right.setDay(right.getDay() - 1);
			}
		}
		// linkes Jahr groesser
		else if (left.getYear() > right.getYear())
		{
			while (!left.equals(right))
			{
				daySpan++;
				left.setDay(left.getDay() - 1);
			}
		}
		// gleiches Jahr
		else
		{
			if (left.getMonth() == right.getMonth())
			{
				return Math.abs(left.getDay() - right.getDay());
			}
			else if (left.getMonth() < right.getMonth())
			{
				while (!left.equals(right))
				{
					daySpan++;
					right.setDay(right.getDay() - 1);
				}
			}
			else if (left.getMonth() > right.getMonth())
			{
				while (!left.equals(right))
				{
					daySpan++;
					right.setDay(right.getDay() + 1);
				}
			}
		}
		
		return daySpan;
	}
	
	public boolean IstSchaltjahr(int year)
	{
		boolean schaltjahr = false;
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				schaltjahr = true;
			}
		}
		else {
			if (year % 4 == 0) {
				schaltjahr = true;
			}
		}
		
		return schaltjahr;
	}
}