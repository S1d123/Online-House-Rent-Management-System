import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.directory.SearchResult;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;

public class viewTenantDetails{
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
	
	public viewTenantDetails() {
		
		 
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
			txtAddPersonalDetails.setText("  VIEW TENANT DETAILS");
			txtAddPersonalDetails.setBounds(50, 23, 389, 75);
			f.getContentPane().add(txtAddPersonalDetails);
			txtAddPersonalDetails.setColumns(10);
			
			txtName = new JTextField();
			txtName.setForeground(Color.WHITE);
			txtName.setBackground(new Color(51,0,0));
			txtName.setText(" NAME");
			txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtName.setBounds(50, 207, 201, 36);
			f.getContentPane().add(txtName);
			txtName.setColumns(10);
			
			username = new JTextField();
			username.setForeground(Color.WHITE);
			username.setBackground(new Color(51,0,0));
			username.setText("USERNAME");
			username.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			username.setBounds(50, 269, 201, 36);
			f.getContentPane().add(username);
			username.setColumns(10);
			
			txtPhoneNo = new JTextField();
			txtPhoneNo.setForeground(Color.WHITE);
			txtPhoneNo.setBackground(new Color(51,0,0));
			txtPhoneNo.setText(" CONTACT NO");
			txtPhoneNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtPhoneNo.setColumns(10);
			txtPhoneNo.setBounds(50, 334, 201, 36);
			f.getContentPane().add(txtPhoneNo);
			
			email = new JTextField();
			email.setForeground(Color.WHITE);
			email.setBackground(new Color(51,0,0));
			email.setText("EMAIL ID");
			email.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			email.setColumns(10);
			email.setBounds(50, 403, 201, 36);
			f.getContentPane().add(email);
			
			txtFlatNo = new JTextField();
			txtFlatNo.setForeground(Color.WHITE);
			txtFlatNo.setBackground(new Color(51,0,0));
			txtFlatNo.setText(" FLAT NO");
			txtFlatNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtFlatNo.setColumns(10);
			txtFlatNo.setBounds(50, 150, 201, 36);
			f.getContentPane().add(txtFlatNo);
			
			txtAddress = new JTextField();
			txtAddress.setForeground(Color.WHITE);
			txtAddress.setBackground(new Color(51,0,0));
			txtAddress.setText(" ADDRESS");
			txtAddress.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtAddress.setColumns(10);
			txtAddress.setBounds(50, 464, 201, 36);
			f.getContentPane().add(txtAddress);
			
			txtAadhar = new JTextField();
			txtAadhar.setForeground(Color.WHITE);
			txtAadhar.setBackground(new Color(51,0,0));
			txtAadhar.setText(" AADHAR NO");
			txtAadhar.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtAadhar.setColumns(10);
			txtAadhar.setBounds(50, 530, 201, 36);
			f.getContentPane().add(txtAadhar);
			
			txtMonthStarted = new JTextField();
			txtMonthStarted.setForeground(Color.WHITE);
			txtMonthStarted.setBackground(new Color(51,0,0));
			txtMonthStarted.setText(" MONTH STARTED");
			txtMonthStarted.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtMonthStarted.setColumns(10);
			txtMonthStarted.setBounds(50, 587, 201, 36);
			f.getContentPane().add(txtMonthStarted);
			
			txtSecurityAmount = new JTextField();
			txtSecurityAmount.setForeground(Color.WHITE);
			txtSecurityAmount.setBackground(new Color(51,0,0));
			txtSecurityAmount.setText(" SECURITY AMOUNT");
			txtSecurityAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
			txtSecurityAmount.setColumns(10);
			txtSecurityAmount.setBounds(50, 648, 201, 36);
			f.getContentPane().add(txtSecurityAmount);
			
			JTextPane textPane = new JTextPane();
			textPane.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane.setForeground(new Color(0, 0, 0));
			textPane.setBackground(SystemColor.controlHighlight);
			textPane.setBounds(274, 150, 182, 36);
			f.getContentPane().add(textPane);
			
			textPane_1 = new JTextPane();
			textPane_1.setForeground(new Color(0, 0, 0));
			textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_1.setBackground(SystemColor.controlHighlight);
			textPane_1.setBounds(274, 207, 1039, 36);
			f.getContentPane().add(textPane_1);
			
			textPane_2 = new JTextPane();
			textPane_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_2.setForeground(new Color(0, 0, 0));
			textPane_2.setBackground(SystemColor.controlHighlight);
			textPane_2.setBounds(274, 269, 1039, 36);
			f.getContentPane().add(textPane_2);
			
			textPane_3 = new JTextPane();
			textPane_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_3.setForeground(new Color(0, 0, 0));
			textPane_3.setBackground(SystemColor.controlHighlight);
			textPane_3.setBounds(274, 334, 1039, 36);
			f.getContentPane().add(textPane_3);
			
			textPane_4 = new JTextPane();
			textPane_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_4.setBackground(SystemColor.controlHighlight);
			textPane_4.setBounds(274, 403, 1039, 36);
			f.getContentPane().add(textPane_4);
			
			textPane_5 = new JTextPane();
			textPane_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_5.setBackground(SystemColor.controlHighlight);
			textPane_5.setBounds(274, 464, 1039, 36);
			f.getContentPane().add(textPane_5);
			
			textPane_6 = new JTextPane();
			textPane_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_6.setBackground(SystemColor.controlHighlight);
			textPane_6.setBounds(274, 530, 1039, 36);
			f.getContentPane().add(textPane_6);
			
			textPane_7 = new JTextPane();
			textPane_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_7.setBackground(SystemColor.controlHighlight);
			textPane_7.setBounds(274, 587, 1039, 36);
			f.getContentPane().add(textPane_7);
			
			textPane_8 = new JTextPane();
			textPane_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			textPane_8.setBackground(SystemColor.controlHighlight);
			textPane_8.setBounds(274, 648, 1039, 36);
			f.getContentPane().add(textPane_8);
			
			SAVEBTN = new JButton("SEARCH");				
			SAVEBTN.addActionListener(new ActionListener() {
				@SuppressWarnings("unused")
				public void actionPerformed(ActionEvent e) {
					
					try {      
						 PreparedStatement pst;
					     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
		                    java.sql.Statement stmtStatement =connection.createStatement();
			            pst = connection.prepareStatement("select Name,Username, Mobile_no, Email_id, Address, Aadhar, Month_starting,Security_amount from viewtenantdetails where flat_no=? ");
			            int flat_no = Integer.parseInt(textPane.getText());
			pst.setInt(1, flat_no);
			ResultSet rs1 = pst.executeQuery();
			if(rs1.next()==false)
			{
			JOptionPane.showMessageDialog(null, "Sorry Record Not Found");
			                                textPane_1.setText("");
			                                textPane_2.setText("");
			                                textPane_3.setText("");
			                                textPane_4.setText("");
			                                textPane_5.setText("");
			                                textPane_6.setText("");
			                                textPane_7.setText("");
			                                textPane_8.setText("");
			                                textPane.requestFocus();
			        }
			                        else
			                        {
			 
			                         textPane_1.setText(rs1.getString("Name"));
			                        textPane_2.setText(rs1.getString("Username"));
			                        textPane_3.setText(rs1.getString("Mobile_no"));
			                        textPane_4.setText(rs1.getString("Email_id"));
			                        textPane_5.setText(rs1.getString("Address"));
			                        textPane_6.setText(rs1.getString("Aadhar"));
			                        textPane_7.setText(rs1.getString("Month_starting"));
			                        textPane_8.setText(rs1.getString("Security_amount"));
			}
			            
			        } catch (SQLException ex) {
			        	ex.printStackTrace();
			        	
			          
			        }
				}
				
			});
			SAVEBTN.setForeground(Color.WHITE);
			SAVEBTN.setBackground(new Color(51, 0, 0));
			SAVEBTN.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
			SAVEBTN.setBounds(484, 147, 169, 36);
			f.getContentPane().add(SAVEBTN);
			
			btnClose = new JButton("BACK");
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					f.setVisible(false);
					new  ownerHomeWebpage();
				}
			});
			btnClose.setForeground(Color.WHITE);
			btnClose.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
			btnClose.setBackground(new Color(51, 0, 0));
			btnClose.setBounds(1341, 725, 160, 42);
			f.getContentPane().add(btnClose);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
			lblNewLabel.setBounds(0, 0, 1540, 845);
			f.getContentPane().add(lblNewLabel);
			f.setBounds(100,100,2000,1000);
		     f.setVisible(true);
		     f.setLocationRelativeTo(null);
		     

	}
	
     
	
	public static void main(String[] args) {
		
		new viewTenantDetails();		
	}
}