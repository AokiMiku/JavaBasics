package mvc.controller;

import java.awt.event.*;

import javax.swing.JOptionPane;

import mvc.model.*;
import mvc.view.*;

public class ZinsrechnerController extends WindowAdapter implements ActionListener
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
		int laufzeit = 0;
		double endkapital = 0;
		double startkapital = Double.parseDouble(this.view.getTxtStartkapital().getText().replace(",", "."));
		float zinsPA = Float.parseFloat(this.view.getTxtZinsPA().getText().replace(",", "."));
		switch (modus)
		{
			case 0:
				this.view.getTxtKapitalProJahr().setText("");
				laufzeit = Integer.parseInt(this.view.getTxtLaufzeit().getText());
				for (int i = 1; i <= laufzeit; i++)
				{
					this.view.getTxtKapitalProJahr().setText(String.format("%s %n%20s %,40.2f", this.view.getTxtKapitalProJahr().getText(), i, this.model.berechneEndkapital(startkapital, i, zinsPA)));
				}
				return this.model.berechneEndkapital(startkapital, laufzeit, zinsPA);
			case 1:
				endkapital = Double.parseDouble(this.view.getTxtEndkapital().getText().replace(",", "."));
				return this.model.berechneLaufzeit(startkapital, zinsPA, endkapital);
				
			default:
				throw new IllegalArgumentException("Modus nicht definiert! " + modus);	
		}
	}
	
	private void beenden() 
	{
		if (JOptionPane.showConfirmDialog(this.view, "Wirklich beenden?", "Beenden", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
	}

	private int getModus()
	{
		if (this.view.getRbEndkapital().isSelected())
		{
			return 0;
		}
		if (this.view.getRbLaufzeit().isSelected())
		{
			return 1;
		}
		
		return -1;
	}
	
	private void switchModus()
	{
		this.clearView();
		
		if (this.getModus() == 0)
		{
			this.view.getTxtEndkapital().setEditable(false);
			this.view.getTxtLaufzeit().setEditable(true);
		}
		else if (this.getModus() == 1)
		{
			this.view.getTxtEndkapital().setEditable(true);
			this.view.getTxtLaufzeit().setEditable(false);
		}
	}

	private void clearView() 
	{
		this.view.getTxtEndkapital().setText("");
		this.view.getTxtLaufzeit().setText("");
		this.view.getTxtStartkapital().setText("");
		this.view.getTxtZinsPA().setText("");
		this.view.getTxtKapitalProJahr().setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == this.view.getBtnBeenden())
		{
			this.beenden();
		}
		else if (e.getSource() == this.view.getBtnBerechne())
		{
			if (this.getModus() == 0)
			{
				this.view.getTxtEndkapital().setText(String.format("%,.2f", this.berechne(0)));
			}
			else if (this.getModus() == 1)
			{
				this.view.getTxtLaufzeit().setText(String.format("%,.2f", this.berechne(1)));
			}
		}
		else if (e.getSource() == this.view.getRbEndkapital() || e.getSource() == this.view.getRbLaufzeit())
		{
			this.switchModus();
		}
		else if (e.getSource() == this.view.getBtnLoeschen())
		{
			this.clearView();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		this.beenden();
	}
}