package mvc;

import mvc.controller.ZinsrechnerController;
import mvc.view.ZinsrechnerView;

public class AppZinsrechner 
{
	public static void main(String[] args) 
	{
		new ZinsrechnerController(new ZinsrechnerView());
	}
}