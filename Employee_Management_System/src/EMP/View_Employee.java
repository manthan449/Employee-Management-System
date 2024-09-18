
package EMP;


//import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class View_Employee extends JFrame implements ActionListener {

    JTable table;
    Choice choiceEMP;
    JButton searchbtn, print, update, back;
    View_Employee(){

        getContentPane().setBackground(new Color(255,131,122));
        JLabel search = new JLabel("Search by employee id");
        search.setBounds(20,20,150,20);
        add(search);

        choiceEMP = new Choice();
        choiceEMP.setBounds(180,20,150,20);
        add(choiceEMP);

        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee");
            while (resultSet.next()){
                choiceEMP.add(resultSet.getString("empId"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        table = new JTable();
        
        try{
            conn c= new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee ");           
        ResultSetMetaData rsmd = resultSet.getMetaData();
        
        // get table Model 
       DefaultTableModel model = (DefaultTableModel) table.getModel();
        
     //  add column on JTable 
        int cols=rsmd.getColumnCount();
        String[] colName = new String[cols];
        
        for(int i=0;i<cols;i++)
        	colName[i]= rsmd.getColumnName(i+1);
        model.setColumnIdentifiers(colName);
        
    //    Display data on Jtable 
        String name, fname, dob, salary, address ,phone ,email ,education ,designation ,addhar ,empId;
        while (resultSet.next()) {
        
        name=resultSet.getString(1);
        fname=resultSet.getString(2);
        dob=resultSet.getString(3);
        salary=resultSet.getString(4);
        address=resultSet.getString(5);
        phone=resultSet.getString(6);
        email=resultSet.getString(7);
        education=resultSet.getString(8); 
        designation=resultSet.getString(9); 
        addhar=resultSet.getString(10); 
        empId=resultSet.getString(11); 
        String[] row = {name, fname, dob, salary, address ,phone ,email ,education ,designation ,addhar ,empId };
       
       model.addRow(row);
       
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        JScrollPane jp = new JScrollPane(table);
        jp.setBounds(0,100,900,600);
        add(jp);

        searchbtn = new JButton("Search");
        searchbtn.setBounds(20,70,80,20);
        searchbtn.addActionListener(this);
        add(searchbtn);

        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);


                 setSize(900,700);
                 setLayout(null);
                 setLocation(300,100);
                 setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchbtn){
            
            try{
                conn c= new conn();
                ResultSet resultSet2 = c.statement.executeQuery("select * from employee where empId = '"+choiceEMP.getSelectedItem()+"'");           
                ResultSetMetaData rsmd2 = resultSet2.getMetaData();
            
            // get table Model 
           DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
         //  add column on JTable 
            int cols=rsmd2.getColumnCount();
            String[] colName = new String[cols];
            
            for(int i=0;i<cols;i++)
            	colName[i]= rsmd2.getColumnName(i+1);
            model.setColumnIdentifiers(colName);
            
        //    Display data on Jtable 
            String name, fname, dob, salary, address ,phone ,email ,education ,designation ,addhar ,empId;
            while (resultSet2.next()) {
            
            name=resultSet2.getString(1);
            fname=resultSet2.getString(2);
            dob=resultSet2.getString(3);
            salary=resultSet2.getString(4);
            address=resultSet2.getString(5);
            phone=resultSet2.getString(6);
            email=resultSet2.getString(7);
            education=resultSet2.getString(8); 
            designation=resultSet2.getString(9); 
            addhar=resultSet2.getString(10); 
            empId=resultSet2.getString(11); 
            String[] row = {name, fname, dob, salary, address ,phone ,email ,education ,designation ,addhar ,empId };
           
           model.addRow(row);
           
            }
            }
            catch (Exception E){
                E.printStackTrace();
            }
            
            
        } else if (e.getSource() == print) {
            try {
                table.print();
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource() == update){
            setVisible(false);
            new UpdateEmployee(choiceEMP.getSelectedItem());
        } else {
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args) {
        new View_Employee();
    }
}
