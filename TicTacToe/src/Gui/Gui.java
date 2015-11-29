package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton[] markSwitches = new JButton[9];
	public static void createFrame(){
		for(int i = 0; i < 9; i++){
			markSwitches[i] = new JButton(" ");
			markSwitches[i].addActionListener(new markChangeActionListener());
		}
	}
}
