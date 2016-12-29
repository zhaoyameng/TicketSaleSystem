package com.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.about.Listerner.MovieDetail;
import com.about.Listerner.ReceiveCount;
import com.about.Listerner.ReceiveMovie;
import com.about.Listerner.ReceiveSeat;
import com.about.Listerner.ReceiveTime;
import com.about.Movie.FianlMessage;
import com.login.Login;
import com.login.Sign_out;

public class MainGUI extends JFrame {
	JPanel panel_1,panel_2,panel_3;
	static JMenuItem sign_in;
	static JMenu usermenu;
	JMenuItem aboutMessage;

	public MainGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("电影售票系统");
		this.setBounds(700, 200, 600, 600);
		this.setLayout(new GridLayout(3,1));
		addmenubar();
        addpanel();
        addlabel();
	    addAboutMovieList();
		addbutton();
	}

	private void addlabel() {
		JLabel label_1=new JLabel("请选择电影:");
		label_1.setBounds(0, 0, 100, 30);
		panel_1.add(label_1);
		
		JLabel label_2=new JLabel("请选择票数:");
		label_2.setBounds(0, 40, 100, 30);
		panel_1.add(label_2);
		
		JLabel label1=new JLabel("请选择时间段:");
		label1.setBounds(0, 80, 100, 30);
		panel_1.add(label1);
		
		JLabel label_4=new JLabel("请选择座位:");
		label_4.setBounds(0, 120, 100, 30);
		panel_1.add(label_4);
	}

	private void addAboutMovieList() {
		String[]  movieList={"","大鱼海棠","非常完美","非常完美2"};
		JComboBox movieCombBox=new JComboBox(movieList);
		movieCombBox.setBounds(100, 0, 100, 30);
		panel_1.add(movieCombBox);
		movieCombBox.addItemListener(new ReceiveMovie(movieCombBox));
		
		                  
		String[]  countList={"","1","2","3"};
		JComboBox countCombBox=new JComboBox(countList);
		countCombBox.setBounds(100, 40, 100, 30);
		panel_1.add(countCombBox);
		countCombBox.addItemListener(new ReceiveCount(countCombBox));
		
		String[]  timeList={"","09:00","12:00","15:00","20:00","22:00"};
		JComboBox timeCombBox=new JComboBox(timeList);
		timeCombBox.setBounds(100, 80, 100, 30);
		panel_1.add(timeCombBox);
		timeCombBox.addItemListener(new ReceiveTime(timeCombBox));

	}
	
	private void addpanel() {
		panel_1=new JPanel();
		panel_1.setLayout(null);
		this.getContentPane().add(panel_1);
		
		panel_2=new JPanel();
		GridLayout gridlayout=new GridLayout(5,5);
		panel_2.setLayout(gridlayout);
		panel_2.setBackground(Color.PINK);
		this.getContentPane().add(panel_2);
		
		panel_3=new JPanel();
		this.getContentPane().add(panel_3);
	}

	
	private void addbutton() {
		Button more=new Button("查看详情");
		more.setBounds(220, 0, 80, 30);
		more.addMouseListener(new MovieDetail(more));
		panel_1.add(more);
		String[]seat={"1-1","1-2","1-3","1-4","1-5","2-1","2-2",
				"2-3","2-4","2-5","3-1","3-2","3-3","3-4","3-5","4-1","4-2","4-3","4-4","4-5","5-1","5-2",
				"5-3","5-4","5-5"};
		Button seatbutton;
		for(int i=0;i<seat.length;i++){
			seatbutton=new Button(seat[i]);
			seatbutton.addActionListener( new ReceiveSeat(seatbutton));
			panel_2.add(seatbutton);
		}
		
		Button ok=new Button("确认");
		ok.setBounds(100, 100, 100, 100);
		ok.addMouseListener(new FianlMessage());
		panel_3.add(ok);
		
	}

	private void addmenubar() {
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		usermenu = new JMenu("user");
		JMenu helpmenu = new JMenu("help");
		menubar.add(usermenu);
		menubar.add(helpmenu);
		sign_in = new JMenuItem("Sign in");
		aboutMessage = new JMenuItem("About us");
		usermenu.add(sign_in);
		helpmenu.add(aboutMessage);
		sign_in.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				Thread thread1 = new Thread(login);
				thread1.start();
			}
		});
		aboutMessage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				About about = new About();
			}
		});
	}
	public static void setLoginStatus(int loginStatus) {
		if(loginStatus==1){
			sign_in.setVisible(false);
			JMenuItem sign_out=new JMenuItem("Sign out");
			usermenu.add(sign_out);
			sign_out.addActionListener(new Sign_out(sign_out,sign_in,usermenu,loginStatus));
		}
	}

	public static void main(String[] args) {
		MainGUI gui = new MainGUI();

		gui.setVisible(true);
	}

	
}
