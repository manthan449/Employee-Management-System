package EMP;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
	private Connection connnection;
	
	// Login page field and button 
	JTextField tusername;
	JPasswordField tpassward;	
	JButton Login,Back;			
	
	 /* Only admin can use this login page 
	  * Registration not required 
	  */
   Login(){
	   
	   // logic for user and password text field //
	   
	JLabel username =new JLabel("username") ;
	username.setBounds(40, 20, 100, 30);
	add(username);
	
	tusername=new JTextField();
	tusername.setBounds(150, 20, 150, 30);
	add(tusername);
	
	JLabel passward=new JLabel("Passward") ;
	passward.setBounds(40, 70, 100, 30);
	add(passward);
	
	tpassward=new JPasswordField();
	tpassward.setBounds(150, 70, 150, 30);
	add(tpassward);
	
	
	// Added logic for Login button 
	
	Login =new JButton("LOGIN");
	Login.setBounds(150, 140, 140, 30);
	Login.setBackground(Color.black);
	Login.setForeground(Color.white);
	Login.addActionListener(this);
	add(Login);
	// Button code for mouse action 
			Login.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	Login.setBackground(Color.LIGHT_GRAY);
			        setCursor(
			                new Cursor(Cursor.HAND_CURSOR));
			    }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			     //   add.setBackground(UIManager.getColor("control"));
			    	Login.setBackground(Color.BLACK);	
					 setCursor(
				                new Cursor(Cursor.DEFAULT_CURSOR));
			    }
			});


	 // Added logic for Back button 
	Back =new JButton("BACK");
	Back.setBounds(150, 180, 140, 30);
	Back.setBackground(Color.black);
	Back.setForeground(Color.white);
	Back.addActionListener(this);
	add(Back);
	
	// Button code for mouse action 
				Back.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				    	Back.setBackground(Color.LIGHT_GRAY);
				        setCursor(
				                new Cursor(Cursor.HAND_CURSOR));
				    }
				    public void mouseExited(java.awt.event.MouseEvent evt) {
				     //   add.setBackground(UIManager.getColor("control"));
				    	Back.setBackground(Color.BLACK);	
						 setCursor(
					                new Cursor(Cursor.DEFAULT_CURSOR));
				    }
				});
	
/*---------------------------------------------
 * code for login background image 
 *---------------------------------------------*/
	
	Icon imgIcon2 = new ImageIcon(this.getClass().getResource("images.png"));
	JLabel label2 = new JLabel(imgIcon2);
	label2.setBounds(150, 0, 600, 250); // You can use your own values
	add(label2);

/*-------------------------------------------*/
	   
	// Login box location 
	
	  setSize(600, 300);
	  setLocation(450, 200);
	  setLayout(null);
	  setVisible(true);
	    
   }
   @Override
   public void actionPerformed(ActionEvent e) {
   	// TODO Auto-generated method stub
	   
	   // code to validate user and password 
   	if(e.getSource() ==Login) {
   		try {
   			String username=tusername.getText();
   			String passward=tpassward.getText();
   			
   			
   			conn conn=new conn();
   			if (username != null && passward != null) {
   			String query ="select * from login where username ='"+ username +"'and passward ='"+ passward +"'";   		      		 
   			ResultSet resultSet= conn.statement.executeQuery(query);
   			
   			if(resultSet.next()) {
   				setVisible(false);
   				
   				// new page after validating user and password 
   				new Main_class();
   				
   			}else {
   				
   				// raised error message for invalid user and password 
   				JOptionPane.showMessageDialog(null, "Invalid username or passward");
   			}
   			
   			}
   		}catch (Exception E){
   			E.printStackTrace();
   			
   		}
   		
   	}
   	
   	// code for back button 
   	else if(e.getSource()==Back) {
   		System.exit(90);
   	}
   }
   
   public static void main(String[] args) {
	new Login();
}

}

