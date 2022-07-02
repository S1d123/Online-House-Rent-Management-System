import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class ownerHomeWebpage{
	
	public ownerHomeWebpage() {
		JFrame f =new JFrame();
		f.getContentPane().setBackground(UIManager.getColor("Button.light"));
		f.setForeground(new Color(0, 0, 0));
		f.setTitle("OWNER HOME PAGE");
		f.setBounds(100, 100, 2000, 1000);	
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("HELLO WELCOME BACK TO RENT EASY!");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Mistral", Font.BOLD, 53));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(20, 35, 805, 94);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("VIEW TENANT DETAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				new viewTenantDetails();
			}
		});
		btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton.setBackground(SystemColor.controlLtHighlight);
		btnNewButton.setBounds(20, 280, 270, 49);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PAYMENT INFORMATION");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new Payment();
			}
		});
		btnNewButton_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton_1.setBackground(SystemColor.controlLtHighlight);
		btnNewButton_1.setBounds(20, 358, 270, 49);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("UPDATE PERSONAL DETAILS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new updatePersonalInfo();
			}
		});
		btnNewButton_3.setBackground(SystemColor.controlLtHighlight);
		btnNewButton_3.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton_3.setBounds(20, 440, 270, 49);
		f.getContentPane().add(btnNewButton_3);
		
		JButton btnAddPersonalDetails = new JButton("ADD TENANT DETAILS");
		btnAddPersonalDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);	
				new addTenantWebpage();
				
			}

		});
		btnAddPersonalDetails.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnAddPersonalDetails.setBackground(SystemColor.controlLtHighlight);
		btnAddPersonalDetails.setBounds(20, 201, 270, 49);
		f.getContentPane().add(btnAddPersonalDetails);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(771, 102, 128, 93);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_5_1 = new JButton("LOGOUT");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	int a=	JOptionPane.showConfirmDialog(null,"Do you really want to Logout","Logout",JOptionPane.YES_NO_OPTION);
				if (a==0) {
					f.setVisible(false);
					new ownerLoginPage();
				}			
				else {
					f.setVisible(true);
				
				}
				}
		});
		btnNewButton_5_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton_5_1.setBackground(SystemColor.controlLtHighlight);
		btnNewButton_5_1.setBounds(20, 602, 270, 49);
		f.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("VIEW SERVICE REQUEST");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new viewServiceRequest();
			}
		});
		btnNewButton_5_2.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		btnNewButton_5_2.setBackground(SystemColor.controlLtHighlight);
		btnNewButton_5_2.setBounds(20, 520, 270, 49);
		f.getContentPane().add(btnNewButton_5_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\JAVA\\pexels-binyamin-mellish-186077.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		f.getContentPane().add(lblNewLabel);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new ownerHomeWebpage();
		
		}
}