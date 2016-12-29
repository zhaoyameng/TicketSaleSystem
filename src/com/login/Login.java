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
		this.setTitle("用户登录");
		this.setSize(400, 300);
		loginWindow();
		this.setVisible(true);

	}

	public void loginWindow() {
		JLabel nameLabel = new JLabel("请输入用户姓名：");
		JLabel passwordLabel = new JLabel("请输入登陆密码：");
		final JTextField usernameTextField = new JTextField(20);
		final JPasswordField passwordTextField = new JPasswordField(20);
		JButton registerButton = new JButton("注册");
		JButton loginButton = new JButton("登录");
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
						JOptionPane.showMessageDialog(null, "注册成功");
						usernameTextField.setText("");
						passwordTextField.setText("");
					} else
						JOptionPane.showMessageDialog(null, "该用户已注册，请登录");
				}
				else
					JOptionPane.showMessageDialog(null, "注册的用户名或密码不能为空");
			}
		});
		loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				username=usernameTextField.getText();
				password=passwordTextField.getText();
				
				if (username.trim().length()==0||password.trim().length()==0)
					JOptionPane.showMessageDialog(null, "请输入用户名和密码");

				else if (!(user.containsKey(username) && user.contains(password)))
					JOptionPane.showMessageDialog(null, "用户名或密码错误");
				
				else {
					JOptionPane.showMessageDialog(null, "登录成功");
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