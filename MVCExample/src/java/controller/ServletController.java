/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Rectangle;

@WebServlet(name="ServletController", urlPatterns = {"/ServletController"})


/**.
 *
 * @author FamiliaLezcano
 */
public class ServletController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        
        
        Rectangle rec= new Rectangle(3,5);
        request.setAttribute("message", "greetings from the servlet");
        
        HttpSession session= request.getSession();
        session.setAttribute("rectangle", rec);
        
        RequestDispatcher rd=request.getRequestDispatcher("view/showVariables.jsp");
        
        rd.forward(request, response);
        
        
                
                }
    
}
