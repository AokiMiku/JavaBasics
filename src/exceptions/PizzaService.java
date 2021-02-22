package exceptions;

class BadFoodException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1007742965595828881L;
	
	public BadFoodException(String foodName)
	{
		super(foodName);
	}
}

class IllegalToppingsCountException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7725132444157613498L;
	
	
	public IllegalToppingsCountException()
	{
		super("Illegal count of toppings! Has to be: " + Pizza.toppingCount);
	}
}

class Pizza
{
	public static final int toppingCount = 3;
	String[] belaege = new String[toppingCount];
	
	public Pizza(String[] belaege) 
	{
		for (int i = 0; i < belaege.length; i++) 
		{
			this.belaege[i] = belaege[i];
		}
	}
	
	@Override
	public String toString() 
	{		
		String toString = "Pizza mit ";
		
		for (int i = 0; i < this.belaege.length; i++) 
		{
			if (i == this.belaege.length - 1)
			{
				toString += "und " + this.belaege[i] + ".";
			}
			else
			{
				toString += this.belaege[i] + ", ";
			}
		}
		
		return toString;
	}
}

public class PizzaService 
{
	public static void main(String[] belaege) throws BadFoodException 
	{
		if (belaege.length != Pizza.toppingCount) 
		{
			throw new IllegalToppingsCountException();
		}
		
		for (int i = 0; i < belaege.length; i++) 
		{
			switch (belaege[i].toLowerCase())
			{
				case "tomaten":
					break;
				case "pilze":
					break;
				case "salami":
					break;
				case "schinken":
					break;
				case "artischocken":
					break;
				case "käse":
					break;
				case "brokkoli":
					break;
					
				default:
					throw new BadFoodException(belaege[i]);
			}
		}
		
		System.out.println(new Pizza(belaege));
	}
}