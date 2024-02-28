package com.raj.library_managment.gui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.raj.library_managment.App;
import com.raj.library_managment.Login;

public class home extends JFrame {
	
	
	public static void main(String[] args) {
		home_page();
	}
	
	public static void home_page()
	{
		Login l  = new Login();
		JFrame frame = new JFrame("Home");
		JPanel pan = new JPanel();
		JLabel lable = new JLabel("User Name: ");
		JLabel lable2 = new JLabel("Password:  ");
		JTextField tf1 = new JTextField(20);
		tf1.setFont(new Font("Arial",Font.BOLD,16));
		
		
		JPasswordField pf = new JPasswordField(20);
		pf.setFont(new Font("Arial",Font.BOLD,16));
		
		JButton submit = new JButton("Submit");
		submit.addActionListener((e)->{
			char[]  p = pf.getPassword();
		String 	password = new String(p);
		String user_id = tf1.getText();
		l.login(user_id, password);
		
		
		});
	frame.setSize(400,300);
	frame.setResizable(false);
		frame.setLayout(new FlowLayout(20,20,20));
		frame.add(lable);
		frame.add(tf1);
		frame.add(lable2);
		frame.add(pf);
		frame.add(submit);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	

}
