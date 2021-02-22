package mvc.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
	
	JButton btnBerechne;
	JButton btnBeenden;
	
	JPanel pnlInhalt;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7724141876436082632L;
	
	public ZinsrechnerView() 
	{
		super("Zinsrechner");
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setResizable(false);
		this.initComponents();
		this.addComponents();
		this.setVisible(true);
	}
	
	public void initComponents()
	{
		this.lblEndkapital = new JLabel("Endkapital");
		this.lblLaufzeit = new JLabel("Laufzeit in Jahren");
		this.lblStartkapital = new JLabel("Startkapital");
		this.lblZinsPA = new JLabel("Zinssatz p.a. in Prozent");
		
		this.txtEndkapital = new JTextField(10);
		this.txtLaufzeit = new JTextField(10);
		this.txtStartkapital = new JTextField(10);
		this.txtZinsPA = new JTextField(10);
		
		this.btnBeenden = new JButton("Beenden");
		this.btnBeenden.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.btnBerechne = new JButton("Berechne");
		
		this.pnlInhalt = new JPanel();
	}
	
	public void addComponents()
	{
		this.pnlInhalt.add(this.lblEndkapital);
		this.pnlInhalt.add(this.txtEndkapital);
		this.pnlInhalt.add(this.lblLaufzeit);
		this.pnlInhalt.add(this.txtLaufzeit);
		this.pnlInhalt.add(this.lblStartkapital);
		this.pnlInhalt.add(this.txtStartkapital);
		this.pnlInhalt.add(this.lblZinsPA);
		this.pnlInhalt.add(this.txtZinsPA);
		
		this.pnlInhalt.add(this.btnBerechne);
		this.pnlInhalt.add(this.btnBeenden);
		
		this.setContentPane(this.pnlInhalt);
		this.pnlInhalt.setLayout(new GridLayout(5, 2, 10, 10));
		
	}
}