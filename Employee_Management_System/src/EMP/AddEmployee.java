package EMP;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.regex.Pattern;


public class AddEmployee extends JFrame implements ActionListener{
	Random ran=new Random();
	int number=ran.nextInt(999999);
	
	JTextField tname,tfname,taddress,tphone,taadhar,temail,tsalary,tdesignation;
	JLabel tempid;
	JLabel temid;
	JDateChooser tdob;
	JButton Add,Back;
	JComboBox Boxeducation, Concode;
	

	AddEmployee() {
		
		getContentPane().setBackground(new Color(163,255,188));
		
		JLabel heading =new JLabel("Add Employee Detail");
		
		heading.setBounds(320, 30, 500, 50);
		heading.setFont(new Font("serif",Font.BOLD,25));
		add(heading);
		
		/* ----------------------------------------------*/
	    /* name field tname 
	    /* ----------------------------------------------*/
		JLabel name= new JLabel("First Name*");
		name.setBounds(50, 150, 150, 30);
		name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(name);
		
		tname=new JTextField();
		tname.setBounds(200, 150, 150, 30);
		tname.setBackground(new Color(255,255,255));
		add(tname);
		
		/* ----------------------------------------------*/
	    /* name field tfname
	    /* ----------------------------------------------*/
		JLabel fname= new JLabel("Last's name*");
		fname.setBounds(400, 150, 150, 30);
		fname.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(fname);
		
		tfname=new JTextField();
		tfname.setBounds(600, 150, 150, 30);
		tfname.setBackground(new Color(255,255,255));
		add(tfname);
		
		/* ----------------------------------------------*/
	    /* name field Date of birth
	    /* ----------------------------------------------*/
		JLabel DOB= new JLabel("Date Of Birth");
		DOB.setBounds(50, 200, 150, 30);
		DOB.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(DOB);
		
		tdob=new JDateChooser();
		tdob.setBounds(200, 200, 150, 30);
		tdob.setBackground(new Color(255,255,255));
		add(tdob);
		

		/* ----------------------------------------------*/
	    /* name field tSalary
	    /* ----------------------------------------------*/
		JLabel salary= new JLabel("Salary");
		salary.setBounds(400, 200, 150, 30);
		salary.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(salary);
		
		tsalary=new JTextField();
		tsalary.setBounds(600, 200, 150, 30);
		tsalary.setBackground(new Color(255,255,255));
		add(tsalary);
		
		
		/* ----------------------------------------------*/
	    /* name field taddress
	    /* ----------------------------------------------*/
		JLabel address= new JLabel("Address");
		address.setBounds(50, 250, 150, 30);
		address.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(address);
		
		taddress=new JTextField();
		taddress.setBounds(200, 250, 150, 30);
		taddress.setBackground(new Color(255,255,255));
		add(taddress);
		
		/* ----------------------------------------------*/
	    /* name field tphone
	    /* ----------------------------------------------*/
		JLabel phone= new JLabel("Mobile no*");
		phone.setBounds(400, 250, 150, 30);
		phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(phone);
		
		String items1[]= {"+91"};
		Concode =new JComboBox(items1);
		Concode.setBounds(530, 250, 70, 30);
		Concode.setBackground(new Color(255,255,255));
		add(Concode);
		
		tphone=new JTextField();
		tphone.setBounds(600, 250, 150, 30);
		tphone.setBackground(new Color(255,255,255));
		add(tphone);

		
		/* ----------------------------------------------*/
	    /* name field temail
	    /* ----------------------------------------------*/
		JLabel email= new JLabel("Email");
		email.setBounds(50, 300, 150, 30);
		email.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(email);
		
		temail=new JTextField();
		temail.setBounds(200, 300, 150, 30);
		temail.setBackground(new Color(255,255,255));
		add(temail);
		
		
		/* ----------------------------------------------*/
	    /* name field Boxeducation
	    /* ----------------------------------------------*/
		JLabel education= new JLabel("Education");
		education.setBounds(400, 300, 150, 30);
		education.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(education);
		
		String items[]= {"BBA","B-TECH","BCA","BA","BSC","B-COM","MBA","PHD"};
		Boxeducation=new JComboBox(items);
		Boxeducation.setBackground(new Color(255,255,255));
		Boxeducation.setBounds(600, 300, 150, 30);
		add(Boxeducation);
		
		/* ----------------------------------------------*/
	    /* name field adharcard number
	    /* ----------------------------------------------*/
		JLabel aadhr= new JLabel("Adharcard-No*");
		aadhr.setBounds(400, 350, 150, 30);
		aadhr.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(aadhr);
		
		taadhar=new JTextField();
		taadhar.setBounds(600, 350, 150, 30);
		taadhar.setBackground(new Color(255,255,255));
		add(taadhar);
	//	PlainDocument document =(PlainDocument)
		 taadhar.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = taadhar.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	               taadhar.setEditable(true);
	            } else {
	               taadhar.setEditable(false);
	            }
	         }
	      });

		
		
		/* ----------------------------------------------*/
	    /* name field Employee id
	    /* ----------------------------------------------*/
		JLabel empid= new JLabel("Employee id");
		empid.setBounds(50, 400, 150, 30);
		empid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(empid);
		
		tempid=new JLabel(""+number);
		tempid.setBounds(200, 400, 150, 30);
		tempid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		tempid.setForeground(Color.RED);
		add(tempid);
		
		/* ----------------------------------------------*/
	    /* name field Designation
	    /* ----------------------------------------------*/
		JLabel designation= new JLabel("Designation");
		designation.setBounds(50, 350, 150, 30);
		designation.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(designation);
		
		tdesignation=new JTextField();
		tdesignation.setBounds(200, 350, 150, 30);
		tdesignation.setBackground(new Color(255,255,255));
		add(tdesignation);
						
		
		//button for Add
		Add=new JButton("Add");
		Add.setBounds(450, 550, 150, 40);
		Add.setBackground(Color.BLACK);
		Add.setForeground(Color.WHITE);
		Add.addActionListener(this);
		add(Add);
		
		//button for Back
		Back=new JButton("Back");
		Back.setBounds(250, 550, 150, 40);
		Back.setBackground(Color.BLACK);
		Back.setForeground(Color.WHITE);
		Back.addActionListener(this);
		add(Back);
		
		
		setSize(900, 700);
		setLayout(null);
		setLocation(300, 50);
		setVisible(true);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
		
		boolean check = false;
                  
