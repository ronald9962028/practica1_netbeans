
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;


@WebServlet(name = "EJ4", urlPatterns = {"/EJ4"})
public class EJ4 extends HttpServlet {
   

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
                        out.println("<h2 class='text-center'>EJERCICIO CUATRO</h2>");
                        
                        out.println("<form action='EJ4' method='POST'>");
                        
                              out.println("<div class='form-floating mb-3'>");
                                out.println("<input type='text' class='form-control' name='moneda' id='moneda' placeholder='edad'>");
                                out.println("<label for='moneda'>MONEDA</label>");
                              out.println("</div>");
                              out.println("<P>CONVERTIR A </P>");
                              
                              
                              out.println("<div class='row g-2'>");
                              
                                out.println("<div class='col-auto'>");
                                  out.println("<select class='form-select' name='uno' aria-label='Default select example'>");
                                    out.println("<option value='bo'>BOLIVIANOS A DOLAR</option>");
                                    out.println("<option value='do'>DOLAR A BOLIVIANOS</option>");
                                  out.println("</select>"); 
                                out.println("</div>");   
                                
                                                            
                                
                              out.println("</div>");                                                   
                              
                              
                              
                              out.println("<div class='d-grid gap-2'>");
                                out.println("<input type='submit' class='btn btn-primary btn-block mt-2 ' value='REGISTRAR'>");
                                out.println("<a href='Principal' class='btn btn-danger'>Inicio</a>");
                              out.println("</div>"); 
                              
                        out.println("</form>");
                        
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Double moneda = Double.parseDouble(request.getParameter("moneda"));
        String tipo = request.getParameter("uno");
        
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
                        if (tipo.equals("do")) {
                            moneda= moneda*6.90;
                            out.println("<h2 class='text-center'>EN DOLARES: "+moneda+" $</h2>");
                        } else {
                            moneda = moneda/6.90;
                            out.println("<h2 class='text-center'>EN BOLIVIANOS ES: "+ moneda +" Bo</h2>");
                        }
                                  
                        
                        out.println("<div class='d-grid gap-2'>");                               
                            out.println("<a href='EJ4' class='btn btn-danger'>REGRESAR</a>");
                        out.println("</div>"); 
                   
                        
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    

}
