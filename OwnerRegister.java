import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class OwnerRegister{
	private JPasswordField password1;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField username;
	private JTextField email ;
	private JTextField mob;
	private JButton btnSignUp;
	
	
	public OwnerRegister() {
		JFrame f= new JFrame();
		f.setTitle("CREATE AN ACCOUNT");
		f.getContentPane().setBackground(new Color(245, 245, 245));
		f.setBounds(100,100,2000,1000);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Hospital management\\Capture101.PNG"));
		lblNewLabel.setBounds(136, 120, 661, 621);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("CREATE AN ACCOUNT");
		lblNewLabel_2.setFont(new Font("Mistral", Font.BOLD, 69));
		lblNewLabel_2.setBounds(871, 107, 572, 70);
		f.getContentPane().add(lblNewLabel_2);
		
		firstname = new JTextField();
		firstname.setFont(new Font("Tahoma", Font.BOLD, 14));
		firstname.setBackground(Color.WHITE);
		firstname.setBounds(978, 244, 408, 38);
		f.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		 lastname = new JTextField();
		 lastname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lastname.setBackground(Color.WHITE);
		lastname.setColumns(10);
		lastname.setBounds(978, 308, 408, 38);
		f.getContentPane().add(lastname);
		
	 username = new JTextField();
	 username.setFont(new Font("Tahoma", Font.BOLD, 14));
		username.setBackground(Color.WHITE);
		username.setColumns(10);
		username.setBounds(978, 370, 408, 38);
		f.getContentPane().add(username);
		
		 email = new JTextField();
		 email.setFont(new Font("Tahoma", Font.BOLD, 14));
		email.setBackground(Color.WHITE);
		email.setColumns(10);
		email.setBounds(978, 488, 408, 38);
		f.getContentPane().add(email);
		
		 mob = new JTextField();
		 mob.setFont(new Font("Tahoma", Font.BOLD, 14));
		mob.setBackground(Color.WHITE);
		mob.setColumns(10);
		mob.setBounds(978, 549, 408, 38);
		f.getContentPane().add(mob);
		
		JLabel lblNewLabel_1 = new JLabel("FIRST NAME");
		lblNewLabel_1.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_1.setBounds(826, 240, 142, 38);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("LAST NAME");
		lblNewLabel_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(826, 304, 134, 38);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("USERNAME");
		lblNewLabel_1_2.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(826, 366, 142, 38);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("PASSWORD");
		lblNewLabel_1_3.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_1_3.setBounds(826, 425, 127, 38);
		f.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("EMAIL ID");
		lblNewLabel_1_4.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_1_4.setBounds(826, 484, 120, 38);
		f.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("PHONE NO");
		lblNewLabel_1_5.setFont(new Font("Goudy Old Style", Font.BOLD, 22));
		lblNewLabel_1_5.setBounds(826, 545, 134, 38);
		f.getContentPane().add(lblNewLabel_1_5);
		
		 btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password=password1.getText();
        

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnSignUp, "Enter a valid mobile number");
                }
                
                else if (firstName.equals("")||lastName.equals("")||emailId.equals("")||userName.equals("")||mobileNumber.equals("")) {
                	JOptionPane.showMessageDialog(null, "One or More fields are empty");
					
				}
                
                else{

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb", "root", "Sid@1234");
                    java.sql.Statement sta =connection.createStatement();

                    String query = "insert into swing_demo1 values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + emailId + "','" + mobileNumber + "')";
                    


                   
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnSignUp, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnSignUp,
                            "Welcome, " + msg + "Your account is sucessfully created");
                        f.setVisible(false);
                        new ownerLoginPage();
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
			}
        });
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Eras Medium ITC", Font.BOLD, 27));
		btnSignUp.setBackground(new Color(51, 0, 0));
		btnSignUp.setBounds(1003, 646, 161, 58);
		f.getContentPane().add(btnSignUp);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new ownerLoginPage();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Eras Medium ITC", Font.BOLD, 27));
		btnBack.setBackground(new Color(51, 0, 0));
		btnBack.setBounds(1335, 727, 142, 38);
		f.getContentPane().add(btnBack);
		
		password1 = new JPasswordField();
		password1.setFont(new Font("Tahoma", Font.BOLD, 14));
		password1.setBackground(Color.WHITE);
		password1.setBounds(978, 429, 408, 38);
		f.getContentPane().add(password1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("         Thanks for being a part of RentEasy family!");
		lblNewLabel_2_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_2_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
		lblNewLabel_2_2_1.setBounds(857, 172, 588, 51);
		f.getContentPane().add(lblNewLabel_2_2_1);
		f.setBounds(100,100,2000,1000);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new OwnerRegister();
	}
}