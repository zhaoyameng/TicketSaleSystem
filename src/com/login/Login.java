package com.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.about.Movie.ReceiveMessage;
import com.ui.MainGUI;

public class Login extends JFrame implements Runnable {

	Hashtable<String, String> user = new Hashtable<String, String>();
	private int loginStatus = 0;
	String username;
	String password;
	private static final long serialVersionUID = 1L;

	public Login() {
		this.setLocation(750, 300);
		this.setTitle("�û���¼");
		this.setSize(400, 300);
		loginWindow();
		this.setVisible(true);

	}

	public void loginWindow() {
		JLabel nameLabel = new JLabel("�������û�������");
		JLabel passwordLabel = new JLabel("�������½���룺");
		final JTextField usernameTextField = new JTextField(20);
		final JPasswordField passwordTextField = new JPasswordField(20);
		JButton registerButton = new JButton("ע��");
		JButton loginButton = new JButton("��¼");
		JPanel pm = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.add(nameLabel);
		p1.add(usernameTextField);
		p2.add(passwordLabel);
		p2.add(passwordTextField);
		registerButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				username=usernameTextField.getText();
				password=passwordTextField.getText();
				
				if (username.trim().length()!=0&&password.trim().length()!=0){
					
					if (!(user.containsKey(username))) {

						user.put(username, password);
						JOptionPane.showMessageDialog(null, "ע��ɹ�");
						usernameTextField.setText("");
						passwordTextField.setText("");
					} else
						JOptionPane.showMessageDialog(null, "���û���ע�ᣬ���¼");
				}
				else
					JOptionPane.showMessageDialog(null, "ע����û��������벻��Ϊ��");
			}
		});
		loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				username=usernameTextField.getText();
				password=passwordTextField.getText();
				
				if (username.trim().length()==0||password.trim().length()==0)
					JOptionPane.showMessageDialog(null, "�������û���������");

				else if (!(user.containsKey(username) && user.contains(password)))
					JOptionPane.showMessageDialog(null, "�û������������");
				
				else {
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
					loginStatus = 1;
					ReceiveMessage.setLoginStatus(loginStatus);
					MainGUI.setLoginStatus(loginStatus);
				}

			}
		});
		p3.add(registerButton);
		p3.add(loginButton);
		pm.add(p1);
		pm.add(p2);
		pm.add(p3);
		this.add(pm);

	}

	@Override
	public void run() {

		loginWindow();
	}

}