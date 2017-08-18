import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;

public class Login {

	JFrame frmLogin;
	private JTextField enteredUsername;
	private JPasswordField enteredPassword;
	private String username;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setBackground(Color.GRAY);
		frmLogin.setBounds(100, 100, 318, 232);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblInvalidLogin = new JLabel(" ");
		lblInvalidLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInvalidLogin.setForeground(Color.RED);
		lblInvalidLogin.setBounds(111, 11, 86, 20);
		frmLogin.getContentPane().add(lblInvalidLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(29, 47, 88, 26);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(29, 84, 88, 26);
		frmLogin.getContentPane().add(lblPassword);

		enteredUsername = new JTextField();
		enteredUsername.setBounds(111, 50, 86, 20);
		frmLogin.getContentPane().add(enteredUsername);
		enteredUsername.setColumns(10);
		
		
		enteredPassword = new JPasswordField();
		enteredPassword.setBounds(111, 84, 86, 20);
		frmLogin.getContentPane().add(enteredPassword);
		enteredPassword.setColumns(10);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(UIManager.getColor("Button.background"));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try 
				{
					String dbUrl = "jdbc:mysql://localhost:3306/student_login";
					String user = "root";
					String password = "";
					Connection myConn = DriverManager.getConnection(dbUrl, user,password);
					Statement myStmt = myConn.createStatement();
					username = enteredUsername.getText();
					String givenPassword = enteredPassword.getText();
					ResultSet myRs = myStmt.executeQuery("select * from login Where username = '" + username +"' and password = '"+ givenPassword +"'");

					if(myRs.next()) {
						
						frmLogin.dispose();
						HomePage obj = new HomePage();
						obj.setVisible(true);
						
					}
					
					else
					{
						
						lblInvalidLogin.setText("Invalid Login");
						
					}
				

				} catch (Exception e) {
					e.printStackTrace();
				
				}}});
		
		btnLogin.setBounds(111, 124, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
	}
}
