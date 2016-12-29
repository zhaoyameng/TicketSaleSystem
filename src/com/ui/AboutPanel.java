package com.ui;

import java.awt.Graphics;

import javax.swing.JPanel;


class AboutPanel extends JPanel{

  public void paint(Graphics g){
	  super.paint(g);
	  g.drawString("Java Group", 20, 20);
  }
}
