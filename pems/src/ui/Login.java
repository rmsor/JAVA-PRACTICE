package ui;

import module.Preference;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import module.User;
import db.SqlConnection;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocation(550,200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMsg = new JLabel("");
		lblMsg.setBounds(88, 30, 200, 32);
		contentPane.add(lblMsg);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setBounds(88, 85, 76, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(88, 128, 76, 32);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(174, 91, 131, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SqlConnection sql = new SqlConnection();
					String sqlCond="and user_name='"+textField.getText()+"' and password='"+passwordField.getText()+"'";
					List<User> usr=sql.getUser(sqlCond);
					if(usr.size()>0){
						Preference pf=new Preference();
						pf.putVal("user_id",usr.get(0).getUserId());
						pf.putVal("user_name",usr.get(0).getUserName());
						sql.close();
						dispose();
						Main fm=new Main();
						fm.run();
					}else{
						lblMsg.setForeground(Color.red);
						lblMsg.setText("Invalid Login !! Please Try Again !!");						
					}
				
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(194, 185, 89, 20);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 134, 131, 20);
		contentPane.add(passwordField);
		
		
	}
}