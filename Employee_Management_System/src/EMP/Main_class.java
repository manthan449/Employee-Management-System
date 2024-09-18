package EMP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame  {
	
    Main_class(){

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel img = new JLabel(i3);
//        img.setBounds(0,0,1120,630);
//        add(img);
    	
    	Icon imgIcon = new ImageIcon(this.getClass().getResource("home.jpg"));
		JLabel label = new JLabel(imgIcon);
		label.setBounds(0, 0, 1170, 650); // You can use your own values
	
		add(label);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        label.add(heading);
        
        
        JButton lout = new JButton("Logout");
        lout.setBounds(750,80,150,40);
        lout.setForeground(Color.WHITE);
        lout.setBackground(Color.black);
        lout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            	 if(e.getSource()==lout) {
//               		System.exit(90);
//            	 } 
            	new Login();
                setVisible(false);
            	}
        });
        label.add(lout);
         
        
        
        
        
  
        

        JButton add = new JButton("Add Employee");
        add.setBounds(335,270,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        label.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(565,270,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        label.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(440,370,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.black);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        label.add(rem);

        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Main_class();
    }
	
}

	
