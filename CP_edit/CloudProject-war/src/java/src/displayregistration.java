/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entitybeans.UserRegister;
import sessionbeans.UserRegisterFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stuti
 */
public class displayregistration extends HttpServlet {
    @EJB
    private UserRegisterFacadeLocal userregisterFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<UserRegister> registryList;
        registryList = userregisterFacade.findAll();
        UserRegister registrant;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayRegistryServlet</title>");            
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">");                        
            out.println("</head>");
            out.println("<body>");
            
            //Print a simple header message to identify what page is showing
            out.println("<header>");            
            out.println("<h1>Registration Database Table</h1>");
            out.println("</header>");                        

            out.println("<div class=\"showDBWrapper\">");            
            //print out the database in a table to make it look nice.
            out.println("<table>");            
    
            //;Print out the registry List
            for(int i = 0 ; i < registryList.size() ; i++){
                registrant = registryList.get(i);
                //Print even number rows one color and Odd rows a different color   
                
                out.println("<tr>");    
                out.println("<td class=\"cellEven\">" + registrant.getFname()  + "</td>");            
                out.println("<td class=\"cellEven\">" + registrant.getLname()  + "</td>");
                out.println("<td class=\"cellEven\">" + registrant.getAddress()  + "</td>");
                out.println("<td class=\"cellEven\">" + registrant.getPhno()  + "</td>");
                out.println("<td class=\"cellEven\">" + registrant.getEmail()  + "</td>");
                out.println("<td class=\"cellEven\">" + registrant.getCity()  + "</td>");
                out.println("<td class=\"cellEven\">" + registrant.getState()  + "</td>");
                out.println("<td class=\"cellEven\">" + registrant.getPin()  + "</td>");
                out.println("<td class=\"cellEven\">" + registrant.getCountry()  + "</td>");
                               
                out.println("</tr>");
                
            }
            out.println("<table>");  //close table          
            out.println("</div>");                        

            //print a simple footer
                                   
            
            
            out.println("</body>");
            out.println("</html>");
        
        
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
    