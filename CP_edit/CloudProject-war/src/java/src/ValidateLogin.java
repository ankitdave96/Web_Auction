package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.DatabaseConnection;


public class ValidateLogin extends HttpServlet {

    Connection conn;
    ResultSet rs;
    String username,fname,lname,phone,address,city,state,country,pin,emailid,password,creditcard,query;
    DatabaseConnection dbconn;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            username = request.getParameter("username");
            password=request.getParameter("password");
            query="select * from user_register where uname = "+username+" and pwd = "+password;
            dbconn=new DatabaseConnection();
            conn=dbconn.setConnection();
            rs=dbconn.getResult(query,conn);
            while(rs != null){
               RequestDispatcher rd=request.getRequestDispatcher("/test.jsp");
               rd.forward(request, response);
                
System.out.println(rs.getString("username"));
            }
        }
        catch(Exception e){
            
        }
        finally{
            out.close();
        }
    }

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
