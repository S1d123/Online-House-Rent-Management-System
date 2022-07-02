import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CustomerHomeWebDesign{
	
	 public CustomerHomeWebDesign(String uname, String password) {
		JFrame frmCustomerHomePage= new JFrame();
		frmCustomerHomePage.setTitle("CUSTOMER HOME PAGE");
		frmCustomerHomePage.setBounds(100,100,2000,1000);
		frmCustomerHomePage.setLocationRelativeTo(null);
		frmCustomerHomePage.setVisible(true);
		frmCustomerHomePage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("HELLO WELCOME BACK TO RENT EASY!");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Mistral", Font.BOLD, 53));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(33, 36, 805, 94);
		frmCustomerHomePage.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("VIEW PERSONAL DETAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCustomerHomePage.setVisible(false);
				new viewCustomerDetails(uname,password);
				
				
			}
		});
		btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setBounds(20, 209, 270, 49);
		frmCustomerHomePage.getContentPane().add(btnNewButton);
	 
		JButton btnNewButton_1 = new JButton("UPDATE PERSONAL DETAILS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new changeCustomerDetails();
			}
		});
		btnNewButton_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.setBounds(20, 303, 270, 49);
		frmCustomerHomePage.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("SERVICE REQUEST");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCustomerHomePage.setVisible(false);
				new serviceRequest();
			}
		});
		btnNewButton_4.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton_4.setBackground(new Color(240, 248, 255));
		btnNewButton_4.setBounds(20, 492, 270, 49);
		frmCustomerHomePage.getContentPane().add(btnNewButton_4);
		
		JButton LOGOUT = new JButton("LOGOUT");
		LOGOUT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=	JOptionPane.showConfirmDialog(null,"Do you really want to Logout","Logout",JOptionPane.YES_NO_OPTION);
				if (a==0) {
					frmCustomerHomePage.setVisible(false);
					new customerLoginPage();
					
				}
				else {
					
					frmCustomerHomePage.setVisible(true);
				}
			}
		
		});
		LOGOUT.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		LOGOUT.setBackground(new Color(240, 248, 255));
		LOGOUT.setBounds(20, 586, 270, 49);
		frmCustomerHomePage.getContentPane().add(LOGOUT);
		
		JButton PAYMENT = new JButton("PAYMENT INFORMATION");
		PAYMENT.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		PAYMENT.setBackground(new Color(240, 248, 255));
		PAYMENT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCustomerHomePage.setVisible(false);
				new viewPaymentInfo(uname,password);
			}
		});
		PAYMENT.setBounds(20, 390, 270, 49);
		frmCustomerHomePage.getContentPane().add(PAYMENT);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\JAVA\\pexels-binyamin-mellish-186077.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmCustomerHomePage.getContentPane().add(lblNewLabel);
		
	}
	 
	 public CustomerHomeWebDesign() {
			JFrame frmCustomerHomePage= new JFrame();
			frmCustomerHomePage.setTitle("TENANT HOME PAGE");
			frmCustomerHomePage.setBounds(100,100,2000,1000);
			frmCustomerHomePage.setLocationRelativeTo(null);
			frmCustomerHomePage.setVisible(true);
			frmCustomerHomePage.getContentPane().setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("HELLO WELCOME BACK TO RENT EASY!");
			lblNewLabel_2.setForeground(new Color(0, 0, 0));
			lblNewLabel_2.setFont(new Font("Mistral", Font.BOLD, 53));
			lblNewLabel_2.setBackground(new Color(0, 0, 0));
			lblNewLabel_2.setBounds(33, 36, 805, 94);
			frmCustomerHomePage.getContentPane().add(lblNewLabel_2);
			
			JButton btnNewButton = new JButton("VIEW PERSONAL DETAILS");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmCustomerHomePage.setVisible(false);
					new viewCustomerDetails();
					
					
				}
			});
			btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
			btnNewButton.setBackground(new Color(240, 248, 255));
			btnNewButton.setBounds(20, 209, 270, 49);
			frmCustomerHomePage.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_4 = new JButton("SERVICE REQUEST");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmCustomerHomePage.setVisible(false);
					new serviceRequest();
				}
			});
			btnNewButton_4.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
			btnNewButton_4.setBackground(new Color(240, 248, 255));
			btnNewButton_4.setBounds(20, 492, 270, 49);
			frmCustomerHomePage.getContentPane().add(btnNewButton_4);
			
			JButton LOGOUT = new JButton("LOGOUT");
			LOGOUT.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a=	JOptionPane.showConfirmDialog(null,"Do you really want to Logout","Logout",JOptionPane.YES_NO_OPTION);
					if (a==0) {
						frmCustomerHomePage.setVisible(false);
						new customerLoginPage();
						
					}
					else {
						
						frmCustomerHomePage.setVisible(true);
					}
				}
			
			});
			LOGOUT.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
			LOGOUT.setBackground(new Color(240, 248, 255));
			LOGOUT.setBounds(20, 586, 270, 49);
			frmCustomerHomePage.getContentPane().add(LOGOUT);
			
			JButton PAYMENT = new JButton("PAYMENT INFORMATION");
			PAYMENT.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
			PAYMENT.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmCustomerHomePage.setVisible(false);
					new viewPaymentInfo();
				}
			});
			PAYMENT.setBackground(new Color(240, 248, 255));
			PAYMENT.setBounds(20, 390, 270, 49);
			frmCustomerHomePage.getContentPane().add(PAYMENT);
			
			JButton PAYMENT_1 = new JButton("UPDATE PERSONAL DETAILS");
			PAYMENT_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new changeCustomerDetails();
				}
			});
			PAYMENT_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
			PAYMENT_1.setBackground(new Color(240, 248, 255));
			PAYMENT_1.setBounds(20, 298, 270, 49);
			frmCustomerHomePage.getContentPane().add(PAYMENT_1);
			
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon("D:\\JAVA\\pexels-binyamin-mellish-186077.jpg"));
			lblNewLabel_1.setBounds(0, 0, 1540, 845);
			frmCustomerHomePage.getContentPane().add(lblNewLabel_1);
			
		}
	
	
	public static void main(String[] args) {
		
		
		new CustomerHomeWebDesign();
	}
}