package com.ui;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class About extends JFrame {

	public About() {
		this.setBounds(750, 300, 400, 300);
		this.setTitle("About us");
		this.setVisible(true);
		AboutPanel aboutPanel=new AboutPanel();
		this.add(aboutPanel);
		
	}
}
