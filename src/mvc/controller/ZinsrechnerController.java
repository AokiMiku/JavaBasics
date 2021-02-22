package mvc.controller;

import mvc.model.*;
import mvc.view.*;

public class ZinsrechnerController 
{
	IZinsrechnerModel model;
	ZinsrechnerView view;
	
	public ZinsrechnerController(ZinsrechnerView view) 
	{
		this.view = view;
		this.model = new ZinsrechnerMatheModel();
	}
	
	public double berechne(int modus)
	{
		switch (modus)
		{
			case 0: 
				return this.model.berechneEndkapital(modus, modus, modus);
			case 1:
				return this.model.berechneLaufzeit(modus, modus, modus);
				
			default:
				throw new IllegalArgumentException("Modus nicht definiert! " + modus);	
		}
	}
	
	public void beende()
	{
		System.exit(-1);
	}
}