package mvc.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.*;

import mvc.controller.ZinsrechnerController;

public class ZinsrechnerView extends JFrame
{
	private JLabel lblStartkapital;
	private JLabel lblEndkapital;
	private JLabel lblZinsPA;
	private JLabel lblLaufzeit;
	
	private JTextField txtStartkapital;

	private JTextField txtEndkapital;
	private JTextField txtZinsPA;
	private JTextField txtLaufzeit;
	
	private ButtonGroup bgModus;
	private JRadioButton rbEndkapital;
	private JRadioButton rbLaufzeit;
	
	private JButton btnBerechne;
	private JButton btnLoeschen;
	private JButton btnBeenden;
	
	private JTextArea txtKapitalProJahr;
	
	private JPanel pnlView;
	private JPanel pnlInhalt;
	private JPanel pnlButtons;
	private JPanel pnlText;
	private JScrollPane spnText;
	
	private Color backgroundColor = new Color(20, 168, 121);
	private Color fontColor = new Color(255, 255, 255);

	private Color borderColor = new Color(0, 0, 0);
//	private int buttonBorderThickness = 1;
	private Border buttonBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED, this.borderColor.brighter(), this.borderColor.darker());
//	private Border buttonBorder = BorderFactory.createCompoundBorder(
//									BorderFactory.createBevelBorder(BevelBorder.RAISED, this.borderColor.brighter(), this.borderColor.darker()), 
//									BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
	private java.awt.Cursor buttonCursor = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
	
	private Font textFont = new Font("Consolas", Font.PLAIN, 14);
	private Font labelFont = new Font("Arial", Font.PLAIN, 14);

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
		this.setSize(500, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.controller = new ZinsrechnerController(this);
		this.initComponents();
		this.addComponents();
		this.styleComponents();
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
		this.txtEndkapital.addKeyListener(this.controller);
		
		this.txtLaufzeit = new JTextField(10);
		this.txtLaufzeit.addKeyListener(this.controller);
		
		this.txtStartkapital = new JTextField(10);
		this.txtStartkapital.addKeyListener(this.controller);
		
		this.txtZinsPA = new JTextField(10);
		this.txtZinsPA.addKeyListener(this.controller);
		
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
		
		this.txtKapitalProJahr = new JTextArea(15, 40);
		this.txtKapitalProJahr.setEditable(false);

		this.pnlView = new JPanel();
		this.pnlInhalt = new JPanel();
		this.pnlButtons = new JPanel();
		this.pnlText = new JPanel();
		this.spnText = new JScrollPane(this.txtKapitalProJahr);
		this.spnText.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.spnText.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}
	
	public void addComponents()
	{
		this.pnlView.setLayout(new FlowLayout(FlowLayout.CENTER, 10000, 15));
		this.pnlInhalt.setLayout(new GridLayout(5, 2, 20, 20));
		this.pnlButtons.setLayout(new GridLayout(1, 3, 5, 5));
		this.pnlText.setLayout(new GridLayout(1, 1, 10, 10));

		this.pnlInhalt.add(this.rbEndkapital);
		this.bgModus.add(this.rbEndkapital);
		this.pnlInhalt.add(this.rbLaufzeit);
		this.bgModus.add(this.rbLaufzeit);
		
		this.pnlInhalt.add(this.lblStartkapital);
		this.pnlInhalt.add(this.txtStartkapital);
		
		this.pnlInhalt.add(this.lblZinsPA);
		this.pnlInhalt.add(this.txtZinsPA);
		
		this.pnlInhalt.add(this.lblLaufzeit);
		this.pnlInhalt.add(this.txtLaufzeit);
		
		this.pnlInhalt.add(this.lblEndkapital);
		this.pnlInhalt.add(this.txtEndkapital);

		this.pnlButtons.add(this.btnBerechne);
		this.pnlButtons.add(this.btnLoeschen);
		this.pnlButtons.add(this.btnBeenden);
		
		this.pnlText.add(this.spnText);
		
		this.pnlView.add(this.pnlInhalt);
		this.pnlView.add(this.pnlButtons);
		this.pnlView.add(this.pnlText);
		this.setContentPane(this.pnlView);
	}
	
	private void styleComponents()
	{
		// Panels ==================================================================
		this.pnlView.setBackground(this.backgroundColor);
		this.pnlView.setForeground(this.fontColor);
		
		this.pnlInhalt.setBackground(this.backgroundColor);
		this.pnlInhalt.setForeground(this.fontColor);
		
		this.pnlButtons.setBackground(this.backgroundColor);
		this.pnlButtons.setForeground(this.fontColor);
		
		this.pnlText.setBackground(this.backgroundColor);
		this.pnlText.setForeground(this.fontColor);

		this.spnText.setBorder(null);
		
		// RadioButtons ==================================================================
		this.rbEndkapital.setBackground(this.backgroundColor);
		this.rbEndkapital.setForeground(this.fontColor);
		this.rbEndkapital.setFont(this.labelFont);

		this.rbLaufzeit.setBackground(this.backgroundColor);
		this.rbLaufzeit.setForeground(this.fontColor);
		this.rbLaufzeit.setFont(this.labelFont);
		
		// Buttons ==================================================================
		this.btnBeenden.setBackground(this.backgroundColor);
		this.btnBeenden.setForeground(this.fontColor);
		this.btnBeenden.setBorder(this.buttonBorder);
		this.btnBeenden.setCursor(buttonCursor);
		this.btnBeenden.setFont(this.labelFont);
		
		this.btnBerechne.setBackground(this.backgroundColor);
		this.btnBerechne.setForeground(this.fontColor);
		this.btnBerechne.setBorder(this.buttonBorder);
		this.btnBerechne.setCursor(buttonCursor);
		this.btnBerechne.setFont(this.labelFont);
		
		this.btnLoeschen.setBackground(this.backgroundColor);
		this.btnLoeschen.setForeground(this.fontColor);
		this.btnLoeschen.setBorder(this.buttonBorder);
		this.btnLoeschen.setCursor(buttonCursor);
		this.btnLoeschen.setFont(this.labelFont);
		
		// Labels ==================================================================
		this.lblEndkapital.setForeground(this.fontColor);
		this.lblEndkapital.setFont(this.labelFont);
		
		this.lblLaufzeit.setForeground(this.fontColor);
		this.lblLaufzeit.setFont(this.labelFont);
		
		this.lblStartkapital.setForeground(this.fontColor);
		this.lblStartkapital.setFont(this.labelFont);
		
		this.lblZinsPA.setForeground(this.fontColor);
		this.lblZinsPA.setFont(this.labelFont);
		
		// Text Components ==================================================================
		this.txtKapitalProJahr.setFont(this.textFont);
		this.txtKapitalProJahr.setBackground(this.backgroundColor);
		this.txtKapitalProJahr.setForeground(this.fontColor);
		
		this.txtEndkapital.setFont(this.textFont);
		
		this.txtLaufzeit.setFont(this.textFont);
		
		this.txtStartkapital.setFont(this.textFont);
		
		this.txtZinsPA.setFont(this.textFont);
	}
}