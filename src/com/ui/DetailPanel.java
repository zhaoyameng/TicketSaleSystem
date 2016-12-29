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
		  if(aboutmovie.equals("大鱼海棠"))
		    g.drawString("大鱼海棠:大鱼海棠描述了一个居住在“神之围楼”里的女孩名叫椿，十六岁生日那天她到人间参与成人礼的巡游，意外结识了人类男孩鲲，为了还清欠下他的，椿回到“其他人”的世界后，拿自己所有换了一个愿望，并和青梅竹马的伙伴湫在他们的世界展开了一场冒险" , 0, 20);
		  if(aboutmovie.equals("非常完美"))
			  g.drawString("非常完美：漫画家苏菲原本是一个无忧无虑，满脑子充满各式幻想情节的女孩。他和已经相恋两年的男友，高大英俊的外科医生李杰夫，一直是众人称羡的完美情侣。在一次无预警的公开场合中，杰夫向苏菲求婚了，即将迈入婚姻殿堂的苏菲俨然就是世界上最幸福的人。", 0, 20);
		  if(aboutmovie.equals("非常完美2"))
			  g.drawString("非常完美2：在延续了第一部的基础上，第二部描写了再一次普通的手术中，杰夫认识了著名影星王菁菁，并并与她迅速坠入爱河，无情的背叛了与苏菲的婚约，苏菲应该何去何从呢。。。", 0, 20);
		  }catch(NullPointerException e){
			  g.drawString("请先选择电影", 0, 20);
		  }
	  }
}
