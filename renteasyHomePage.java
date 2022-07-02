import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class renteasyHomePage{
	
	public renteasyHomePage() {
		JFrame frmRentEasyFront = new JFrame();
		frmRentEasyFront.setForeground(new Color(0, 0, 0));
		frmRentEasyFront.setTitle("RENT EASY ");
		frmRentEasyFront.getContentPane().setBackground(Color.WHITE);
		frmRentEasyFront.getContentPane().setLayout(null);
		JButton ownerlogin = new JButton("OWNER LOGIN");
		ownerlogin.setBorder(UIManager.getBorder("ComboBox.border"));
		ownerlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 frmRentEasyFront.setVisible(false);			
			    new ownerLoginPage();
			  
	     		}
		});
		ownerlogin.setBackground(new Color(240, 248, 255));
		ownerlogin.setFont(new Font("Eras Medium ITC", Font.BOLD, 21));
		ownerlogin.setBounds(1251, 461, 224, 56);
		frmRentEasyFront.getContentPane().add(ownerlogin);
		
		JButton customerlogin = new JButton("TENANT LOGIN");
		customerlogin.setBorder(UIManager.getBorder("ComboBox.border"));
		customerlogin.setBackground(new Color(240, 248, 255));
		customerlogin.setFont(new Font("Eras Medium ITC", Font.BOLD, 21));
		customerlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRentEasyFront.setVisible(false);
				new customerLoginPage();			}
		});
		customerlogin.setBounds(1251, 550, 224, 56);
		frmRentEasyFront.getContentPane().add(customerlogin);
		
		JLabel lblNewLabel_1 = new JLabel("RENT EASY");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 85));
		lblNewLabel_1.setBounds(1008, 25, 522, 102);
		frmRentEasyFront.getContentPane().add(lblNewLabel_1);
		
		JButton btnAboutUs = new JButton("CONTACT US");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRentEasyFront.setVisible(false);
				
				new ContactUs();
				
			}
			
		});
		btnAboutUs.setFont(new Font("Eras Medium ITC", Font.BOLD, 21));
		btnAboutUs.setBorder(UIManager.getBorder("ComboBox.border"));
		btnAboutUs.setBackground(new Color(240, 248, 255));
		btnAboutUs.setBounds(1251, 633, 224, 56);
		frmRentEasyFront.getContentPane().add(btnAboutUs);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\JAVA\\pexels-pixabay-302769.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmRentEasyFront.getContentPane().add(lblNewLabel);
		frmRentEasyFront.setBounds(100,100,2000,1000);
		frmRentEasyFront.setVisible(true);
		frmRentEasyFront.setLocationRelativeTo(null);
		
		
	}
	
	public static void main(String[] args) {
		
		new renteasyHomePage();
	
	}
}