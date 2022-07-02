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
import java.awt.event.ActionEvent;

public class serviceRequest{
	private JTextField textField;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JTextField txtProblemType;
	private JTextField txtProblemType_1;
	private JTextField txtDescription;
	private JTextField txtServiceRequest;
	
	public serviceRequest() {
		JFrame frame=new JFrame();
		frame.setTitle("SERVICE REQUEST");
		frame.setBounds(100,100,2000,1000);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText(" FLAT NO");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBackground(new Color(51, 0, 0));
		textField.setBounds(60, 165, 201, 36);
		frame.getContentPane().add(textField);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane.setBackground(SystemColor.controlHighlight);
		textPane.setBounds(290, 165, 1039, 36);
		frame.getContentPane().add(textPane);
		
		txtName = new JTextField();
		txtName.setText("NAME");
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBackground(new Color(51, 0, 0));
		txtName.setBounds(60, 230, 201, 36);
		frame.getContentPane().add(txtName);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1.setBackground(SystemColor.controlHighlight);
		textPane_1.setBounds(290, 230, 1039, 36);
		frame.getContentPane().add(textPane_1);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("DATE OF REQUEST");
		txtPhoneNumber.setForeground(Color.WHITE);
		txtPhoneNumber.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBackground(new Color(51, 0, 0));
		txtPhoneNumber.setBounds(60, 289, 201, 36);
		frame.getContentPane().add(txtPhoneNumber);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setForeground(Color.BLACK);
		textPane_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1.setBounds(290, 289, 1039, 36);
		frame.getContentPane().add(textPane_1_1);
		
		txtProblemType = new JTextField();
		txtProblemType.setText("PHONE NUMBER");
		txtProblemType.setForeground(Color.WHITE);
		txtProblemType.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtProblemType.setColumns(10);
		txtProblemType.setBackground(new Color(51, 0, 0));
		txtProblemType.setBounds(60, 351, 201, 36);
		frame.getContentPane().add(txtProblemType);
		
		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setForeground(Color.BLACK);
		textPane_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1_1.setBounds(290, 351, 1039, 36);
		frame.getContentPane().add(textPane_1_1_1);
		
		txtProblemType_1 = new JTextField();
		txtProblemType_1.setText("PROBLEM TYPE");
		txtProblemType_1.setForeground(Color.WHITE);
		txtProblemType_1.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtProblemType_1.setColumns(10);
		txtProblemType_1.setBackground(new Color(51, 0, 0));
		txtProblemType_1.setBounds(60, 414, 201, 36);
		frame.getContentPane().add(txtProblemType_1);
		
		JTextPane textPane_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1.setForeground(Color.BLACK);
		textPane_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_1_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1_1_1.setBounds(290, 414, 1039, 36);
		frame.getContentPane().add(textPane_1_1_1_1);
		
		txtDescription = new JTextField();
		txtDescription.setText("DESCRIPTION");
		txtDescription.setForeground(Color.WHITE);
		txtDescription.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		txtDescription.setColumns(10);
		txtDescription.setBackground(new Color(51, 0, 0));
		txtDescription.setBounds(60, 476, 201, 36);
		frame.getContentPane().add(txtDescription);
		
		JTextPane textPane_1_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1_1.setForeground(Color.BLACK);
		textPane_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPane_1_1_1_1_1.setBackground(SystemColor.controlHighlight);
		textPane_1_1_1_1_1.setBounds(290, 475, 1039, 165);
		frame.getContentPane().add(textPane_1_1_1_1_1);
		
		JButton btnNewButton = new JButton("SUBMIT REQUEST");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				String flatno=textPane.getText();
				String Name =textPane_1.getText();
				  String dateofrequest =textPane_1_1.getText();
               String mobileNumber =textPane_1_1_1.getText();
                String problemType =textPane_1_1_1_1.getText();
                String Description=textPane_1_1_1_1_1.getText();
               
               
                

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
                    java.sql.Statement sta =connection.createStatement();

                    String query = "insert into servicerequest values('" + flatno + "','" + Name + "','" + dateofrequest + "','" + mobileNumber + "','" + problemType + "','"+Description +"')";

              
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Service Request Submitted");
                        
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Eras Medium ITC", Font.BOLD, 21));
		btnNewButton.setBackground(new Color(51, 0, 0));
		btnNewButton.setBounds(35, 687, 239, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new CustomerHomeWebDesign();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 21));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1274, 687, 181, 48);
		frame.getContentPane().add(btnBack);
		
		txtServiceRequest = new JTextField();
		txtServiceRequest.setText(" SERVICE REQUEST");
		txtServiceRequest.setForeground(Color.WHITE);
		txtServiceRequest.setFont(new Font("Mistral", Font.BOLD, 44));
		txtServiceRequest.setColumns(10);
		txtServiceRequest.setBackground(new Color(51, 0, 0));
		txtServiceRequest.setBounds(35, 46, 363, 62);
		frame.getContentPane().add(txtServiceRequest);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\350829-widescreen-website-background-1920x1080-windows-xp.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
	
	public static void main(String[] args) {
		
		new serviceRequest();
	}
}