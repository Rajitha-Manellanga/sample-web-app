/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package con_db;

/**
 *
 * @author Rajitha
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Wasitha
 */
public class DataBase {
    
    static Connection con;
    
    
    public static Connection createCon() throws Exception{
        
        if(con==null){
              Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sample_app","root","1234");
          
             return  con;
        
        }
        else{
            return con;
        }
    
    }
    
}
