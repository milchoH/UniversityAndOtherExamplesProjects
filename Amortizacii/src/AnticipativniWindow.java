import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnticipativniWindow extends JFrame {

	private JPanel contentPane;
	private JTextField pTF;
	private JTextField PaResultTF;
	private JTextField PaTF;
	private JTextField pResultTF;
	double Pa,PaP, p, pPa;

	/**
	 * Launch the application.
	 */
	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnticipativniWindow frame = new AnticipativniWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AnticipativniWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TopLabel = new JLabel("Anticipativni amortizacionni otchisleniq");
		TopLabel.setBounds(26, 11, 376, 29);
		TopLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(TopLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("asd\r\n");
		tabbedPane.setBounds(10, 51, 414, 97);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Izchislqvane na Pa ot p", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblP = new JLabel("p=");
		lblP.setBounds(10, 11, 25, 14);
		panel.add(lblP);
		
		pTF = new JTextField();
		pTF.setBounds(45, 8, 86, 20);
		panel.add(pTF);
		pTF.setColumns(10);
		
		JLabel label = new JLabel("%");
		label.setBounds(141, 11, 25, 14);
		panel.add(label);
		
		JButton CalcPaButton = new JButton("Izchislenie");
		CalcPaButton.setBounds(162, 7, 89, 23);
		panel.add(CalcPaButton);
		
		JLabel lblPa = new JLabel("Pa = 100*p/100-p =");
		lblPa.setBounds(10, 39, 106, 14);
		panel.add(lblPa);
		
		PaResultTF = new JTextField();
		PaResultTF.setBounds(126, 36, 238, 20);
		panel.add(PaResultTF);
		PaResultTF.setColumns(10);
		PaResultTF.setEditable(false);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Izchislqvane na p ot Pa", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pa = ");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel_1.add(lblNewLabel);
		
		PaTF = new JTextField();
		PaTF.setBounds(44, 8, 86, 20);
		panel_1.add(PaTF);
		PaTF.setColumns(10);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(140, 11, 20, 14);
		panel_1.add(label_1);
		
		JButton CalcPButton = new JButton("Izchislenie");

		CalcPButton.setBounds(162, 7, 89, 23);
		panel_1.add(CalcPButton);
		
		JLabel lblNewLabel_1 = new JLabel("p = 100*Pa/100-Pa =");
		lblNewLabel_1.setBounds(10, 42, 105, 14);
		panel_1.add(lblNewLabel_1);
		
		pResultTF = new JTextField();
		pResultTF.setBounds(125, 39, 254, 20);
		panel_1.add(pResultTF);
		pResultTF.setColumns(10);
		pResultTF.setEditable(false);
		
		CalcPaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pa = Integer.parseInt(pTF.getText());
				if(Pa < 0 || Pa > 99.9999){
					JOptionPane.showMessageDialog(null,"Validni sa chislata ot 0 do 99.9999");
				}
				else {
				PaP = ((100*Pa)/(100-Pa));
				PaResultTF.setText(PaP + " %");
				}
		//		PaResultTF.setEditable(false);
			}
		});
		CalcPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pPa = Integer.parseInt(PaTF.getText());
				if(pPa<0 || pPa>100){
					JOptionPane.showMessageDialog(null, "Validni sa vsichki realni chisla ot 0 do 100");
				}else{			
				p = ((100*pPa) / (100+pPa));
				pResultTF.setText(p + " %");
				}
			//	pResultTF.setEditable(false);
				
			}
		});
	
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		ExitButton.setBounds(335, 159, 89, 23);
		contentPane.add(ExitButton);
	}
}
