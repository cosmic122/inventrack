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
public class procesaInfo extends HttpServlet {
 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");       
        try (PrintWriter out = response.getWriter()) {
                    
            String upn=request.getParameter("upn");
            String did=request.getParameter("did");
            String sku=request.getParameter("sku");
            String companyname=request.getParameter("companyname");
            String ticket=request.getParameter("ticket");
           
                model.UserActivaton a=new model.log(base,altura);
                a.area();
                a.perimetro();
                
                Cookie ck=new Cookie("base",base);
                response.addCookie(ck);
                
                ck=new Cookie("altura",altura);
                response.addCookie(ck);
                
                String StArea = Integer.toString(a.getArea());
                ck=new Cookie("area",StArea);
                response.addCookie(ck);
                
                String StPer = Integer.toString(a.getPerimetro());
                ck=new Cookie("perimetro", StPer);
                response.addCookie(ck);
                
               
                
                HttpSession sesion= request.getSession(false);
                sesion.setAttribute("nombre", nombre);
                
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