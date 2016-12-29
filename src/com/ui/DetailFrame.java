package com.ui;

import javax.swing.JFrame;

public class DetailFrame extends JFrame{
    

	public DetailFrame(){
    	this.setBounds(800, 200, 600, 300);
    	this.setTitle("µÁ”∞œÍ«È");
    	this.setVisible(true);
    	DetailPanel depanel=new DetailPanel();
    	this.getContentPane().add(depanel);
    }

}
