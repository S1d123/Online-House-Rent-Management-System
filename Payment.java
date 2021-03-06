import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Payment{
	private JTextField textField;
	private JTextField txtMonth;
	private JTextField txtDate;
	private JTextField txtRentAmount;
	private JTextField txtElectricityBill;
	private JTextField txtGasBill;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField txtTotalAmount;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txtPaymentInformation;
	private JButton btnGenerateReceipt;
	private JTextField txtStatus;
	
	public Payment() {
		JFrame frmPaymentInformation=new JFrame();
		frmPaymentInformation.getContentPane().setBackground(SystemColor.info);
		frmPaymentInformation.setTitle("PAYMENT INFORMATION");
		frmPaymentInformation.setBounds(100,100,2000,1000);
		frmPaymentInformation.setLocationRelativeTo(null);
		frmPaymentInformation.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText(" FLAT NO");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBackground(new Color(51, 0, 0));
		textField.setBounds(37, 153, 201, 36);
		frmPaymentInformation.getContentPane().add(textField);
		
		txtMonth = new JTextField();
		txtMonth.setText("NAME");
		txtMonth.setForeground(Color.WHITE);
		txtMonth.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtMonth.setColumns(10);
		txtMonth.setBackground(new Color(51, 0, 0));
		txtMonth.setBounds(37, 210, 201, 36);
		frmPaymentInformation.getContentPane().add(txtMonth);
		
		txtDate = new JTextField();
		txtDate.setText("MONTH");
		txtDate.setForeground(Color.WHITE);
		txtDate.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtDate.setColumns(10);
		txtDate.setBackground(new Color(51, 0, 0));
		txtDate.setBounds(37, 317, 201, 36);
		frmPaymentInformation.getContentPane().add(txtDate);
		
		txtRentAmount = new JTextField();
		txtRentAmount.setText("DATE");
		txtRentAmount.setForeground(Color.WHITE);
		txtRentAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtRentAmount.setColumns(10);
		txtRentAmount.setBackground(new Color(51, 0, 0));
		txtRentAmount.setBounds(37, 370, 201, 36);
		frmPaymentInformation.getContentPane().add(txtRentAmount);
		
		txtElectricityBill = new JTextField();
		txtElectricityBill.setText("RENT AMOUNT");
		txtElectricityBill.setForeground(Color.WHITE);
		txtElectricityBill.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtElectricityBill.setColumns(10);
		txtElectricityBill.setBackground(new Color(51, 0, 0));
		txtElectricityBill.setBounds(37, 422, 201, 36);
		frmPaymentInformation.getContentPane().add(txtElectricityBill);
		
		txtGasBill = new JTextField();
		txtGasBill.setText("USERNAME");
		txtGasBill.setForeground(Color.WHITE);
		txtGasBill.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtGasBill.setColumns(10);
		txtGasBill.setBackground(new Color(51, 0, 0));
		txtGasBill.setBounds(37, 263, 201, 36);
		frmPaymentInformation.getContentPane().add(txtGasBill);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(260, 153, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setColumns(10);
		textField_2.setBounds(260, 209, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setColumns(10);
		textField_3.setBounds(260, 262, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_4.setBackground(SystemColor.controlHighlight);
		textField_4.setColumns(10);
		textField_4.setBounds(260, 316, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_5.setBackground(SystemColor.controlHighlight);
		textField_5.setColumns(10);
		textField_5.setBounds(260, 369, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_6.setBackground(SystemColor.controlHighlight);
		textField_6.setColumns(10);
		textField_6.setBounds(260, 421, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_7.setBackground(SystemColor.controlHighlight);
		textField_7.setColumns(10);
		textField_7.setBounds(260, 470, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.controlHighlight);
		textField_8.setBounds(260, 518, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_8);
		
		txtTotalAmount = new JTextField();
		txtTotalAmount.setText("MAINTANANCE");
		txtTotalAmount.setForeground(Color.WHITE);
		txtTotalAmount.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtTotalAmount.setColumns(10);
		txtTotalAmount.setBackground(new Color(51, 0, 0));
		txtTotalAmount.setBounds(37, 471, 201, 36);
		frmPaymentInformation.getContentPane().add(txtTotalAmount);
		
		textField_9 = new JTextField();
		textField_9.setText("TOTAL AMOUNT");
		textField_9.setForeground(Color.WHITE);
		textField_9.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(51, 0, 0));
		textField_9.setBounds(37, 519, 201, 36);
		frmPaymentInformation.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.controlHighlight);
		textField_10.setBounds(260, 566, 333, 38);
		frmPaymentInformation.getContentPane().add(textField_10);
		
		JTextArea area = new JTextArea();
		area.setWrapStyleWord(true);
		area.setBackground(SystemColor.textHighlightText);
		area.setForeground(Color.BLACK);
		area.setFont(new Font("HP Simplified Light", Font.BOLD, 20));
		area.setBounds(659, 150, 625, 454);
		frmPaymentInformation.getContentPane().add(area);
		frmPaymentInformation.setVisible(true);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(51, 0, 0));
		btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String flatno=textField_1.getText();
				String Name =textField_2.getText();
				String username = textField_3.getText();
				  String month=textField_4.getText();
				  String date=textField_5.getText();
				  String rentamount=textField_6.getText();
                String maintanance =textField_7.getText();
                String totalamount=textField_8.getText();
                String paymentstatus=textField_10.getText();
                
					
                	
                	 try {
                		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
  	                    java.sql.Statement sta =connection.createStatement();

 	                    String query = "insert into payment_info values('" + flatno + "','" + Name + "','"+username+"','" + month + "','" + date + "','" + rentamount + "','"+ maintanance+"','"+ totalamount+"','"+paymentstatus+"')";

 	              
 	                    int x = sta.executeUpdate(query);
 	                    if (x == 0) {
 	                      
 	                    } else {
 	                        JOptionPane.showMessageDialog(btnNewButton, "Payment Information Saved Successfully");
 	                        
 	                    }
 	                    connection.close();
 	                } catch (Exception exception) {
 	                    exception.printStackTrace();
 	                }
 	            }
 	        });
		
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPaymentInformation.setVisible(false);
				new ownerHomeWebpage();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1334, 727, 159, 44);
		frmPaymentInformation.getContentPane().add(btnBack);
		
		txtPaymentInformation = new JTextField();
		txtPaymentInformation.setText("  PAYMENT  INFORMATION");
		txtPaymentInformation.setForeground(Color.WHITE);
		txtPaymentInformation.setFont(new Font("Mistral", Font.BOLD, 44));
		txtPaymentInformation.setColumns(10);
		txtPaymentInformation.setBackground(new Color(51, 0, 0));
		txtPaymentInformation.setBounds(37, 31, 440, 62);
		frmPaymentInformation.getContentPane().add(txtPaymentInformation);
		
		btnGenerateReceipt = new JButton("GENERATE RECEIPT");
		btnGenerateReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setText("******************************************************************************************\n");
				area.setText(area.getText() + "                                                                   RENT EASY\n");
				area.setText(area.getText() + "******************************************************************************************\n");
				area.setText(area.getText() +"Date : "+textField_5.getText()+"\n\n");
				area.setText(area.getText() +"Flat No : "+textField_1.getText()+"\n\n");
				area.setText(area.getText() +"Name : "+textField_2.getText()+"\n\n");
				area.setText(area.getText() +"Month : "+textField_4.getText()+"\n\n");
				area.setText(area.getText() +"Rent Amount : "+textField_6.getText()+"\n\n");
				area.setText(area.getText() +"Maintanance : "+textField_7.getText()+"\n\n");
				area.setText(area.getText() +"Total Amount : "+textField_8.getText()+"\n\n");
				area.setText(area.getText() +"Payment Status : "+textField_10.getText()+"\n\n");
				
			
				
			}
		});
		btnGenerateReceipt.setForeground(Color.WHITE);
		btnGenerateReceipt.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnGenerateReceipt.setBackground(new Color(51, 0, 0));
		btnGenerateReceipt.setBounds(711, 643, 266, 44);
		frmPaymentInformation.getContentPane().add(btnGenerateReceipt);
		
		btnNewButton.setBounds(43, 643, 175, 44);
		frmPaymentInformation.getContentPane().add(btnNewButton);
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					area.print();
				}catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnPrint.setBackground(new Color(51, 0, 0));
		btnPrint.setBounds(1057, 643, 168, 44);
		frmPaymentInformation.getContentPane().add(btnPrint);
		
		JButton btnUpdate = new JButton("UPDATE STATUS");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pstatus=textField_10.getText();
				String fno=textField_1.getText();
				try {
					 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
	                    java.sql.Statement sta =connection.createStatement();
	                    String query1="update payment_info set payment_status ='"+pstatus+"' where flat_no='"+fno+"' ";
	                    int k = sta.executeUpdate(query1);
	                    
	                    if (k == 0) {
	 	                      
 	                    } else {
 	                        JOptionPane.showMessageDialog(btnNewButton, "Payment Information Updated Successfully");
 	                        
 	                    }
 	                    connection.close();

				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
					
				}
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		btnUpdate.setBackground(new Color(51, 0, 0));
		btnUpdate.setBounds(285, 643, 245, 44);
		frmPaymentInformation.getContentPane().add(btnUpdate);
		
		txtStatus = new JTextField();
		txtStatus.setText("PAYMENT STATUS");
		txtStatus.setForeground(Color.WHITE);
		txtStatus.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtStatus.setColumns(10);
		txtStatus.setBackground(new Color(51, 0, 0));
		txtStatus.setBounds(37, 565, 201, 36);
		frmPaymentInformation.getContentPane().add(txtStatus);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Hospital management\\Simple-Background-Images-21.png"));
		lblNewLabel_1.setBounds(649, 138, 644, 478);
		frmPaymentInformation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmPaymentInformation.getContentPane().add(lblNewLabel);
		
		
		
	
		
	}
	public static void main(String[] args) {
		
		new Payment();
	}
}