package EMP;

import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame {
	
	Splash(){
		
		// Main screen animated gif - employee management system 
		Icon imgIcon = new ImageIcon(this.getClass().getResource("front.gif"));
		JLabel label = new JLabel(imgIcon);
		label.setBounds(0, 0, 1170, 650); // You can use your own values
	
		add(label);

		setSize(1170, 650);
		setLocation(200, 50);
		setLayout(null);
		setVisible(true);
		
		try {
			Thread.sleep(5000);
			setVisible(false);
			new Login();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Splash();
		
	}
}
