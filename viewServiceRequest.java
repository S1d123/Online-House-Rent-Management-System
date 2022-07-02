import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class viewServiceRequest{
	private JTextField textField;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JTextField txtProblemType;
	private JTextField txtProblemType_1;
	private JTextField txtDescription;
	private JTextField txtServiceRequest;
	
	public viewServiceRequest() {
		JFrame frmViewServiceRequest=new JFrame();
		frmViewServiceRequest.setTitle("VIEW SERVICE REQUEST");
		frmViewServiceRequest.setBounds(100,100,2000,1000);
		frmViewServiceRequest.setVisible(true);
		frmViewServiceRequest.setLocationRelativeTo(null);
		frmViewServiceRequest.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText(" FLAT NO");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBackground(new Color(51, 0, 0));
		textField.setBounds(56, 165, 201, 36);
		frmViewServiceRequest.getContentPane().add(textField);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textPane.setBackground(SystemColor.controlHighlight);
		textPane.setBounds(290, 165, 173, 36);
		frmViewServiceRequest.getContentPane().add(textPane);
		
		txtName = new JTextField();
		txtName.setText("NAME");
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBackground(new Color(51, 0, 0));
		txtName.setBounds(56, 230, 201, 36);
		frmViewServiceRequest.getContentPane().add(txtName);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textPane_1.setBackground(SystemColor.controlHighlight);
		textPane_1.setBounds(290, 230, 872, 36);
		frmViewServiceRequest.getContentPane().add(textPane_1);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("DATE OF REQUEST");
		txtPhoneNumber.setForeground(Color.WHITE);
		txtPhoneNumber.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBackground(new Color(51, 0, 0));
		txtPhoneNumber.setBounds(56, 289, 201, 36);
		frmViewServiceRequest.getContentPane().add(txtPhoneNumber);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setForeground(Color.BLACK);
		textPane_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textPane_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1.setBounds(290, 289, 872, 36);
		frmViewServiceRequest.getContentPane().add(textPane_1_1);
		
		txtProblemType = new JTextField();
		txtProblemType.setText("PHONE NUMBER");
		txtProblemType.setForeground(Color.WHITE);
		txtProblemType.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtProblemType.setColumns(10);
		txtProblemType.setBackground(new Color(51, 0, 0));
		txtProblemType.setBounds(56, 351, 201, 36);
		frmViewServiceRequest.getContentPane().add(txtProblemType);
		
		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setForeground(Color.BLACK);
		textPane_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textPane_1_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1_1.setBounds(290, 351, 872, 36);
		frmViewServiceRequest.getContentPane().add(textPane_1_1_1);
		
		txtProblemType_1 = new JTextField();
		txtProblemType_1.setText("PROBLEM TYPE");
		txtProblemType_1.setForeground(Color.WHITE);
		txtProblemType_1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtProblemType_1.setColumns(10);
		txtProblemType_1.setBackground(new Color(51, 0, 0));
		txtProblemType_1.setBounds(56, 414, 201, 36);
		frmViewServiceRequest.getContentPane().add(txtProblemType_1);
		
		JTextPane textPane_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1.setForeground(Color.BLACK);
		textPane_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textPane_1_1_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1_1_1.setBounds(290, 414, 872, 36);
		frmViewServiceRequest.getContentPane().add(textPane_1_1_1_1);
		
		txtDescription = new JTextField();
		txtDescription.setText("DESCRIPTION");
		txtDescription.setForeground(Color.WHITE);
		txtDescription.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtDescription.setColumns(10);
		txtDescription.setBackground(new Color(51, 0, 0));
		txtDescription.setBounds(56, 475, 201, 36);
		frmViewServiceRequest.getContentPane().add(txtDescription);
		
		JTextPane textPane_1_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1_1.setForeground(Color.BLACK);
		textPane_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textPane_1_1_1_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1_1_1_1.setBounds(290, 475, 872, 150);
		frmViewServiceRequest.getContentPane().add(textPane_1_1_1_1_1);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {      
					 PreparedStatement pst;
				     Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
	                    java.sql.Statement stmtStatement =connection.createStatement();
		            pst = connection.prepareStatement("select Name,Date_of_request, Phone_number, Problem_type, Description from servicerequest where flat_no=? ");
		            int flat_no = Integer.parseInt(textPane.getText());
		pst.setInt(1, flat_no);
		ResultSet rs1 = pst.executeQuery();
		if(rs1.next()==false)
		{
		JOptionPane.showMessageDialog(null, "Service Request Not Found");
		                                textPane.setText("");
		                                textPane_1.setText("");
		                                textPane_1_1.setText("");
		                                textPane_1_1_1.setText("");
		                                textPane_1_1_1_1.setText("");
		                                textPane_1_1_1_1_1.setText("");
		                                
		                                
		                                textPane.requestFocus();
		        }
		                        else
		                        {
		 
		                         textPane_1.setText(rs1.getString("Name"));
		                        textPane_1_1.setText(rs1.getString("Date_of_request"));
		                        textPane_1_1_1.setText(rs1.getString("Phone_number"));
		                        textPane_1_1_1_1.setText(rs1.getString("Problem_type"));
		                        textPane_1_1_1_1_1.setText(rs1.getString("Description"));
		                        
		}
		            
		        } catch (SQLException ex) {
		        	ex.printStackTrace();
		        	
		          
		        }
			}
			
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 21));
		btnNewButton.setBackground(new Color(51, 0, 0));
		btnNewButton.setBounds(487, 163, 153, 36);
		frmViewServiceRequest.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmViewServiceRequest.setVisible(false);
				new ownerHomeWebpage();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 21));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1274, 687, 181, 48);
		frmViewServiceRequest.getContentPane().add(btnBack);
		
		txtServiceRequest = new JTextField();
		txtServiceRequest.setText(" VIEW SERVICE REQUEST");
		txtServiceRequest.setForeground(Color.WHITE);
		txtServiceRequest.setFont(new Font("Mistral", Font.BOLD, 44));
		txtServiceRequest.setColumns(10);
		txtServiceRequest.setBackground(new Color(51, 0, 0));
		txtServiceRequest.setBounds(35, 35, 416, 73);
		frmViewServiceRequest.getContentPane().add(txtServiceRequest);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frmViewServiceRequest.getContentPane().add(lblNewLabel);
		
		
	}
	
	public static void main(String[] args) {
		
		new viewServiceRequest();
	}
}