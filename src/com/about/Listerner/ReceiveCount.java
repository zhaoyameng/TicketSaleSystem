package com.about.Listerner;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import com.about.Movie.ReceiveMessage;


public class ReceiveCount implements ItemListener {

	private JComboBox countCombBox;

	public ReceiveCount(JComboBox countCombBox) {
		this.countCombBox=countCombBox;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==countCombBox){
			if(e.getStateChange()==ItemEvent.SELECTED){
				String count=(String)countCombBox.getSelectedItem();
				ReceiveMessage.setCount(count);
			}
		}

	}

}
