import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gaurav
 */
public class dbConnectivity {
    
    String URL="jdbc:mysql://localhost/Assignment";
    String USERNAME="root";
    String PASSWORD="gaurav";
    
    Connection c;
    Statement s;
    ResultSet r; 
    
    public final void getRecord(String query)  //get data from sql table
    {
        try {
            Class.forName("java.sql.Driver");  
            c=DriverManager.getConnection(URL,USERNAME,PASSWORD);  
            s=c.createStatement();
            r =s.executeQuery(query);
        } catch(Exception e)  {
            JOptionPane.showMessageDialog(null, "Connectivity Error..!!!\n"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
