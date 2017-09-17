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
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stuti
 */
@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {
@EJB
private UserRegisterFacadeLocal registerFacade;


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
        String strUserName;
        String strPassword;
        String strFirstName;
        String strLastName;
        String strAddr;
        String strEmail;
        String strCity;
        String strState;
        String strPin;
        String strCountry;
        String strPhn;
        String strCCard = null;
        String operation;
        String errmsg = " ";

        int    intZipCode = 0;
        int    intValue2 = 0;
        int    result;        
        
        Boolean validData = true;
        strUserName = request.getParameter("username");
        strPassword = request.getParameter("password");
        strEmail = request.getParameter("email");
        strFirstName    = request.getParameter("fname");
        strLastName     = request.getParameter("lname");
        strAddr        = request.getParameter("address");
        strPhn        = request.getParameter("phone");
        strCity         = request.getParameter("city");
        strState        = request.getParameter("state");
        strPin      = request.getParameter("pin");
        strCountry      = request.getParameter("country");
        
        UserRegister registry = new UserRegister();
        
        /*try  
        {  
          intZipCode = Integer.parseInt(strPin);  
        }  
        catch(NumberFormatException nfe)  
        {  
          errmsg = "Zip Code "
                  + "not numeric \n";  
          validData = false;
        }  */

        
        if (validData) {
           
            registry.setFname(strFirstName);
            registry.setLname(strLastName);
            registry.setAddress(strAddr);
            registry.setPhno(strPhn);
            registry.setCity(strCity);
            registry.setState(strState);
            registry.setPin(strPin);
            registry.setCountry(strCountry);
            registry.setUname(strUserName);
            registry.setPwd(strPassword);
            registry.setEmail(strEmail);
            registry.setCcardno(strCCard);
           registerFacade.create(registry);
             
            request.setAttribute("fname", strFirstName);
            request.setAttribute("lname",  strLastName);
            request.setAttribute("username", strUserName);
            request.setAttribute("email",     strEmail);
            

            getServletContext()
                .getRequestDispatcher("/RegistrationConfirmation.jsp")
                .forward(request, response);
        }
        else {
        request.setAttribute("errmsg", errmsg);
        getServletContext()
                .getRequestDispatcher("/index.html")
                .forward(request, response);
            
        }
        
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
