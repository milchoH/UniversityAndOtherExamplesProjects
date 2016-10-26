import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class CalcInterestWindow extends JFrame {

	private JPanel contentPane;
	private JTextField PTF;
	private JTextField rTF;
	private JTextField nTF;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	float P,r;
	int n;
	double sum;
	
	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcInterestWindow frame = new CalcInterestWindow();
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
	
	public CalcInterestWindow() {


		setTitle("\u0421\u0442\u043E\u0439\u043D\u043E\u0441\u0442 \u043D\u0430 \u043F\u0430\u0440\u0438\u0442\u0435");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 960, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame ChooseInternalFrame = new JInternalFrame("\u0418\u0437\u0431\u0435\u0440\u0435\u0442\u0435");
		ChooseInternalFrame.setBounds(34, 21, 134, 103);
		contentPane.add(ChooseInternalFrame);
		ChooseInternalFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton SimpleInterestRB = new JRadioButton("\u041F\u0440\u043E\u0441\u0442\u0430 \u043B\u0438\u0445\u0432\u0430");
		SimpleInterestRB.setSelected(true);
		buttonGroup.add(SimpleInterestRB);
		ChooseInternalFrame.getContentPane().add(SimpleInterestRB);
		
		JRadioButton HardcoreInterestRB = new JRadioButton("\u0421\u043B\u043E\u0436\u043D\u0430 \u043B\u0438\u0445\u0432\u0430");
		buttonGroup.add(HardcoreInterestRB);
		ChooseInternalFrame.getContentPane().add(HardcoreInterestRB);
		
		ChooseInternalFrame.setVisible(true);
		
		JButton Calculate = new JButton("\u0418\u0437\u0447\u0438\u0441\u043B\u044F\u0432\u0430\u043D\u0435");
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(PTF.getText()=="") P = 0;
				else P=Integer.parseInt(PTF.getText());
				if(rTF.getText()=="") r = 0;
				else{
					r=Integer.parseInt(rTF.getText());
					r = r/100;
				}
				if(nTF.getText()=="") n = 0;
				else n=Integer.parseInt(nTF.getText());
				
				if(P>1000000000)
				{
					JOptionPane.showMessageDialog(null, "P - ne moje da bude poveche ot 1 000 000 000");
				}
				else if(P == 0){
					JOptionPane.showMessageDialog(null, "Molq vavedete - P");
				}
				else if(r > 100){
					JOptionPane.showMessageDialog(null, "r ne moje da bade > 100");
				}
				else if(r==0){
					JOptionPane.showMessageDialog(null, "Molq vavedete - r");
				}
				else if(n == 0){
					JOptionPane.showMessageDialog(null, "Molq vavedete - n");
				}
				else if(n>360){
					JOptionPane.showMessageDialog(null, "n ne moje da bade > 360");					
				}
				
				if (SimpleInterestRB.isSelected()){
		//			sum= P+(P*r*i);
				}
				else{
					
				}
			}
		});
		Calculate.setBounds(44, 135, 124, 23);
		contentPane.add(Calculate);
		
		JInternalFrame InputInternalFrame = new JInternalFrame("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435");
		InputInternalFrame.setBounds(178, 21, 155, 115);
		contentPane.add(InputInternalFrame);
		InputInternalFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("P =");
		lblNewLabel.setBounds(10, 11, 46, 14);
		InputInternalFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("r =");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		InputInternalFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("n =");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		InputInternalFrame.getContentPane().add(lblNewLabel_2);
		
		InputInternalFrame.setVisible(true);
		
		PTF = new JTextField();
		PTF.setBounds(35, 8, 86, 20);
		InputInternalFrame.getContentPane().add(PTF);
		PTF.setColumns(10);
		
		rTF = new JTextField();
		rTF.setBounds(35, 33, 86, 20);
		InputInternalFrame.getContentPane().add(rTF);
		rTF.setColumns(10);
		
		nTF = new JTextField();
		nTF.setBounds(35, 61, 86, 20);
		InputInternalFrame.getContentPane().add(nTF);
		nTF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u043B\u0432.");
		lblNewLabel_3.setBounds(125, 11, 46, 14);
		InputInternalFrame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("%");
		label.setBounds(131, 36, 46, 14);
		InputInternalFrame.getContentPane().add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 169, 442, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u041F\u0435\u0440\u0438\u043E\u0434", "\u0418\u0437\u0447\u0438\u0441\u043B\u044F\u0432\u0430\u043D\u0435", "\u041B\u0438\u0445\u0432\u0430", "\u041E\u0431\u0449\u043E"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(132);
		scrollPane.setViewportView(table);
		
		JInternalFrame LegendInternalFrame = new JInternalFrame("\u041B\u0435\u0433\u0435\u043D\u0434\u0430");
		LegendInternalFrame.setBounds(10, 326, 442, 124);
		contentPane.add(LegendInternalFrame);
		LegendInternalFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("P - \u0413\u043B\u0430\u0432\u043D\u0438\u0446\u0430");
		lblNewLabel_4.setBounds(10, 11, 222, 14);
		LegendInternalFrame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("r - \u041B\u0438\u0445\u0432\u0435\u043D \u043F\u0440\u043E\u0446\u0435\u043D\u0442");
		lblNewLabel_5.setBounds(10, 36, 246, 14);
		LegendInternalFrame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("n - \u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0437\u0430 \u043F\u0435\u0440\u0438\u043E\u0434\u0430");
		lblNewLabel_6.setBounds(10, 61, 151, 14);
		LegendInternalFrame.getContentPane().add(lblNewLabel_6);
		
		JButton Exit = new JButton("\u0418\u0437\u0445\u043E\u0434");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Exit.setBounds(845, 425, 89, 23);
		contentPane.add(Exit);
		
		JPanel ChartPanel = new JPanel();
		ChartPanel.setBounds(456, 45, 442, 303);
		contentPane.add(ChartPanel);
		LegendInternalFrame.setVisible(true);
		
	}
}
