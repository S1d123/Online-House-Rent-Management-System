import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class updatePersonalInfo{
	private JTextField txtUpdatePersonalInfprmation;
	private JTextField txtFirstName;
	private JTextField txtMobileNumber;
	private JTextField txtUsername;
	private JTextField txtConfirmPassword;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JLabel lblNewLabel;
	
	public updatePersonalInfo() {
		JFrame frmUpdatePersonalInformation=new JFrame();
		frmUpdatePersonalInformation.setTitle("UPDATE PERSONAL INFORMATION");
		frmUpdatePersonalInformation.setBounds(100,100,2000,1000);
		frmUpdatePersonalInformation.setVisible(true);
		frmUpdatePersonalInformation.setLocationRelativeTo(null);
		frmUpdatePersonalInformation.getContentPane().setLayout(null);
		
		txtUpdatePersonalInfprmation = new JTextField();
		txtUpdatePersonalInfprmation.setText(" UPDATE PERSONAL DETAILS");
		txtUpdatePersonalInfprmation.setForeground(Color.WHITE);
		txtUpdatePersonalInfprmation.setFont(new Font("Mistral", Font.BOLD, 44));
		txtUpdatePersonalInfprmation.setColumns(10);
		txtUpdatePersonalInfprmation.setBackground(new Color(51, 0, 0));
		txtUpdatePersonalInfprmation.setBounds(50, 47, 487, 72);
		frmUpdatePersonalInformation.getContentPane().add(txtUpdatePersonalInfprmation);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("USERNAME");
		txtFirstName.setForeground(Color.WHITE);
		txtFirstName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtFirstName.setColumns(10);
		txtFirstName.setBackground(new Color(51, 0, 0));
		txtFirstName.setBounds(50, 189, 216, 36);
		frmUpdatePersonalInformation.getContentPane().add(txtFirstName);
		
		txtMobileNumber = new JTextField();
		txtMobileNumber.setText("OLD PASSWORD");
		txtMobileNumber.setForeground(Color.WHITE);
		txtMobileNumber.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMobileNumber.setColumns(10);
		txtMobileNumber.setBackground(new Color(51, 0, 0));
		txtMobileNumber.setBounds(50, 270, 216, 36);
		frmUpdatePersonalInformation.getContentPane().add(txtMobileNumber);
		
		txtUsername = new JTextField();
		txtUsername.setText("NEW PASSWORD");
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(51, 0, 0));
		txtUsername.setBounds(50, 347, 216, 36);
		frmUpdatePersonalInformation.getContentPane().add(txtUsername);
		
		txtConfirmPassword = new JTextField();
		txtConfirmPassword.setText("CONFIRM PASSWORD");
		txtConfirmPassword.setForeground(Color.WHITE);
		txtConfirmPassword.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtConfirmPassword.setColumns(10);
		txtConfirmPassword.setBackground(new Color(51, 0, 0));
		txtConfirmPassword.setBounds(50, 423, 216, 36);
		frmUpdatePersonalInformation.getContentPane().add(txtConfirmPassword);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textPane.setBackground(SystemColor.controlHighlight);
		textPane.setBounds(287, 189, 774, 36);
		frmUpdatePersonalInformation.getContentPane().add(textPane);
		
		JButton SAVEBTN = new JButton("SAVE");
		SAVEBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname=textPane.getText();
				String oldpwd=passwordField.getText();
				String newpwd=passwordField_1.getText();
				String cnfpwd=passwordField_2.getText();
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb","root","Sid@1234");
					java.sql.Statement sta=con.createStatement();
					String sql="select * from swing_demo1 where user_name = '"+ uname +"' ";
					
					ResultSet rs=sta.executeQuery(sql);
					if (rs.next()) {
						if (rs.getString("password").equals(oldpwd)) {
							if (newpwd.equals(cnfpwd)) {
								String sql1="update swing_demo1 set password='"+ newpwd+"' where user_name='"+uname+"' ";
								 int k=sta.executeUpdate(sql1);
								 JOptionPane.showMessageDialog(null,"Password Updated Successfully");
							}else {
								JOptionPane.showMessageDialog(null, "Confirm Password and New Password does not Match ");
								passwordField_1.requestFocus();
								passwordField_2.requestFocus();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Invalid Old Password");
							passwordField.requestFocus();
							
						}
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Username");
					}
					
				} catch (Exception e2) {
					
				}
				
				
				
			}
		});
		SAVEBTN.setForeground(Color.WHITE);
		SAVEBTN.setFont(new Font("Eras Medium ITC", Font.BOLD, 26));
		SAVEBTN.setBackground(new Color(51, 0, 0));
		SAVEBTN.setBounds(68, 512, 179, 51);
		frmUpdatePersonalInformation.getContentPane().add(SAVEBTN);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdatePersonalInformation.setVisible(false);
				new ownerHomeWebpage();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1297, 700, 169, 45);
		frmUpdatePersonalInformation.getContentPane().add(btnBack);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.controlHighlight);
		passwordField.setBounds(287, 272, 774, 36);
		frmUpdatePersonalInformation.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(SystemColor.controlHighlight);
		passwordField_1.setBounds(287, 347, 774, 36);
		frmUpdatePersonalInformation.getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBackground(SystemColor.controlHighlight);
		passwordField_2.setBounds(287, 423, 774, 36);
		frmUpdatePersonalInformation.getContentPane().add(passwordField_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmUpdatePersonalInformation.getContentPane().add(lblNewLabel);
		frmUpdatePersonalInformation.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new updatePersonalInfo();
	}
}
