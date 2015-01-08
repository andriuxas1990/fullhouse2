/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen
 */
public class FullhouseDB {
   
    private static Connection databaseConnectie;
         
    
    public static Connection getConnection() {
        if(databaseConnectie == null){
                String connectString = "jdbc:mysql://meru.hhs.nl:3306/14062984";
                try {
                     databaseConnectie = DriverManager.getConnection(connectString, "14062984", " ");
                     System.out.println("Connectie");
                } catch (SQLException ex) {
                    Logger.getLogger(FullhouseDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
        
        return databaseConnectie;
        
    }
    
    public static ResultSet fetchQuery(String query) throws SQLException{
        Connection connectie = getConnection();
        Statement statement = connectie.createStatement();
        statement.execute(query);
        ResultSet resultSet = statement.getResultSet();
        return resultSet;
        }
    }
   
    
    
