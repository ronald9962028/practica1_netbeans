
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SalidaEj6", urlPatterns = {"/SalidaEj6"})
public class SalidaEj6 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl' crossorigin='anonymous'>");
            out.println("<title>Servlet EJ3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class='container mt-5'>");
                out.println("<div class='row d-flex justify-content-center'>");
                    out.println("<div class='col-10 col-lg-6 col-md-8 col-sm-10'>");
                        
                              
                        int numero1 = (int)(Math.random()*6+1);
                        int numero2 = (int)(Math.random()*6+1);
                        int resultado = numero1 + numero2;
                        
                        out.println("<h3 class='text-center'>DADO 1 ="+ numero1+ "</h3>"); 
                        out.println("<h3 class='text-center'>DADO 2= "+ numero2+ "</h3>");
                        
                        out.println("<h2 class='text-center'>RESULTADO: "+resultado+"</h2>"); 
                        
                        if (resultado==7 || resultado==11) {
                            
                            out.println("<div class='alert alert-success' role='alert'>FELICIDADES USTED GANO</div>");
                           
                        } else {
                            out.println("<div class='alert alert-danger' role='alert'>PERDIO :-( VUELVA A INTENTAR</div>");
                            
                        }
                        
                              out.println("<div class='d-grid gap-2'>");
                                out.println("<a href='EJ6' class='btn btn-primary btn-block mt-2 '>REGRESAR</a>");
                                out.println("<a href='Principal' class='btn btn-danger'>Inicio</a>");
                              out.println("</div>");    
                              
                       
                        
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

   
   

}
