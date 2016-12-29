package com.about.Listerner;

import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.ui.DetailFrame;

public class MovieDetail extends MouseAdapter {
	
	
	private Button more;

	public MovieDetail(Button more) {
		// TODO Auto-generated constructor stub
		this.more=more;
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		DetailFrame defrm=new DetailFrame();

	}


}
