package com.ui;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DetailPanel extends JPanel{
	private static String aboutmovie;
	public static void setmovie(String movie) {
		aboutmovie=movie;
		
	}
	public void paint(Graphics g){
		  super.paint(g);
		  try{
		  if(aboutmovie.equals("���㺣��"))
		    g.drawString("���㺣��:���㺣��������һ����ס�ڡ���֮Χ¥�����Ů�����д���ʮ�����������������˼����������Ѳ�Σ������ʶ�������к��Ϊ�˻���Ƿ�����ģ����ص��������ˡ�����������Լ����л���һ��Ը����������÷����Ļ���������ǵ�����չ����һ��ð��" , 0, 20);
		  if(aboutmovie.equals("�ǳ�����"))
			  g.drawString("�ǳ��������������շ�ԭ����һ���������ǣ������ӳ�����ʽ������ڵ�Ů���������Ѿ�������������ѣ��ߴ�Ӣ�������ҽ����ܷ�һֱ�����˳��۵��������¡���һ����Ԥ���Ĺ��������У��ܷ����շ�����ˣ���������������õ��շ�ٲȻ�������������Ҹ����ˡ�", 0, 20);
		  if(aboutmovie.equals("�ǳ�����2"))
			  g.drawString("�ǳ�����2���������˵�һ���Ļ����ϣ��ڶ�����д����һ����ͨ�������У��ܷ���ʶ������Ӱ����ݼݼ����������Ѹ��׹�밮�ӣ�����ı��������շƵĻ�Լ���շ�Ӧ�ú�ȥ�δ��ء�����", 0, 20);
		  }catch(NullPointerException e){
			  g.drawString("����ѡ���Ӱ", 0, 20);
		  }
	  }
}
