package com.about.Listerner;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.about.Movie.ReceiveMessage;


public class ReceiveSeat implements ActionListener {

	private Button seatbutton;

	public ReceiveSeat(Button seatbutton) {
		this.seatbutton=seatbutton;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String seat=e.getActionCommand();
		String[]seatList={"1-1","1-2","1-3","1-4","1-5","2-1","2-2",
				"2-3","2-4","2-5","3-1","3-2","3-3","3-4","3-5","4-1","4-2","4-3","4-4","4-5","5-1","5-2",
				"5-3","5-4","5-5"};
		for(String i:seatList){
			if(seat.equals(i))
				ReceiveMessage.setseat(seat);
		}

	}

}
