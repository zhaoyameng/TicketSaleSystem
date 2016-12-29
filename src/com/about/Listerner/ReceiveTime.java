package com.about.Listerner;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import com.about.Movie.ReceiveMessage;


public class ReceiveTime implements ItemListener {

	private JComboBox timeCombBox;

	public ReceiveTime(JComboBox timeCombBox) {
		this.timeCombBox=timeCombBox;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==timeCombBox){
			if(e.getStateChange()==ItemEvent.SELECTED){
				String time=(String)timeCombBox.getSelectedItem();
				ReceiveMessage.setTime(time);
			}
		}

	}

}
