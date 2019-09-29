package login;

import javax.swing.*;

public class login extends javax.swing.JFrame {
	
	JTextField username = new JTextField(20);
	JPasswordField password = new JPasswordField(20);
	
	JButton login = new JButton("Login");
	
	public login(){
		
		super("Login screen");
		setSize(300, 210);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel pane = new JPanel();
		JLabel usernamel = new JLabel("Username");
		JLabel passwordl = new JLabel("Password");
		
		pane.add(username);
		pane.add(usernamel);
		pane.add(password);
		pane.add(passwordl);
		pane.add(login);
		add(pane);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		login screen = new login();
		
	}
	
	
}
