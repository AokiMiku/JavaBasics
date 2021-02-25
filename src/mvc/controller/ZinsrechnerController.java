package mvc.controller;

import java.awt.event.*;

import javax.swing.JOptionPane;

import mvc.model.*;
import mvc.view.*;

public class ZinsrechnerController extends WindowAdapter implements ActionListener, KeyListener
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
		double laufzeit = 0;
		double endkapital = 0;
		double startkapital = Double.parseDouble(this.view.getTxtStartkapital().getText().replace(",", "."));
		float zinsPA = Float.parseFloat(this.view.getTxtZinsPA().getText().replace(",", "."));
		switch (modus)//
		{
			case 0:
				this.view.getTxtKapitalProJahr().setText("");
				laufzeit = Double.parseDouble(this.view.getTxtLaufzeit().getText().replace(",", "."));
				for (int i = 1; i <= laufzeit; i++)
				{
					if (i == 1)
					{
						this.view.getTxtKapitalProJahr().setText(String.format("%10s| %,30.2f",  i, this.model.berechneEndkapital(startkapital, i, zinsPA)));
					}
					else
					{
						this.view.getTxtKapitalProJahr().setText(String.format("%s %n%10s| %,30.2f", this.view.getTxtKapitalProJahr().getText(), i, this.model.berechneEndkapital(startkapital, i, zinsPA)));
					}
				}
				return this.model.berechneEndkapital(startkapital, (int)laufzeit, zinsPA);
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
	
	private void showInfo()
	{
		JOptionPane.showMessageDialog(this.view, String.format("Zinsrechner%nAutorin: Melissa Miku Menzel"));
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
		this.view.getTxtStartkapital().requestFocusInWindow();
		
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
				this.berechne(0);
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
		else if (e.getSource() == this.view.getMniInfo())
		{
			this.showInfo();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		this.beenden();
	}
	
	@Override
	public void windowOpened(WindowEvent e) 
	{
		this.view.getTxtStartkapital().requestFocusInWindow();
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == 10)
		{
			if (e.getSource() == this.view.getTxtStartkapital())
			{
				this.view.getTxtZinsPA().requestFocusInWindow();
			}
			else if (e.getSource() == this.view.getTxtZinsPA())
			{
				if (this.getModus() == 0)
				{
					this.view.getTxtLaufzeit().requestFocusInWindow();
				}
				else if (this.getModus() == 1)
				{
					this.view.getTxtEndkapital().requestFocusInWindow();
				}
			}
			else if (e.getSource() == this.view.getTxtLaufzeit() || e.getSource() == this.view.getTxtEndkapital())
			{
				this.view.getBtnBerechne().doClick();
			}
			System.out.println("-----");
		}
		else if (e.getKeyCode() == 27)
		{
			this.beenden();
		}
		else
		{
			System.out.println(String.format("%s (%s): %s", e.getKeyChar(), (int)e.getKeyChar(), e.getKeyCode()));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
	
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		if ((e.getKeyChar() > '9' || e.getKeyChar() < '0') && e.getKeyChar() != ',' && e.getKeyChar() != '.' && e.getKeyCode() != 0)
		{
			System.out.println("Falsch! Code: " + e.getKeyCode() + " Char: " + e.getKeyChar());
			throw new IllegalArgumentException();
		}	
	}
}