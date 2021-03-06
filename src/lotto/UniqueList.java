package lotto;

import java.util.ArrayList;

public class UniqueList<E> extends ArrayList<E> 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5075196361699225408L;

	public int countOf(E element)
	{
		int countOf = 0;
		for (E iterable_element : this) 
		{
			if (element.equals(iterable_element))
			{
				countOf++;
			}
		}
		return countOf;
	}
	
	@Override
	public boolean add(E element)
	{
		if (this.countOf(element) >= 1)
		{
			return false;
		}
		
		return super.add(element);				
	}
}