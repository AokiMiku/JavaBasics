package interfaces;

import java.util.function.Predicate;

public class PredicateStringGreater5 implements Predicate<String>
{
	@Override
	public boolean test(String s) 
	{
		return s.length() > 5;
	}
}