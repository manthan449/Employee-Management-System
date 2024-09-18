package EMP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;  
  
//create NewPage class to create a new page on which user will navigate  
public class conn {

    // Variable Declaration 	
    Connection connection;
    Statement statement;
    
    public conn(){
        try{
        	
        	// Database connection 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            /* my sql database name - employemanagement
             * user - root
             * password - manthan1492
             */
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employemanagement","root","manthan1492");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
        

    }

	}






