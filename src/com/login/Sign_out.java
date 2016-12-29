package com.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.about.Movie.ReceiveMessage;


public class Sign_out implements ActionListener {

	
	private JMenuItem sign_out;
	private JMenuItem sign_in;
    private JMenu usermenu;
	private int loginStatus;
	
	public Sign_out(JMenuItem sign_out, JMenuItem sign_in, JMenu usermenu,int loginStatus) {
		this.sign_out=sign_out;
		this.sign_in=sign_in;
		this.usermenu=usermenu;
		this.loginStatus=loginStatus;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "ÍË³ö³É¹¦");
		sign_out.setVisible(false);
		sign_in.setVisible(true);
		loginStatus=0;
		ReceiveMessage.setLoginStatus(loginStatus);

	}

}
