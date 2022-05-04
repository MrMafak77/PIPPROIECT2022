package bridgePattern2_PIP;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import java.awt.Color;


public class BridgePatternGUI {

	private JFrame frmBridgePattern;
	private JTextField txtField1;
	private JTextField txtField2;
	private JButton btnTelefon;
	private JButton btnTelevizor;
	static Companie cmp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BridgePatternGUI window = new BridgePatternGUI();
					window.frmBridgePattern.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public BridgePatternGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmBridgePattern = new JFrame();
		frmBridgePattern.setResizable(false);
		frmBridgePattern.setTitle("Bridge Pattern");
		frmBridgePattern.setVisible(true);
		frmBridgePattern.setBounds(100, 100, 443, 375);
		frmBridgePattern.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBridgePattern.getContentPane().setLayout(null);
		JPanel pan = (JPanel) frmBridgePattern.getContentPane();
		
		txtField1 = new JTextField();
		txtField1.setText("Alege compania:");
		txtField1.setHorizontalAlignment(SwingConstants.CENTER);
		txtField1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 33));
		txtField1.setEditable(false);
		txtField1.setColumns(10);
		txtField1.setBounds(10, 10, 414, 42);
		frmBridgePattern.getContentPane().add(txtField1);
		
		JButton btnSamsung = new JButton("");
		btnSamsung.setIcon(new ImageIcon(BridgePatternGUI.class.getResource("/bridgePattern2_PIP/samsung_icon.png")));
		btnSamsung.setBounds(52, 62, 129, 129);
		frmBridgePattern.getContentPane().add(btnSamsung);
		btnSamsung.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cmp = new Samsung();
			}
		});

		
		JButton btnApple = new JButton("");
		btnApple.setIcon(new ImageIcon(BridgePatternGUI.class.getResource("/bridgePattern2_PIP/apple_icon.png")));
		btnApple.setBounds(248, 62, 129, 129);
		frmBridgePattern.getContentPane().add(btnApple);
		btnApple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cmp = new Apple();	
			}
		});

		
		JButton btnHuawei = new JButton("");
		btnHuawei.setIcon(new ImageIcon(BridgePatternGUI.class.getResource("/bridgePattern2_PIP/huawei_icon.png")));
		btnHuawei.setBounds(52, 201, 129, 129);
		frmBridgePattern.getContentPane().add(btnHuawei);
		btnHuawei.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cmp = new Huawei();		
			}
		});
		
		JButton btnLG = new JButton("");
		btnLG.setIcon(new ImageIcon(BridgePatternGUI.class.getResource("/bridgePattern2_PIP/LG_icon.png")));
		btnLG.setBounds(248, 201, 129, 129);
		frmBridgePattern.getContentPane().add(btnLG);
		btnLG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cmp = new LG();	
			}
		});
		
		ActionListener a1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel pan1 = new JPanel();
				pan1.setBounds(0, 0, 443, 350);
				frmBridgePattern.setContentPane(pan1);
			
				txtField2 = new JTextField();
				txtField2.setForeground(Color.BLACK);
				txtField2.setHorizontalAlignment(SwingConstants.CENTER);
				txtField2.setEditable(false);
				txtField2.setText("Alege produs:");
				txtField2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 33));
				txtField2.setBounds(10, 10, 409, 53);
				frmBridgePattern.getContentPane().add(txtField2);
				txtField2.setColumns(10);
				
				btnTelefon = new JButton("");
				btnTelefon.setIcon(new ImageIcon(BridgePatternGUI.class.getResource("/bridgePattern2_PIP/smartphone_icon.png")));
				btnTelefon.setBounds(51, 73, 129, 129);
				frmBridgePattern.getContentPane().add(btnTelefon);
				btnTelefon.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frmBridgePattern, "Ai ales produsul " + new Telefon(cmp).tipProdus());
					}
				});
				
				btnTelevizor = new JButton("");
				btnTelevizor.setIcon(new ImageIcon(BridgePatternGUI.class.getResource("/bridgePattern2_PIP/tv_icon.png")));
				btnTelevizor.setBounds(253, 73, 129, 129);
				frmBridgePattern.getContentPane().add(btnTelevizor);
				btnTelevizor.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frmBridgePattern,"Ai ales produsul " + new Televizor(cmp).tipProdus());			
					}
				});
				
				JButton btnBack = new JButton("Back");
				btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnBack.setBounds(51, 230, 129, 30);
				frmBridgePattern.getContentPane().add(btnBack);
				btnBack.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frmBridgePattern.setContentPane(pan);
					}
				});
				
			}
			
		};
		
		btnSamsung.addActionListener(a1);
		btnApple.addActionListener(a1);
		btnHuawei.addActionListener(a1);
		btnLG.addActionListener(a1);
		
	}
}
