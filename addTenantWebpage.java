import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

public class addTenantWebpage{
	private JTextField txtAddPersonalDetails;
	private JTextField txtName;
	private JTextField username;
	private JTextField txtPhoneNo;
	private JTextField email;
	private JTextField txtFlatNo;
	private JTextField txtAddress;
	private JTextField txtAadhar;
	private JTextField txtMonthStarted;
	private JTextField txtSecurityAmount;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JTextPane textPane_3;
	private JTextPane textPane_4;
	private JTextPane textPane_5;
	private JTextPane textPane_6;
	private JTextPane textPane_7;
	private JTextPane textPane_8;
	private JButton SAVEBTN;
	private JButton btnClose;
	private JTextField txtPassword;
	private JPasswordField pwd;
	
	public addTenantWebpage() {
		
		 
		 JFrame f = new JFrame();
		 f.getContentPane().setFont(new Font("HP Simplified Light", Font.BOLD, 22));
		 f.setForeground(Color.BLACK);
		 f.setTitle("ADD PERSONAL DETAILS");
			f.getContentPane().setBackground(new Color(250, 235, 215));
			f.getContentPane().setLayout(null);
			
			txtAddPersonalDetails = new JTextField();
			txtAddPersonalDetails.setForeground(Color.WHITE);
			txtAddPersonalDetails.setBackground(new Color(51, 0, 0));
			txtAddPersonalDetails.setFont(new Font("Mistral", Font.BOLD, 44));
			txtAddPersonalDetails.setText(" ADD TENANT DETAILS");
			txtAddPersonalDetails.setBounds(50, 28, 363, 70);
			f.getContentPane().add(txtAddPersonalDetails);
			txtAddPersonalDetails.setColumns(10);
			
			txtName = new JTextField();
			txtName.setForeground(Color.WHITE);
			txtName.setBackground(new Color(51,0,0));
			txtName.setText(" NAME");
			txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtName.setBounds(50, 182, 201, 36);
			f.getContentPane().add(txtName);
			txtName.setColumns(10);
			
			username = new JTextField();
			username.setForeground(Color.WHITE);
			username.setBackground(new Color(51,0,0));
			username.setText("USERNAME");
			username.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			username.setBounds(50, 244, 201, 36);
			f.getContentPane().add(username);
			username.setColumns(10);
			
			txtPhoneNo = new JTextField();
			txtPhoneNo.setForeground(Color.WHITE);
			txtPhoneNo.setBackground(new Color(51,0,0));
			txtPhoneNo.setText(" CONTACT NO");
			txtPhoneNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtPhoneNo.setColumns(10);
			txtPhoneNo.setBounds(50, 367, 201, 36);
			f.getContentPane().add(txtPhoneNo);
			
			email = new JTextField();
			email.setForeground(Color.WHITE);
			email.setBackground(new Color(51,0,0));
			email.setText("EMAIL ID");
			email.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			email.setColumns(10);
			email.setBounds(50, 424, 201, 36);
			f.getContentPane().add(email);
			
			txtFlatNo = new JTextField();
			txtFlatNo.setForeground(Color.WHITE);
			txtFlatNo.setBackground(new Color(51,0,0));
			txtFlatNo.setText(" FLAT NO");
			txtFlatNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtFlatNo.setColumns(10);
			txtFlatNo.setBounds(50, 126, 201, 36);
			f.getContentPane().add(txtFlatNo);
			
			txtAddress = new JTextField();
			txtAddress.setForeground(Color.WHITE);
			txtAddress.setBackground(new Color(51,0,0));
			txtAddress.setText(" ADDRESS");
			txtAddress.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtAddress.setColumns(10);
			txtAddress.setBounds(50, 487, 201, 36);
			f.getContentPane().add(txtAddress);
			
			txtAadhar = new JTextField();
			txtAadhar.setForeground(Color.WHITE);
			txtAadhar.setBackground(new Color(51,0,0));
			txtAadhar.setText(" AADHAR NO");
			txtAadhar.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtAadhar.setColumns(10);
			txtAadhar.setBounds(50, 547, 201, 36);
			f.getContentPane().add(txtAadhar);
			
			txtMonthStarted = new JTextField();
			txtMonthStarted.setForeground(Color.WHITE);
			txtMonthStarted.setBackground(new Color(51,0,0));
			txtMonthStarted.setText(" MONTH STARTED");
			txtMonthStarted.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtMonthStarted.setColumns(10);
			txtMonthStarted.setBounds(50, 604, 201, 36);
			f.getContentPane().add(txtMonthStarted);
			
			txtSecurityAmount = new JTextField();
			txtSecurityAmount.setForeground(Color.WHITE);
			txtSecurityAmount.setBackground(new Color(51,0,0));
			txtSecurityAmount.setText(" SECURITY AMOUNT");
			txtSecurityAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtSecurityAmount.setColumns(10);
			txtSecurityAmount.setBounds(50, 662, 201, 36);
			f.getContentPane().add(txtSecurityAmount);
			
			JTextPane textPane = new JTextPane();
			textPane.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane.setForeground(new Color(0, 0, 0));
			textPane.setBackground(SystemColor.controlHighlight);
			textPane.setBounds(274, 126, 1039, 36);
			f.getContentPane().add(textPane);
			
			textPane_1 = new JTextPane();
			textPane_1.setForeground(new Color(0, 0, 0));
			textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_1.setBackground(SystemColor.controlHighlight);
			textPane_1.setBounds(274, 182, 1039, 36);
			f.getContentPane().add(textPane_1);
			
			textPane_2 = new JTextPane();
			textPane_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_2.setForeground(new Color(0, 0, 0));
			textPane_2.setBackground(SystemColor.controlHighlight);
			textPane_2.setBounds(274, 244, 1039, 36);
			f.getContentPane().add(textPane_2);
			
			textPane_3 = new JTextPane();
			textPane_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_3.setForeground(new Color(0, 0, 0));
			textPane_3.setBackground(SystemColor.controlHighlight);
			textPane_3.setBounds(274, 367, 1039, 36);
			f.getContentPane().add(textPane_3);
			
			textPane_4 = new JTextPane();
			textPane_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_4.setBackground(SystemColor.controlHighlight);
			textPane_4.setBounds(274, 424, 1039, 36);
			f.getContentPane().add(textPane_4);
			
			textPane_5 = new JTextPane();
			textPane_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_5.setBackground(SystemColor.controlHighlight);
			textPane_5.setBounds(274, 487, 1039, 36);
			f.getContentPane().add(textPane_5);
			
			textPane_6 = new JTextPane();
			textPane_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_6.setBackground(SystemColor.controlHighlight);
			textPane_6.setBounds(274, 547, 1039, 36);
			f.getContentPane().add(textPane_6);
			
			textPane_7 = new JTextPane();
			textPane_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_7.setBackground(SystemColor.controlHighlight);
			textPane_7.setBounds(274, 604, 1039, 36);
			f.getContentPane().add(textPane_7);
			
			textPane_8 = new JTextPane();
			textPane_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_8.setBackground(SystemColor.controlHighlight);
			textPane_8.setBounds(274, 662, 1039, 36);
			f.getContentPane().add(textPane_8);
			f.setBounds(100,100,2000,1000);
		     f.setVisible(true);
		     f.setLocationRelativeTo(null);
			
			SAVEBTN = new JButton("SAVE");
			SAVEBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String flatno=textPane.getText();
					String Name =textPane_1.getText();
	                String userName = textPane_2.getText();
	               	String Password = pwd.getText();
	                String mobileNumber = textPane_3.getText();
	                String emailId =textPane_4.getText();
	                String Address=textPane_5.getText();
	                String Aadhar=textPane_6.getText();
	                String monthstarting=textPane_7.getText();
	                String Securityamount=textPane_8.getText();
	                int aadhar=Aadhar.length();
	                int len=mobileNumber.length();
	               
	                if (flatno.equals("")||Name.equals("")||userName.equals("")||Password.equals("")||mobileNumber.equals("")||emailId.equals("")||Address.equals("")||Aadhar.equals("")||monthstarting.equals("")||Securityamount.equals("")) {
	                	
	                	JOptionPane.showMessageDialog(null,"One or more Fields Are Empty");
						
					}
	                
	              
	                else if (aadhar!=16) {
	                	JOptionPane.showMessageDialog(null, "Enter a Valid Aadhar Number");
						
					} 
	                else if(len!=10){
	                	JOptionPane.showMessageDialog(null,"Enter a valid Mobile Number");
	                }
	               
	                else {  try {
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
	                    java.sql.Statement sta =connection.createStatement();

	                    String query = "insert into viewtenantdetails values('" + flatno + "','" + Name + "','" + userName + "','" + Password + "','" + mobileNumber + "','" + emailId + "','"+Address +"','"+ Aadhar+"','"+ monthstarting+"','"+ Securityamount+"')";

	              
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                      
	                    } else {
	                        JOptionPane.showMessageDialog(SAVEBTN, "Data Saved Successfully");
	                        
	                    }
	                    connection.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
	            }
				}
	        });
			SAVEBTN.setForeground(Color.WHITE);
			SAVEBTN.setBackground(new Color(51, 0, 0));
			SAVEBTN.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
			SAVEBTN.setBounds(61, 735, 169, 42);
			f.getContentPane().add(SAVEBTN);
			
			btnClose = new JButton("BACK");
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					f.setVisible(false);
					new  ownerHomeWebpage();
				}
			});
			btnClose.setForeground(Color.WHITE);
			btnClose.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
			btnClose.setBackground(new Color(51, 0, 0));
			btnClose.setBounds(1332, 736, 160, 42);
			f.getContentPane().add(btnClose);
			
			txtPassword = new JTextField();
			txtPassword.setText("PASSWORD");
			txtPassword.setForeground(Color.WHITE);
			txtPassword.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtPassword.setColumns(10);
			txtPassword.setBackground(new Color(51, 0, 0));
			txtPassword.setBounds(50, 303, 201, 36);
			f.getContentPane().add(txtPassword);
			
			pwd = new JPasswordField();
			pwd.setBackground(SystemColor.controlHighlight);
			pwd.setBounds(274, 305, 1039, 36);
			f.getContentPane().add(pwd);
			
			JButton btnDelete = new JButton("DELETE");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String flatString=textPane.getText();
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb","root","Sid@1234");
						java.sql.Statement sta=con.createStatement();
						String sqlString ="delete from  viewtenantdetails where flat_no='"+flatString+"'  ";
						int x=sta.executeUpdate(sqlString);
						if (x==0) {
							
						}else {
							JOptionPane.showMessageDialog(null,"Data deleted Succesfully");
						}
						
					} catch (Exception e2) {
						
					}
					
				}
			});
			btnDelete.setForeground(Color.WHITE);
			btnDelete.setFont(new Font("Eras Medium ITC", Font.BOLD, 25));
			btnDelete.setBackground(new Color(51, 0, 0));
			btnDelete.setBounds(274, 735, 169, 42);
			f.getContentPane().add(btnDelete);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
			lblNewLabel.setBounds(0, 0, 1540, 845);
			f.getContentPane().add(lblNewLabel);
			
			

	}
	
     
	
	public static void main(String[] args) {
		
		new addTenantWebpage();		
	}
}