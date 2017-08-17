import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

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
		
		JButton btnViewCourse = new JButton("View Course");
		btnViewCourse.setBounds(279, 120, 117, 23);
		contentPane.add(btnViewCourse);
		
		JButton btnViewCourse1 = new JButton("View Course");
		btnViewCourse1.setBounds(279, 154, 117, 23);
		contentPane.add(btnViewCourse1);
		
		JButton btnViewCourse2 = new JButton("View Course");
		btnViewCourse2.setBounds(279, 188, 117, 23);
		contentPane.add(btnViewCourse2);
		
		JButton btnViewCourse3 = new JButton("View Course");
		btnViewCourse3.setBounds(279, 222, 117, 23);
		contentPane.add(btnViewCourse3);
		
		JLabel lblCourse1 = new JLabel("New label");
		lblCourse1.setBounds(45, 120, 165, 23);
		contentPane.add(lblCourse1);
		
		JLabel lblCourse2 = new JLabel("New label");
		lblCourse2.setBounds(45, 154, 165, 23);
		contentPane.add(lblCourse2);
		
		JLabel lblCourse3 = new JLabel("New label");
		lblCourse3.setBounds(45, 188, 165, 23);
		contentPane.add(lblCourse3);
		
		JLabel lblCourse4 = new JLabel("New label");
		lblCourse4.setBounds(45, 222, 165, 23);
		contentPane.add(lblCourse4);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(162, 271, 102, 23);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setBounds(45, 23, 95, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(45, 57, 95, 23);
		contentPane.add(lblStudentId);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(162, 27, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(162, 61, 46, 14);
		contentPane.add(label);
	}
}
