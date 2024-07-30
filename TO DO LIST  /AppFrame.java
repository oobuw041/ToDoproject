package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame{
	
	// the app is going to contain all of this
	private TitleBar title;
	private List list; //for the things to do
	private ButtonPanel btnPanel;
	
	private JButton addTask;
	private JButton clear;

	public AppFrame() {
	this.setSize(400,700);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	this.setBackground(Color.black);
	
	title = new TitleBar();
	list = new List();
	btnPanel = new ButtonPanel();
	this.add(title,BorderLayout.NORTH); //frames are BorderLayout by default and this adds the title bar to the frame
	this.add(btnPanel,BorderLayout.SOUTH);
	
	this.add(list,BorderLayout.CENTER); //add it to the JFrame
	
	addTask = btnPanel.getAddTask();
	clear = btnPanel.getClearTask();
	
	addListeners();
	
	
	}
	
	public void addListeners() {//when we click on buttons they are going to do things
	 addTask.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			Task task = new Task();
			list.add(task);
			list.updateNumbers();
			
			task.getDone().addMouseListener(new MouseAdapter(){
				@Override
				public void mousePressed(MouseEvent e) {
					task.changeState();
					revalidate();
					
				}
				
				
				
					});
			revalidate();
		}
	 });
	}

}
