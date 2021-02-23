package mvc.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import mvc.controller.ZinsrechnerController;

public class ZinsrechnerView extends JFrame
{
	JLabel lblStartkapital;
	JLabel lblEndkapital;
	JLabel lblZinsPA;
	JLabel lblLaufzeit;
	
	JTextField txtStartkapital;

	JTextField txtEndkapital;
	JTextField txtZinsPA;
	JTextField txtLaufzeit;
	
	ButtonGroup bgModus;
	JRadioButton rbEndkapital;
	JRadioButton rbLaufzeit;
	
	JButton btnBerechne;
	JButton btnLoeschen;
	JButton btnBeenden;
	
	JTextArea txtKapitalProJahr;
	
	JPanel pnlInhalt;
	
	private ZinsrechnerController controller;
	
	public JTextField getTxtStartkapital() 
	{
		return txtStartkapital;
	}
	
	public JTextField getTxtEndkapital() 
	{
		return txtEndkapital;
	}
	
	public JTextField getTxtZinsPA() 
	{
		return txtZinsPA;
	}
	
	public JTextField getTxtLaufzeit() 
	{
		return txtLaufzeit;
	}
	
	public JButton getBtnBerechne() 
	{
		return btnBerechne;
	}
	
	public JButton getBtnLoeschen() 
	{
		return btnLoeschen;
	}
	
	public JButton getBtnBeenden() 
	{
		return btnBeenden;
	}
	
	public JRadioButton getRbEndkapital() 
	{
		return rbEndkapital;
	}

	public JRadioButton getRbLaufzeit() 
	{
		return rbLaufzeit;
	}
	
	public JTextArea getTxtKapitalProJahr()
	{
		return txtKapitalProJahr;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7724141876436082632L;
	
	public ZinsrechnerView() 
	{
		super("Zinsrechner");
		this.setSize(400, 600);
		this.setMinimumSize(new Dimension(400, 600));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.controller = new ZinsrechnerController(this);
		this.initComponents();
		this.addComponents();
		this.setVisible(true);
		this.addWindowListener(this.controller);
	}
	
	public void initComponents()
	{
		this.lblEndkapital = new JLabel("Endkapital");
		this.lblLaufzeit = new JLabel("Laufzeit in Jahren");
		this.lblStartkapital = new JLabel("Startkapital");
		this.lblZinsPA = new JLabel("Zinssatz p.a. in Prozent");
		
		this.txtEndkapital = new JTextField(10);
		this.txtEndkapital.setEditable(false);
		this.txtLaufzeit = new JTextField(10);
		this.txtStartkapital = new JTextField(10);
		this.txtZinsPA = new JTextField(10);
		
		this.bgModus = new ButtonGroup();
		this.rbEndkapital = new JRadioButton("Endkapital");
		this.rbEndkapital.setSelected(true);
		this.rbEndkapital.addActionListener(this.controller);
		this.rbLaufzeit = new JRadioButton("Laufzeit");
		this.rbLaufzeit.addActionListener(this.controller);
		
		this.btnBeenden = new JButton("Beenden");
		this.btnBeenden.addActionListener(this.controller);
		this.btnBerechne = new JButton("Berechne");
		this.btnBerechne.addActionListener(this.controller);
		this.btnLoeschen = new JButton("Löschen");
		this.btnLoeschen.addActionListener(controller);
		
		this.txtKapitalProJahr = new JTextArea();
		this.txtKapitalProJahr.setEditable(false);

		this.pnlInhalt = new JPanel();
	}
	
	public void addComponents()
	{
		this.pnlInhalt.setLayout(new GridBagLayout());
		GridBagConstraints c;
		
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.NONE;
		c.ipadx = 20;
		c.ipady = 20;
		c.weightx = 0.5;
		c.weighty = 0.2;
		c.gridwidth = 2;
		
		c.gridx = 0;
		c.gridy = 0;
		this.pnlInhalt.add(this.lblStartkapital, c);
		
		c.gridx = 2;
		c.gridy = 0;		
		this.pnlInhalt.add(this.txtStartkapital, c);
		
		c.gridx = 0;
		c.gridy = 2;		
		this.pnlInhalt.add(this.lblZinsPA, c);
		
		c.gridx = 2;
		c.gridy = 2;		
		this.pnlInhalt.add(this.txtZinsPA, c);
		
		c.gridx = 0;
		c.gridy = 1;		
		this.pnlInhalt.add(this.lblLaufzeit, c);
		//
		c.gridx = 2;
		c.gridy = 1;		
		this.pnlInhalt.add(this.txtLaufzeit, c);
		
		c.gridx = 0;
		c.gridy = 3;		
		this.pnlInhalt.add(this.lblEndkapital, c);
		
		c.gridx = 2;
		c.gridy = 3;		
		this.pnlInhalt.add(this.txtEndkapital, c);
		
		c.gridx = 0;
		c.gridy = 4;		
		this.pnlInhalt.add(this.rbEndkapital, c);
		this.bgModus.add(this.rbEndkapital);
		
		c.gridx = 2;
		c.gridy = 4;		
		this.pnlInhalt.add(this.rbLaufzeit, c);
		this.bgModus.add(this.rbLaufzeit);
		
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 5;
		this.pnlInhalt.add(this.btnBerechne, c);
		
		c.gridx = 1;
		c.gridy = 5;		
		this.pnlInhalt.add(this.btnLoeschen, c);
		
		c.gridx = 2;
		c.gridy = 5;		
		this.pnlInhalt.add(this.btnBeenden, c);
		
		c.gridwidth = 3;
		c.gridheight = 3;
		c.fill = GridBagConstraints.BOTH;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 7;
		this.pnlInhalt.add(this.txtKapitalProJahr, c);
		
		this.setContentPane(this.pnlInhalt);
	}
}