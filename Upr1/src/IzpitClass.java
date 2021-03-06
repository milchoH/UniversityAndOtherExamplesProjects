import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzpitClass extends JFrame {
	
	int  n;
	float k,i,t;
	float suma;

	private JPanel contentPane;
	private JTable table;
	private JTextField balanceTF;
	private JTextField yearTF;
	private JTextField intrestTF;
	private JLabel lblNewLabel;
/*	DefaultTableModel tableModel;
	JScrollPane scrollPane;
	String[] columns={"������","������� �� �����","������� ����","����������� ����","�������"};*/
	private JButton ExitButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzpitClass frame = new IzpitClass();
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
	public IzpitClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 550, 176);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Godina", "Ostatak ot dalga", "Lihvena chast, Zn", "Pogasitelna chast, T", "Aniuitet"
			}
		));
		table= new JTable();
	//	tableModel = new DefaultTableModel(0,5);
	//	tableModel.setColumnIdentifiers(columns);
	//	table.setModel(tableModel);
	//	table.setName("table");
	//	scrollPane= new JScrollPane(table);
		
		scrollPane.setViewportView(table);
		

		
		JLabel lblK = new JLabel("K = ");
		lblK.setBounds(10, 11, 27, 14);
		contentPane.add(lblK);
		
		balanceTF = new JTextField();
		balanceTF.setBounds(40, 8, 86, 20);
		contentPane.add(balanceTF);
		balanceTF.setColumns(10);
		
		JLabel lblN = new JLabel("n = ");
		lblN.setBounds(10, 36, 27, 14);
		contentPane.add(lblN);
		
		yearTF = new JTextField();
		yearTF.setBounds(40, 33, 86, 20);
		contentPane.add(yearTF);
		yearTF.setColumns(10);
		
			JButton CalculateButton = new JButton("Calculate");
		CalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		CalculateButton.setBounds(317, 7, 89, 23);
		contentPane.add(CalculateButton);
		
		intrestTF = new JTextField();
		intrestTF.setBounds(207, 8, 86, 20);
		contentPane.add(intrestTF);
		intrestTF.setColumns(10);
		
		lblNewLabel = new JLabel("Intrest =");
		lblNewLabel.setBounds(151, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		ExitButton.setBounds(317, 32, 89, 23);
		contentPane.add(ExitButton);
		
		
	}
}
