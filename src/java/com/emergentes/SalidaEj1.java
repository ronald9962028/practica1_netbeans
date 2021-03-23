
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SalidaEj1", urlPatterns = {"/SalidaEj1"})
public class SalidaEj1 extends HttpServlet {    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SalidaEj1</title>"); 
            out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl' crossorigin='anonymous'>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class='container mt-5'>");
                out.println("<div class='row d-flex justify-content-center'>");
                    out.println("<div class='col-10 col-lg-6 col-md-8 col-sm-10'>");
                    
                        out.println("<h2 class='text-center'>RESULTADO</h2>");
                        
                        out.println("<h5'>NOMBRE: <span class='text-info'>"+nombre+"</span></h5>");
                        out.println("<br>"); 
                        out.println("<h5'>FECHA DE NACIMIENTO: <span class='text-info'>"+fecha+"</span></h5>");                        
                         
                        
                        out.println("<div class='d-grid gap-2'>");                               
                            out.println("<a href='EJ1' class='btn btn-danger'>REGRESAR</a>");
                        out.println("</div>"); 
                   
                        
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

   

}
