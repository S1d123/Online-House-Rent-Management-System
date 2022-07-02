import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ownerLoginPage{
private JTextField username;
private JPasswordField password;
/**
* @wbp.parser.entryPoint
*
*
*/
public ownerLoginPage() {
JFrame f = new JFrame();
f.getContentPane().setForeground(Color.BLACK);
f.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 14));
f.getContentPane().setBackground(new Color(245, 245, 245));
f.setForeground(new Color(0, 0, 0));
f.setTitle("RENT EASY OWNER LOGIN");
f.setBounds(100, 100, 2000, 1000);
f.setLocationRelativeTo(null);
f.getContentPane().setLayout(null);



JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\Capture101.PNG"));
lblNewLabel.setBounds(136, 120, 661, 621);
f.getContentPane().add(lblNewLabel);



username = new JTextField();
username.setFont(new Font("Tahoma", Font.BOLD, 15));
username.setBackground(Color.WHITE);
username.setBounds(854, 356, 440, 42);
f.getContentPane().add(username);
username.setColumns(10);



JButton btnNewButton = new JButton("LOGIN");
btnNewButton.addActionListener(new ActionListener() {



public void actionPerformed(ActionEvent e) {
try {



Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb","root","Sid@1234");
java.sql.Statement stmt=con.createStatement();
String sql="Select * from swing_demo1 where user_name='"+username.getText()+"' and password='"+password.getText().toString()+"'";
ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
if (rs.next())
{JOptionPane.showMessageDialog(null,"Login Sucessful");
f.setVisible(false);
new ownerHomeWebpage();
}
else
JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
}
catch (Exception e1) {
e1.printStackTrace();
}
}



});
btnNewButton.setForeground(Color.WHITE);
btnNewButton.setBackground(new Color(51, 0, 0));
btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 27));
btnNewButton.setBounds(959, 567, 152, 51);
f.getContentPane().add(btnNewButton);



JLabel lblNewLabel_1 = new JLabel("OWNER LOGIN");
lblNewLabel_1.setBackground(new Color(255, 222, 173));
lblNewLabel_1.setFont(new Font("Mistral", Font.BOLD, 68));
lblNewLabel_1.setBounds(938, 123, 457, 58);
f.getContentPane().add(lblNewLabel_1);




JLabel lblNewLabel_2 = new JLabel("USERNAME");
lblNewLabel_2.setForeground(Color.BLACK);
lblNewLabel_2.setFont(new Font("Goudy Old Style", Font.BOLD, 26));
lblNewLabel_2.setBounds(854, 304, 176, 42);
f.getContentPane().add(lblNewLabel_2);



JLabel lblNewLabel_2_1 = new JLabel("PASSWORD");
lblNewLabel_2_1.setForeground(Color.BLACK);
lblNewLabel_2_1.setFont(new Font("Goudy Old Style", Font.BOLD, 26));
lblNewLabel_2_1.setBounds(854, 438, 176, 42);
f.getContentPane().add(lblNewLabel_2_1);



password = new JPasswordField();
password.setFont(new Font("Tahoma", Font.BOLD, 12));
password.setBounds(854, 490, 440, 42);
f.getContentPane().add(password);

JLabel lblNewLabel_3 = new JLabel("Dont Have An Account ?");
lblNewLabel_3.setFont(new Font("Goudy Old Style", Font.BOLD, 26));
lblNewLabel_3.setBounds(843, 645, 268, 43);
f.getContentPane().add(lblNewLabel_3);

JButton btnCreateAnA = new JButton("Create an Account");
btnCreateAnA.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		f.setVisible(false);
		new OwnerRegister();
	}
});
btnCreateAnA.setForeground(new Color(0, 0, 0));
btnCreateAnA.setFont(new Font("Goudy Old Style", Font.BOLD, 26));
btnCreateAnA.setBackground(new Color(245, 245, 245));
btnCreateAnA.setBounds(1103, 645, 235, 43);
f.getContentPane().add(btnCreateAnA);
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
btnBack.setBounds(1340, 719, 142, 42);
f.getContentPane().add(btnBack);
JLabel lblNewLabel_2_2 = new JLabel("Enter your personal details and start your journey with us !");
lblNewLabel_2_2.setForeground(Color.BLACK);
lblNewLabel_2_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
lblNewLabel_2_2.setBounds(839, 231, 588, 51);
f.getContentPane().add(lblNewLabel_2_2);
JLabel lblNewLabel_2_2_1 = new JLabel("         Thanks for being a part of RentEasy family!");
lblNewLabel_2_2_1.setForeground(Color.BLACK);
lblNewLabel_2_2_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
lblNewLabel_2_2_1.setBounds(843, 191, 588, 51);
f.getContentPane().add(lblNewLabel_2_2_1);
f.setBounds(100,100,2000,1000);
f.setVisible(true);
f.setLocationRelativeTo(null);






}
public static void main(String[] args) {



new ownerLoginPage();
}
}