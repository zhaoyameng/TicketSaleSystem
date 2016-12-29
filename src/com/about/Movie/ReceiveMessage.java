package com.about.Movie;

import java.awt.Graphics;
import java.util.Hashtable;

import javax.swing.JPanel;


public class ReceiveMessage extends JPanel{

	private static int LoginStatus;
	private static String Seat;
	private static String Movie;
	private static String Count;
	private static String Time;
	private static Hashtable<String, Integer>moviemoney=new Hashtable<String, Integer>();
	private static Hashtable<String, Integer>count=new Hashtable<String, Integer>();
	
    
	public static void setLoginStatus(int loginStatus) {
		LoginStatus=loginStatus;
		
	}
	public static void setMovie(String movie) {
		Movie = movie;
		
	}

	public static void setCount(String count) {
		Count=count;
		
	}
	
	public static void setTime(String time) {
		Time=time;
		
	}
	
	public static void setseat(String seat) {
		Seat=seat;
		
	}
	public static void calculateMoney(){
		
		moviemoney.put("���㺣��", 20);
		moviemoney.put("�ǳ�����", 30);
		moviemoney.put("�ǳ�����2", 60);
		
		count.put("1", 1);
		count.put("2", 2);
		count.put("3", 3);
		
	}
	 public void paint(Graphics g){
		  super.paint(g);
		  if(LoginStatus==1){
		  if(Movie!=null)
			     g.drawString("��ѡ��ĵ�ӰΪ��"+Movie, 10, 10);
			  else
				  g.drawString("����ѡ���Ӱ", 10, 10);
		  if(Count!=null)
			     g.drawString("��ѡ��ĵ�ӰƱ��Ϊ��"+Count, 10, 30);
			  else
				  g.drawString("����ѡ���ӰƱ��", 10, 30);
		  if(Time!=null)
			     g.drawString("��ѡ���ʱ���Ϊ��"+Time, 10, 50);
			  else
				  g.drawString("����ѡ��ʱ���", 10, 50);
		  if(Seat!=null)
		     g.drawString("��ѡ�����λΪ��"+Seat, 10, 70);
		  else
			  g.drawString("����ѡ����λ", 10, 70);
		  if(Movie!=null&&Count!=null&&Time!=null&&Seat!=null){
			  calculateMoney(); 
			  g.drawString("����֧����Ʊ��Ϊ��"+moviemoney.get(Movie)*count.get(Count), 10, 90);
		  }
		 
	  }
		  else
			  g.drawString("���ȵ�¼", 10, 10);
	 }

	

	

	
}
