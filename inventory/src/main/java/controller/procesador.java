package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "procesaInfo" , urlPatterns = {"/procesaInfo"})
public class procesador extends HttpServlet {
 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");       
        try (PrintWriter out = response.getWriter()) {
                    
            String upn=request.getParameter("upn");
            String did=request.getParameter("did");
            String sku=request.getParameter("sku");
            String companyname=request.getParameter("companyname");
            String ticket=request.getParameter("ticket");
            
            request.setAttribute();
           
                model.invLog a=new model.invLog(upn,did,sku,companyname,ticket);
                a.area();
                a.perimetro();
                                
                int area=a.getArea();
                int perimetro=a.getPerimetro();
                

                request.setAttribute("resultArea",a);
                request.getRequestDispatcher("/resultados.jsp").forward(request,response);
                
                
                    
                }
                
            }
    
            @Override
                protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                        processRequest (request, response);
            }
                
            @Override
                protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                        processRequest (request, response);
            }
                
            @Override
                public String getServletInfo() {
                        return "Short Description";
            }
    
    
}