import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class ContactUs{
	private JTextField lastname;
	private JTextField eAddress;
	private JTextField phone;
	private JTextField impMessage;
	private JTextField textField;
	/**
	 * @wbp.parser.entryPoint
	 * 
	 * 
	 */
	public ContactUs() {
		JFrame f = 	new JFrame();
		f.getContentPane().setForeground(Color.BLACK);
		f.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 14));
		f.getContentPane().setBackground(new Color(245, 245, 245));
		f.setForeground(new Color(0, 0, 0));
		f.setTitle("CONTACT US");
		f.setBounds(100, 100, 2000, 1000);	
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\Capture101.PNG"));
		lblNewLabel.setBounds(72, 120, 680, 621);
		f.getContentPane().add(lblNewLabel);
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lastname.setBackground(Color.WHITE);
		lastname.setBounds(961, 388, 440, 42);
		f.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		JButton sendMesage = new JButton("SEND MESSAGE");
		sendMesage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String fname= textField.getText();
				String lname =lastname.getText();
                String email = eAddress.getText();
                String mobileNumber = phone.getText();
                String message =impMessage.getText();
                int len=mobileNumber.length();
                
                if (fname.equals("")||lname.equals("")||email.equals("")||mobileNumber.equals("")||message.equals("")) {
                	JOptionPane.showMessageDialog(null,"One or more fields are empty");
					
				}
                
                else  if (len!=10) {
					JOptionPane.showMessageDialog(null,"Enter a valid Mobile Number");
				} 
                
                else {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
                    java.sql.Statement sta =connection.createStatement();

                    String query = "insert into contactus values('" + fname + "','" + lname + "','" + email + "','" + mobileNumber + "','" + message + "')";

              
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                    
                    } else {
                        JOptionPane.showMessageDialog(sendMesage, "Message Sent Successfully");
                        
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                }
            }
        });
		sendMesage.setForeground(Color.WHITE);
		sendMesage.setBackground(new Color(51, 0, 0));
		sendMesage.setFont(new Font("Eras Medium ITC", Font.BOLD, 27));
		sendMesage.setBounds(925, 690, 238, 51);
		f.getContentPane().add(sendMesage);
		
		JLabel lblNewLabel_1 = new JLabel("    CONTACT US");
		lblNewLabel_1.setBackground(new Color(255, 222, 173));
		lblNewLabel_1.setFont(new Font("Mistral", Font.BOLD, 66));
		lblNewLabel_1.setBounds(937, 122, 525, 58);
		f.getContentPane().add(lblNewLabel_1);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setVisible(false);
				new renteasyHomePage();
			}
			
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 27));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1346, 737, 144, 42);
		f.getContentPane().add(btnBack);
		f.setVisible(true);
		
		JLabel lblNewLabel_2 = new JLabel("We're here to help with any questions or comments ! Feel free to Contact us\r\n");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		lblNewLabel_2.setBounds(805, 191, 725, 51);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("FIRST NAME");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(787, 319, 144, 42);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("by filling out this form. We will be more than happy to assist you.");
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		lblNewLabel_2_2.setBounds(829, 228, 633, 42);
		f.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("LAST NAME");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_2_1_1.setBounds(787, 383, 144, 42);
		f.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("EMAIL ADDRESS");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_2_1_1_1.setBounds(772, 446, 179, 42);
		f.getContentPane().add(lblNewLabel_2_1_1_1);
		
		eAddress = new JTextField();
		eAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		eAddress.setColumns(10);
		eAddress.setBackground(Color.WHITE);
		eAddress.setBounds(961, 446, 440, 42);
		f.getContentPane().add(eAddress);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("PHONE NUMBER");
		lblNewLabel_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1.setBounds(762, 506, 189, 42);
		f.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.BOLD, 14));
		phone.setColumns(10);
		phone.setBackground(Color.WHITE);
		phone.setBounds(961, 506, 440, 42);
		f.getContentPane().add(phone);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("  MESSAGE");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1_1.setBounds(787, 569, 159, 42);
		f.getContentPane().add(lblNewLabel_2_1_1_1_1_1);
		
		impMessage = new JTextField();
		impMessage.setFont(new Font("Tahoma", Font.BOLD, 14));
		impMessage.setColumns(10);
		impMessage.setBackground(Color.WHITE);
		impMessage.setBounds(961, 558, 440, 108);
		f.getContentPane().add(impMessage);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(961, 319, 440, 42);
		f.getContentPane().add(textField);
		
		
		
	
		
		
		
	}
	public static void main(String[] args) {
		
		new ContactUs();
	}
}