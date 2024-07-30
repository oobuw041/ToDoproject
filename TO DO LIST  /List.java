package classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{

	public List() {
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		//this.setBackground(Color.blue);
			
		
	}
	public void updateNumbers() {
		Component[] listItems = this.getComponents();//array of all the components on the Todo list
		
		for(int i = 0; i < listItems.length; i++) {// loop through and add the corresponding number
			if(listItems[i] instanceof Task) {
				
				((Task)listItems[i]).changeIndex(i+1);
			}
		}
		
	}

}