Pattern pat = Pattern.compile(emailRegex); 

 

//  return pat.matcher(email).matches(); 
		
		if(e.getSource()==Add) {
			String name=tname.getText();
			String fname=tfname.getText();
			String dob=((JTextField)tdob.getDateEditor().getUiComponent()).getText();
			String salary =tsalary.getText();
			String address=taddress.getText();
			String aadhar=taadhar.getText();
			String email= temail.getText();
			
			// concatinate contry code and mobile number field 
			String phone= (String)Concode.getSelectedItem() + tphone.getText();
			
			String education= (String)Boxeducation.getSelectedItem();
			String designation= tdesignation.getText();
			String empid= tempid.getText();
			
			
		
			try {
				conn c=new conn();
				
// 	JTextField tname,tfname,taddress,tphone,taadhar,temail,tsalary,tdesignation;
				
				if(tname.getText().equals("")  || tfname.getText().equals("") 
						|| tphone.getText().equals("") || taadhar.getText().equals("")) {
					
					JOptionPane.showMessageDialog(
					        null, "Please fill Mandatory fields", "Failure", JOptionPane.ERROR_MESSAGE);
					 check = true;
				}
				
				else if( tphone.getText().length() != 10) {
				
						JOptionPane.showMessageDialog(
						        null, "Mobile no cannot be less then or more then 10 digit", "Failure", JOptionPane.ERROR_MESSAGE);
						check = true;
				}
				
				else if  ( email != null && !email.isEmpty() ) { 
						
					if	( !pat.matcher(email).matches() )
				{
					JOptionPane.showMessageDialog(
					        null, "Please enter valid Email", "Failure", JOptionPane.ERROR_MESSAGE);
					check = true;
				}
				}
																
				
				else {
					check = false;
					
				}
				

				
				if (check == false)
				{
					int  a = JOptionPane.showConfirmDialog(null,"Are you sure?");  				  
					  if (a==JOptionPane.YES_OPTION) 
					  {
						String query ="insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empid+"')";
						c.statement.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Details added successfully");
						setVisible(false);
						new Main_class();						
				}
					}
							
				
				
					
				
				
				
				
			}catch(Exception E){
				E.printStackTrace();
			}
			        
		}else {
            setVisible(false);
            new Main_class();
		}
	}
	public static void main(String[] args) {
		new AddEmployee();
	}

}
