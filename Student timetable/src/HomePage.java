import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {
	
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public HomePage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 371);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setBounds(45, 23, 95, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(45, 57, 95, 23);
		contentPane.add(lblStudentId);
		
		JLabel lblNewLabel_1 = new JLabel("User ");
		lblNewLabel_1.setBounds(162, 27, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("918098");
		label.setBounds(162, 61, 46, 14);
		contentPane.add(label);
		
		JLabel lblCourse1 = new JLabel("New label");
		lblCourse1.setBounds(22, 120, 257, 23);
		contentPane.add(lblCourse1);
		
		JLabel lblCourse2 = new JLabel("New label");
		lblCourse2.setBounds(22, 154, 257, 23);
		contentPane.add(lblCourse2);
		
		JLabel lblCourse3 = new JLabel("New label");
		lblCourse3.setBounds(22, 188, 257, 23);
		contentPane.add(lblCourse3);
		
		JLabel lblCourse4 = new JLabel("New label");
		lblCourse4.setBounds(22, 222, 257, 23);
		contentPane.add(lblCourse4);
		
		JButton btnViewCourse = new JButton("View Course");
		btnViewCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					String dbUrl = "jdbc:mysql://localhost:3306/student_login";
					String user = "root";
					String password = "";
					Connection myConn = DriverManager.getConnection(dbUrl, user,password);
					Statement myStmt = myConn.createStatement();
					ResultSet myRs = myStmt.executeQuery("select Course_Name, Tutor from course where Course_ID = '1'");

					while(myRs.next()) {
					lblCourse1.setText(myRs.getString("Course_Name") + " "+ myRs.getString("Tutor"));
					
					}
				

				} catch (Exception e) {
					e.printStackTrace();
				
				}}});
		
		btnViewCourse.setBounds(279, 120, 117, 23);
		contentPane.add(btnViewCourse);
		
		JButton btnViewCourse1 = new JButton("View Course");
		btnViewCourse1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					String dbUrl = "jdbc:mysql://localhost:3306/student_login";
					String user = "root";
					String password = "";
					Connection myConn = DriverManager.getConnection(dbUrl, user,password);
					Statement myStmt = myConn.createStatement();
					ResultSet myRs = myStmt.executeQuery("select Course_Name, Tutor from course where Course_ID = '2'");

					while(myRs.next()) {
					lblCourse2.setText(myRs.getString("Course_Name") + " "+ myRs.getString("Tutor"));
					
					}
				

				} catch (Exception e) {
					e.printStackTrace();
				
				}}});
		btnViewCourse1.setBounds(279, 154, 117, 23);
		contentPane.add(btnViewCourse1);
		
		JButton btnViewCourse2 = new JButton("View Course");
		btnViewCourse2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					String dbUrl = "jdbc:mysql://localhost:3306/student_login";
					String user = "root";
					String password = "";
					Connection myConn = DriverManager.getConnection(dbUrl, user,password);
					Statement myStmt = myConn.createStatement();
					ResultSet myRs = myStmt.executeQuery("select Course_Name, Tutor from course where Course_ID = '3'");

					while(myRs.next()) {
					lblCourse3.setText(myRs.getString("Course_Name") + " "+ myRs.getString("Tutor"));
					
					}
				

				} catch (Exception e) {
					e.printStackTrace();
				
				}}});
		btnViewCourse2.setBounds(279, 188, 117, 23);
		contentPane.add(btnViewCourse2);
		
		JButton btnViewCourse3 = new JButton("View Course");
		btnViewCourse3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					String dbUrl = "jdbc:mysql://localhost:3306/student_login";
					String user = "root";
					String password = "";
					Connection myConn = DriverManager.getConnection(dbUrl, user,password);
					Statement myStmt = myConn.createStatement();
					ResultSet myRs = myStmt.executeQuery("select Course_Name, Tutor from course where Course_ID = '5'");

					while(myRs.next()) {
					lblCourse4.setText(myRs.getString("Course_Name") + " "+ myRs.getString("Tutor"));
					
					}
				

				} catch (Exception e) {
					e.printStackTrace();
				
				}}});
		btnViewCourse3.setBounds(279, 222, 117, 23);
		contentPane.add(btnViewCourse3);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Login window = new Login();
				window.frmLogin.setVisible(true);
				dispose();
				
			}});
		btnLogout.setBounds(162, 271, 102, 23);
		contentPane.add(btnLogout);
		
	}
}
