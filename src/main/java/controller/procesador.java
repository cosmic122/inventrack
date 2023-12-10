package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;*/

import model.invLog;

@WebServlet(name = "/procesador" , urlPatterns = {"/procesador"})

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
	           
	            invLog invLog = new invLog(upn,did,sku,companyname,ticket);
	            	
	            request.setAttribute("invLog",invLog);
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


