/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {
    public Statement stmt;
    public ResultSet rs;
    public Connection conn;
    public DatabaseConnection(){
        
    }
          @SuppressWarnings("CallToThreadDumpStack")
          public Connection setConnection(){
              try{
                  Class.forName("com.mysql.jdbc.Driver");
                  conn=DriverManager.getConnection("jdbc:mysql://localhost/webauction","root","stuti1807");
              }catch(Exception e){
                  e.printStackTrace();
              }
              return conn;
          }
          public ResultSet getResult(String query, Connection conn){
              this.conn=conn;
              try{
                  stmt=conn.createStatement();
                  rs=stmt.executeQuery(query);
              }catch(Exception e){
                  
              }
              return rs;
          }
    
}
