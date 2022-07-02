import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class viewPaymentInfo{
	private JTextField textField;
	private JTextField txtMonth;
	private JTextField textField_2;
	private JTextField txtMonth_1;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtRentAmount;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtMaintanance;
	private JTextField txtTotalAmount;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_10;
	private JTextField textField_11;
	
	public viewPaymentInfo(String uname, String password) {
		
		JFrame frmPaymentInformation = new JFrame();
		frmPaymentInformation.setTitle("PAYMENT INFORMATION");
		frmPaymentInformation.setBounds(100,100,2000,1000);
		frmPaymentInformation.setVisible(true);
		frmPaymentInformation.setLocationRelativeTo(null);
		frmPaymentInformation.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("  PAYMENT  INFORMATION");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Mistral", Font.BOLD, 45));
		textField.setColumns(10);
		textField.setBackground(new Color(51, 0, 0));
		textField.setBounds(39, 40, 455, 75);
		frmPaymentInformation.getContentPane().add(textField);
		
		txtMonth = new JTextField();
		txtMonth.setText("FLAT NO");
		txtMonth.setForeground(Color.WHITE);
		txtMonth.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMonth.setColumns(10);
		txtMonth.setBackground(new Color(51, 0, 0));
		txtMonth.setBounds(59, 239, 201, 36);
		frmPaymentInformation.getContentPane().add(txtMonth);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(270, 185, 213, 38);
		frmPaymentInformation.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
   try {
	 PreparedStatement pst;
     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
        java.sql.Statement stmtStatement =connection.createStatement();
    pst = connection.prepareStatement("select flat_no,name, date, rent_amount, maintanance,total_amount,payment_status from payment_info where username='"+uname+"' and month=? ");
    String monthString = textField_2.getText();
	pst.setNString(1, monthString);
    ResultSet rs1 = pst.executeQuery();
    if(rs1.next()==false)
	{
	JOptionPane.showMessageDialog(null, "Please enter valid Month");
	                                textField_2.setText("");
	                               textField_1.setText("");
	                                textField_3.setText("");
	                                textField_8.setText("");
	                                textField_9.setText("");
	                                textField_10.setText("");
	                                textField_11.setText("");
	                                textField_6.setText("");
	                                textField_2.requestFocus();
	        }
	                        else
	                        {
	 
	                        	
	                        	 textField_3.setText(rs1.getString("flat_no"));
	                        	 textField_1.setText(rs1.getString("name"));
	                        textField_8.setText(rs1.getString("date"));
	                        textField_9.setText(rs1.getString("rent_amount"));
	                        textField_10.setText(rs1.getString("maintanance"));
	                        textField_6.setText(rs1.getString("total_amount"));
	                        textField_11.setText(rs1.getString("payment_status"));
	}
    
} catch (Exception e2) {
	e2.printStackTrace();
}
			}
		});
		btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnNewButton.setBackground(new Color(51, 0, 0));
		btnNewButton.setBounds(504, 186, 164, 36);
		frmPaymentInformation.getContentPane().add(btnNewButton);
		
		txtMonth_1 = new JTextField();
		txtMonth_1.setText("MONTH");
		txtMonth_1.setForeground(Color.WHITE);
		txtMonth_1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMonth_1.setColumns(10);
		txtMonth_1.setBackground(new Color(51, 0, 0));
		txtMonth_1.setBounds(59, 186, 201, 36);
		frmPaymentInformation.getContentPane().add(txtMonth_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(270, 238, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(270, 291, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_1);
		
		txtName = new JTextField();
		txtName.setText("NAME");
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBackground(new Color(51, 0, 0));
		txtName.setBounds(59, 293, 201, 36);
		frmPaymentInformation.getContentPane().add(txtName);
		
		txtDate = new JTextField();
		txtDate.setText("DATE");
		txtDate.setForeground(Color.WHITE);
		txtDate.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtDate.setColumns(10);
		txtDate.setBackground(new Color(51, 0, 0));
		txtDate.setBounds(59, 352, 201, 36);
		frmPaymentInformation.getContentPane().add(txtDate);
		
		txtRentAmount = new JTextField();
		txtRentAmount.setText("RENT AMOUNT");
		txtRentAmount.setForeground(Color.WHITE);
		txtRentAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtRentAmount.setColumns(10);
		txtRentAmount.setBackground(new Color(51, 0, 0));
		txtRentAmount.setBounds(59, 413, 201, 36);
		frmPaymentInformation.getContentPane().add(txtRentAmount);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.menu);
		textField_8.setBounds(270, 351, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBackground(SystemColor.menu);
		textField_9.setBounds(270, 412, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_9);
		
		txtMaintanance = new JTextField();
		txtMaintanance.setText("MAINTANANCE");
		txtMaintanance.setForeground(Color.WHITE);
		txtMaintanance.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMaintanance.setColumns(10);
		txtMaintanance.setBackground(new Color(51, 0, 0));
		txtMaintanance.setBounds(59, 479, 201, 36);
		frmPaymentInformation.getContentPane().add(txtMaintanance);
		
		txtTotalAmount = new JTextField();
		txtTotalAmount.setText("TOTAL AMOUNT");
		txtTotalAmount.setForeground(Color.WHITE);
		txtTotalAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtTotalAmount.setColumns(10);
		txtTotalAmount.setBackground(new Color(51, 0, 0));
		txtTotalAmount.setBounds(59, 544, 201, 36);
		frmPaymentInformation.getContentPane().add(txtTotalAmount);
		
		textField_4 = new JTextField();
		textField_4.setText("PAYMENT STATUS");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(51, 0, 0));
		textField_4.setBounds(59, 603, 201, 36);
		frmPaymentInformation.getContentPane().add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.menu);
		textField_6.setBounds(270, 543, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_6);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.menu);
		textField_10.setBounds(270, 479, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_11.setColumns(10);
		textField_11.setBackground(SystemColor.menu);
		textField_11.setBounds(270, 603, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_11);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPaymentInformation.setVisible(false);
				new CustomerHomeWebDesign();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1256, 710, 164, 38);
		frmPaymentInformation.getContentPane().add(btnBack);
		
		JTextArea area = new JTextArea();
		area.setWrapStyleWord(true);
		area.setBackground(SystemColor.textHighlightText);
		area.setForeground(Color.BLACK);
		area.setFont(new Font("HP Simplified Light", Font.BOLD, 19));
		area.setBounds(746, 193, 617, 434);
		frmPaymentInformation.getContentPane().add(area);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Hospital management\\Simple-Background-Images-21.png"));
		lblNewLabel_1.setBounds(735, 185, 639, 454);
		frmPaymentInformation.getContentPane().add(lblNewLabel_1);
		frmPaymentInformation.setVisible(true);
		
		JButton btnGenerateReciept = new JButton("GENERATE RECEIPT");
		btnGenerateReciept.setForeground(Color.WHITE);
		btnGenerateReciept.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnGenerateReciept.setBackground(new Color(51, 0, 0));
		btnGenerateReciept.setBounds(757, 660, 265, 36);
		btnGenerateReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setText("******************************************************************************************\n");
				area.setText(area.getText() + "                                                                   RENT EASY\n");
				area.setText(area.getText() + "******************************************************************************************\n");
				area.setText(area.getText() +"Date : "+textField_8.getText()+"\n\n");
				area.setText(area.getText() +"Flat No : "+textField_3.getText()+"\n\n");
				area.setText(area.getText() +"Name : "+textField_1.getText()+"\n\n");
				area.setText(area.getText() +"Month : "+textField_2.getText()+"\n\n");
				area.setText(area.getText() +"Rent Amount : "+textField_9.getText()+"\n\n");
				area.setText(area.getText() +"Maintanance : "+textField_10.getText()+"\n\n");
				area.setText(area.getText() +"Total Amount : "+textField_6.getText()+"\n\n");
				area.setText(area.getText() +"Payment Status : "+textField_11.getText()+"\n\n");
			}
		});
		frmPaymentInformation.getContentPane().add(btnGenerateReciept);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnPrint.setBackground(new Color(51, 0, 0));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					area.print();
				} catch (PrinterException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
		btnPrint.setBounds(1072, 660, 164, 36);
		frmPaymentInformation.getContentPane().add(btnPrint);
		frmPaymentInformation.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmPaymentInformation.getContentPane().add(lblNewLabel);
		frmPaymentInformation.setVisible(true);
		
		
	}
	
	public viewPaymentInfo() {
		JFrame frmPaymentInformation = new JFrame();
		frmPaymentInformation.setTitle("PAYMENT INFORMATION");
		frmPaymentInformation.setBounds(100,100,2000,1000);
		frmPaymentInformation.setVisible(true);
		frmPaymentInformation.setLocationRelativeTo(null);
		frmPaymentInformation.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("  PAYMENT  INFORMATION");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Mistral", Font.BOLD, 45));
		textField.setColumns(10);
		textField.setBackground(new Color(51, 0, 0));
		textField.setBounds(39, 40, 455, 75);
		frmPaymentInformation.getContentPane().add(textField);
		
		txtMonth = new JTextField();
		txtMonth.setText("FLAT NO");
		txtMonth.setForeground(Color.WHITE);
		txtMonth.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMonth.setColumns(10);
		txtMonth.setBackground(new Color(51, 0, 0));
		txtMonth.setBounds(59, 239, 201, 36);
		frmPaymentInformation.getContentPane().add(txtMonth);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBounds(270, 185, 213, 38);
		frmPaymentInformation.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));

		btnNewButton.setBackground(new Color(51, 0, 0));
		btnNewButton.setBounds(504, 186, 164, 36);
		frmPaymentInformation.getContentPane().add(btnNewButton);
		
		txtMonth_1 = new JTextField();
		txtMonth_1.setText("MONTH");
		txtMonth_1.setForeground(Color.WHITE);
		txtMonth_1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMonth_1.setColumns(10);
		txtMonth_1.setBackground(new Color(51, 0, 0));
		txtMonth_1.setBounds(59, 186, 201, 36);
		frmPaymentInformation.getContentPane().add(txtMonth_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setBounds(270, 238, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(270, 291, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_1);
		
		txtName = new JTextField();
		txtName.setText("NAME");
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBackground(new Color(51, 0, 0));
		txtName.setBounds(59, 293, 201, 36);
		frmPaymentInformation.getContentPane().add(txtName);
		
		txtDate = new JTextField();
		txtDate.setText("DATE");
		txtDate.setForeground(Color.WHITE);
		txtDate.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtDate.setColumns(10);
		txtDate.setBackground(new Color(51, 0, 0));
		txtDate.setBounds(59, 352, 201, 36);
		frmPaymentInformation.getContentPane().add(txtDate);
		
		txtRentAmount = new JTextField();
		txtRentAmount.setText("RENT AMOUNT");
		txtRentAmount.setForeground(Color.WHITE);
		txtRentAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtRentAmount.setColumns(10);
		txtRentAmount.setBackground(new Color(51, 0, 0));
		txtRentAmount.setBounds(59, 413, 201, 36);
		frmPaymentInformation.getContentPane().add(txtRentAmount);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.controlHighlight);
		textField_8.setBounds(270, 351, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBackground(SystemColor.controlHighlight);
		textField_9.setBounds(270, 412, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_9);
		
		txtMaintanance = new JTextField();
		txtMaintanance.setText("MAINTANANCE");
		txtMaintanance.setForeground(Color.WHITE);
		txtMaintanance.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMaintanance.setColumns(10);
		txtMaintanance.setBackground(new Color(51, 0, 0));
		txtMaintanance.setBounds(59, 479, 201, 36);
		frmPaymentInformation.getContentPane().add(txtMaintanance);
		
		txtTotalAmount = new JTextField();
		txtTotalAmount.setText("TOTAL AMOUNT");
		txtTotalAmount.setForeground(Color.WHITE);
		txtTotalAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtTotalAmount.setColumns(10);
		txtTotalAmount.setBackground(new Color(51, 0, 0));
		txtTotalAmount.setBounds(59, 544, 201, 36);
		frmPaymentInformation.getContentPane().add(txtTotalAmount);
		
		textField_4 = new JTextField();
		textField_4.setText("PAYMENT STATUS");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(51, 0, 0));
		textField_4.setBounds(59, 603, 201, 36);
		frmPaymentInformation.getContentPane().add(textField_4);
	
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.controlHighlight);
		textField_6.setBounds(270, 543, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_6);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.controlHighlight);
		textField_10.setBounds(270, 479, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_11.setColumns(10);
		textField_11.setBackground(SystemColor.controlHighlight);
		textField_11.setBounds(270, 602, 398, 38);
		frmPaymentInformation.getContentPane().add(textField_11);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPaymentInformation.setVisible(false);
				new CustomerHomeWebDesign();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1344, 740, 164, 38);
		frmPaymentInformation.getContentPane().add(btnBack);
		
		JTextArea area = new JTextArea();
		area.setWrapStyleWord(true);
		area.setBackground(SystemColor.textHighlightText);
		area.setForeground(Color.BLACK);
		area.setFont(new Font("HP Simplified Light", Font.BOLD, 19));
		area.setBounds(746, 193, 617, 434);
		frmPaymentInformation.getContentPane().add(area);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Hospital management\\Simple-Background-Images-21.png"));
		lblNewLabel_1.setBounds(735, 185, 639, 454);
		frmPaymentInformation.getContentPane().add(lblNewLabel_1);		
		
		JButton btnGenerateReciept = new JButton("GENERATE RECEIPT");
		btnGenerateReciept.setForeground(Color.WHITE);
		btnGenerateReciept.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnGenerateReciept.setBackground(new Color(51, 0, 0));
		btnGenerateReciept.setBounds(757, 660, 265, 36);
		btnGenerateReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setText("******************************************************************************************\n");
				area.setText(area.getText() + "                                                                   RENT EASY\n");
				area.setText(area.getText() + "******************************************************************************************\n");
				area.setText(area.getText() +"Date : "+textField_8.getText()+"\n\n");
				area.setText(area.getText() +"Flat No : "+textField_3.getText()+"\n\n");
				area.setText(area.getText() +"Name : "+textField_1.getText()+"\n\n");
				area.setText(area.getText() +"Month : "+textField_2.getText()+"\n\n");
				area.setText(area.getText() +"Rent Amount : "+textField_9.getText()+"\n\n");
				area.setText(area.getText() +"Maintanance : "+textField_10.getText()+"\n\n");
				area.setText(area.getText() +"Total Amount : "+textField_6.getText()+"\n\n");
				area.setText(area.getText() +"Payment Status : "+textField_11.getText()+"\n\n");
				
			
				
			}
		});
		frmPaymentInformation.getContentPane().add(btnGenerateReciept);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					area.print();
				} catch (PrinterException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnPrint.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnPrint.setBackground(new Color(51, 0, 0));
		btnPrint.setBounds(1072, 660, 164, 36);
		frmPaymentInformation.getContentPane().add(btnPrint);
		btnPrint.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmPaymentInformation.getContentPane().add(lblNewLabel);
		frmPaymentInformation.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new viewPaymentInfo();
	}
}