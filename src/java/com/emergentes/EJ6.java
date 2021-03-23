package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EJ6", urlPatterns = {"/EJ6"})
public class EJ6 extends HttpServlet {

    

    
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
                        out.println("<h2 class='text-center'>EJERCICIO SEIS</h2>");
                        out.println("<h4 class='text-center'>REGLAS DEL JUEGO: Regla principal si la suma es 7 u 11 gana \n SI es otro número pierde</h4>");
                        
                        
                        out.println("<img class='rounded mx-auto d-block' src='https://images.clipartlogo.com/files/images/17/174275/two-red-dice_p' width='100' height='130'>");
                        
                        
                              
                              out.println("<div class='d-grid gap-2'>");
                                out.println("<a href='SalidaEj6' class='btn btn-primary btn-block mt-2 '>Jugar</a>");
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
