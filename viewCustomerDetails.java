import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class viewCustomerDetails{
	private JTextField txtViewPersonalDetails;
	private JTextField textField;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtContactNo;
	private JTextField txtEmailId;
	private JTextField txtAddress;
	private JTextField txtAadharNo;
	private JTextField txtMonthStarted;
	private JTextField txtSecurityAmount;
	 
	
	public viewCustomerDetails() {
		
	JFrame frmViewPersonalDetails=new JFrame();
	frmViewPersonalDetails.setTitle("VIEW PERSONAL DETAILS");
	frmViewPersonalDetails.getContentPane().setBackground(Color.WHITE);
	frmViewPersonalDetails.getContentPane().setLayout(null);
	
	txtViewPersonalDetails = new JTextField();
	txtViewPersonalDetails.setText("  VIEW PERSONAL DETAILS");
	txtViewPersonalDetails.setForeground(Color.WHITE);
	txtViewPersonalDetails.setFont(new Font("Mistral", Font.BOLD, 44));
	txtViewPersonalDetails.setColumns(10);
	txtViewPersonalDetails.setBackground(new Color(51,0,0));
	txtViewPersonalDetails.setBounds(59, 32, 444, 87);
	frmViewPersonalDetails.getContentPane().add(txtViewPersonalDetails);
	
	textField = new JTextField();
	textField.setText(" FLAT NO");
	textField.setForeground(Color.WHITE);
	textField.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	textField.setColumns(10);
	textField.setBackground(new Color(51,0,0));
	textField.setBounds(64, 175, 201, 36);
	frmViewPersonalDetails.getContentPane().add(textField);
	
	txtName = new JTextField();
	txtName.setText("NAME");
	txtName.setForeground(Color.WHITE);
	txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtName.setColumns(10);
	txtName.setBackground(new Color(51,0,0));
	txtName.setBounds(64, 233, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtName);
	
	txtUsername = new JTextField();
	txtUsername.setText("USERNAME");
	txtUsername.setForeground(Color.WHITE);
	txtUsername.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtUsername.setColumns(10);
	txtUsername.setBackground(new Color(51,0,0));
	txtUsername.setBounds(64, 289, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtUsername);
	
	txtContactNo = new JTextField();
	txtContactNo.setText("CONTACT NO");
	txtContactNo.setForeground(Color.WHITE);
	txtContactNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtContactNo.setColumns(10);
	txtContactNo.setBackground(new Color(51,0,0));
	txtContactNo.setBounds(64, 346, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtContactNo);
	
	txtEmailId = new JTextField();
	txtEmailId.setText("EMAIL ID");
	txtEmailId.setForeground(Color.WHITE);
	txtEmailId.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtEmailId.setColumns(10);
	txtEmailId.setBackground(new Color(51,0,0));
	txtEmailId.setBounds(64, 408, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtEmailId);
	
	txtAddress = new JTextField();
	txtAddress.setText("ADDRESS");
	txtAddress.setForeground(Color.WHITE);
	txtAddress.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtAddress.setColumns(10);
	txtAddress.setBackground(new Color(51,0,0));
	txtAddress.setBounds(64, 465, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtAddress);
	
	txtAadharNo = new JTextField();
	txtAadharNo.setText("AADHAR NO");
	txtAadharNo.setForeground(Color.WHITE);
	txtAadharNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtAadharNo.setColumns(10);
	txtAadharNo.setBackground(new Color(51,0,0));
	txtAadharNo.setBounds(64, 526, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtAadharNo);
	
	txtMonthStarted = new JTextField();
	txtMonthStarted.setText("MONTH STARTED");
	txtMonthStarted.setForeground(Color.WHITE);
	txtMonthStarted.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtMonthStarted.setColumns(10);
	txtMonthStarted.setBackground(new Color(51,0,0));
	txtMonthStarted.setBounds(64, 583, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtMonthStarted);
	
	txtSecurityAmount = new JTextField();
	txtSecurityAmount.setText("SECURITY AMOUNT");
	txtSecurityAmount.setForeground(Color.WHITE);
	txtSecurityAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
	txtSecurityAmount.setColumns(10);
	txtSecurityAmount.setBackground(new Color(51,0,0));
	txtSecurityAmount.setBounds(64, 641, 201, 36);
	frmViewPersonalDetails.getContentPane().add(txtSecurityAmount);
	
	JTextPane textPane_1 = new JTextPane();
	textPane_1.setForeground(Color.BLACK);
	textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1.setBackground(SystemColor.controlHighlight);
	textPane_1.setBounds(294, 175, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1);
	
	JTextPane textPane_1_1 = new JTextPane();
	textPane_1_1.setForeground(Color.BLACK);
	textPane_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_1.setBackground(SystemColor.controlHighlight);
	textPane_1_1.setBounds(294, 233, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_1);
	
	JTextPane textPane_1_2 = new JTextPane();
	textPane_1_2.setForeground(Color.BLACK);
	textPane_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_2.setBackground(SystemColor.controlHighlight);
	textPane_1_2.setBounds(294, 289, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_2);
	
	JTextPane textPane_1_3 = new JTextPane();
	textPane_1_3.setForeground(Color.BLACK);
	textPane_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_3.setBackground(SystemColor.controlHighlight);
	textPane_1_3.setBounds(294, 346, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_3);
	
	JTextPane textPane_1_4 = new JTextPane();
	textPane_1_4.setForeground(Color.BLACK);
	textPane_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_4.setBackground(SystemColor.controlHighlight);
	textPane_1_4.setBounds(294, 408, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_4);
	
	JTextPane textPane_1_5 = new JTextPane();
	textPane_1_5.setForeground(Color.BLACK);
	textPane_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_5.setBackground(SystemColor.controlHighlight);
	textPane_1_5.setBounds(294, 465, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_5);
	
	JTextPane textPane_1_6 = new JTextPane();
	textPane_1_6.setForeground(Color.BLACK);
	textPane_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_6.setBackground(SystemColor.controlHighlight);
	textPane_1_6.setBounds(294, 526, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_6);
	
	JTextPane textPane_1_7 = new JTextPane();
	textPane_1_7.setForeground(Color.BLACK);
	textPane_1_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_7.setBackground(SystemColor.controlHighlight);
	textPane_1_7.setBounds(294, 583, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_7);
	
	JTextPane textPane_1_8 = new JTextPane();
	textPane_1_8.setForeground(Color.BLACK);
	textPane_1_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	textPane_1_8.setBackground(SystemColor.controlHighlight);
	textPane_1_8.setBounds(294, 641, 1039, 36);
	frmViewPersonalDetails.getContentPane().add(textPane_1_8);
	
	JButton btnClose = new JButton("BACK");
	btnClose.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		frmViewPersonalDetails.setVisible(false);
		new CustomerHomeWebDesign();
		}
	});
	btnClose.setForeground(Color.WHITE);
	btnClose.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
	btnClose.setBackground(new Color(51,0,0));
	btnClose.setBounds(1270, 721, 160, 42);
	frmViewPersonalDetails.getContentPane().add(btnClose);
	
	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setBackground(new Color(224, 255, 255));
	lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
	lblNewLabel.setBounds(0, 0, 1540, 845);
	frmViewPersonalDetails.getContentPane().add(lblNewLabel);
	frmViewPersonalDetails.setBounds(100,100,2000,1000);
	frmViewPersonalDetails.setLocationRelativeTo(null);
	frmViewPersonalDetails.setVisible(true);
	
	
	
	}
	
	
	
	
	public viewCustomerDetails(String uname, String password) {
		JFrame frmViewPersonalDetails=new JFrame();
		frmViewPersonalDetails.setTitle("VIEW PERSONAL DETAILS");
		frmViewPersonalDetails.getContentPane().setBackground(Color.WHITE);
		frmViewPersonalDetails.getContentPane().setLayout(null);
		
		txtViewPersonalDetails = new JTextField();
		txtViewPersonalDetails.setText("  VIEW PERSONAL DETAILS");
		txtViewPersonalDetails.setForeground(Color.WHITE);
		txtViewPersonalDetails.setFont(new Font("Mistral", Font.BOLD, 44));
		txtViewPersonalDetails.setColumns(10);
		txtViewPersonalDetails.setBackground(new Color(51,0,0));
		txtViewPersonalDetails.setBounds(59, 32, 444, 87);
		frmViewPersonalDetails.getContentPane().add(txtViewPersonalDetails);
		
		textField = new JTextField();
		textField.setText(" FLAT NO");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBackground(new Color(51,0,0));
		textField.setBounds(64, 175, 201, 36);
		frmViewPersonalDetails.getContentPane().add(textField);
		
		txtName = new JTextField();
		txtName.setText("NAME");
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBackground(new Color(51,0,0));
		txtName.setBounds(64, 233, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtName);
		
		txtUsername = new JTextField();
		txtUsername.setText("USERNAME");
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(51,0,0));
		txtUsername.setBounds(64, 289, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtUsername);
		
		txtContactNo = new JTextField();
		txtContactNo.setText("CONTACT NO");
		txtContactNo.setForeground(Color.WHITE);
		txtContactNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtContactNo.setColumns(10);
		txtContactNo.setBackground(new Color(51,0,0));
		txtContactNo.setBounds(64, 346, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtContactNo);
		
		txtEmailId = new JTextField();
		txtEmailId.setText("EMAIL ID");
		txtEmailId.setForeground(Color.WHITE);
		txtEmailId.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtEmailId.setColumns(10);
		txtEmailId.setBackground(new Color(51,0,0));
		txtEmailId.setBounds(64, 408, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtEmailId);
		
		txtAddress = new JTextField();
		txtAddress.setText("ADDRESS");
		txtAddress.setForeground(Color.WHITE);
		txtAddress.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtAddress.setColumns(10);
		txtAddress.setBackground(new Color(51,0,0));
		txtAddress.setBounds(64, 465, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtAddress);
		
		txtAadharNo = new JTextField();
		txtAadharNo.setText("AADHAR NO");
		txtAadharNo.setForeground(Color.WHITE);
		txtAadharNo.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtAadharNo.setColumns(10);
		txtAadharNo.setBackground(new Color(51,0,0));
		txtAadharNo.setBounds(64, 526, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtAadharNo);
		
		txtMonthStarted = new JTextField();
		txtMonthStarted.setText("MONTH STARTED");
		txtMonthStarted.setForeground(Color.WHITE);
		txtMonthStarted.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMonthStarted.setColumns(10);
		txtMonthStarted.setBackground(new Color(51,0,0));
		txtMonthStarted.setBounds(64, 583, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtMonthStarted);
		
		txtSecurityAmount = new JTextField();
		txtSecurityAmount.setText("SECURITY AMOUNT");
		txtSecurityAmount.setForeground(Color.WHITE);
		txtSecurityAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtSecurityAmount.setColumns(10);
		txtSecurityAmount.setBackground(new Color(51,0,0));
		txtSecurityAmount.setBounds(64, 641, 201, 36);
		frmViewPersonalDetails.getContentPane().add(txtSecurityAmount);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1.setBackground(SystemColor.controlHighlight);
		textPane_1.setBounds(294, 175, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setForeground(Color.BLACK);
		textPane_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1.setBounds(294, 233, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_1);
		
		JTextPane textPane_1_2 = new JTextPane();
		textPane_1_2.setForeground(Color.BLACK);
		textPane_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_2.setBackground(SystemColor.controlHighlight);
		textPane_1_2.setBounds(294, 289, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_2);
		
		JTextPane textPane_1_3 = new JTextPane();
		textPane_1_3.setForeground(Color.BLACK);
		textPane_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_3.setBackground(SystemColor.controlHighlight);
		textPane_1_3.setBounds(294, 346, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_3);
		
		JTextPane textPane_1_4 = new JTextPane();
		textPane_1_4.setForeground(Color.BLACK);
		textPane_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_4.setBackground(SystemColor.controlHighlight);
		textPane_1_4.setBounds(294, 408, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_4);
		
		JTextPane textPane_1_5 = new JTextPane();
		textPane_1_5.setForeground(Color.BLACK);
		textPane_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_5.setBackground(SystemColor.controlHighlight);
		textPane_1_5.setBounds(294, 465, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_5);
		
		JTextPane textPane_1_6 = new JTextPane();
		textPane_1_6.setForeground(Color.BLACK);
		textPane_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_6.setBackground(SystemColor.controlHighlight);
		textPane_1_6.setBounds(294, 526, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_6);
		
		JTextPane textPane_1_7 = new JTextPane();
		textPane_1_7.setForeground(Color.BLACK);
		textPane_1_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_7.setBackground(SystemColor.controlHighlight);
		textPane_1_7.setBounds(294, 583, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_7);
		
		JTextPane textPane_1_8 = new JTextPane();
		textPane_1_8.setForeground(Color.BLACK);
		textPane_1_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_8.setBackground(SystemColor.controlHighlight);
		textPane_1_8.setBounds(294, 641, 1039, 36);
		frmViewPersonalDetails.getContentPane().add(textPane_1_8);
		
		JButton btnClose = new JButton("BACK");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frmViewPersonalDetails.setVisible(false);
			new CustomerHomeWebDesign();
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
		btnClose.setBackground(new Color(51,0,0));
		btnClose.setBounds(1270, 721, 160, 42);
		frmViewPersonalDetails.getContentPane().add(btnClose);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmViewPersonalDetails.getContentPane().add(lblNewLabel);
		frmViewPersonalDetails.setBounds(100,100,2000,1000);
		frmViewPersonalDetails.setLocationRelativeTo(null);
		frmViewPersonalDetails.setVisible(true);
		
			try {
				PreparedStatement pst;
			     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
	               
	               pst = connection.prepareStatement("select flat_no,Name,Username, Mobile_no, Email_id, Address, Aadhar, Month_starting,Security_amount from viewtenantdetails where Username='"+uname+"' and Password='"+password+"' ");
	               ResultSet rs1 = pst.executeQuery();
	              
	           	if(rs1.next()==true)
				  {
				        	
		 
		                         textPane_1.setText(rs1.getString("flat_no"));
		                         textPane_1_1.setText(rs1.getString("Name"));
		                        textPane_1_2.setText(rs1.getString("Username"));
		                        textPane_1_3.setText(rs1.getString("Mobile_no"));
		                        textPane_1_4.setText(rs1.getString("Email_id"));
		                        textPane_1_5.setText(rs1.getString("Address"));
		                        textPane_1_6.setText(rs1.getString("Aadhar"));
		                        textPane_1_7.setText(rs1.getString("Month_starting"));
		                        textPane_1_8.setText(rs1.getString("Security_amount"));

						}
				               
			} catch (Exception e) {
				
			}
			
	}





	public static void main(String[] args) {
		
		new viewCustomerDetails();
	}
}