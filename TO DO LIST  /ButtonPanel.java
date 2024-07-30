package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {
	
	private JButton addTask; // instance variables
	private JButton clear;

	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	
	public ButtonPanel() {
		this.setPreferredSize(new Dimension(400,60));
		
		
		 addTask = new JButton("Add Task"); //Initialize the variable
		 addTask.setBorder(emptyBorder);
		 addTask.setFont(new Font("serif",Font.PLAIN, 20));
		
		 this.add(addTask);
		 this.add(Box.createHorizontalStrut(20));//adds space between buttons
	
		
		 clear = new JButton("Clear completed Task "); //Initialize the variable
		 clear.setBorder(emptyBorder);
		 clear.setFont(new Font("serif",Font.PLAIN, 20));

		 this.add(clear);
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	
	public JButton getClearTask() {
		return clear;
	}


}
