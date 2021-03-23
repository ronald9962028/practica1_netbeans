
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EJ5", urlPatterns = {"/EJ5"})
public class EJ5 extends HttpServlet {

    
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
                out.println("<h2 class='text-center'>EJERCICIO CINCO</h2>");
                out.println("<form action='EJ5' method='POST'>");
                    out.println("<div class='row d-flex justify-content-center'>");                       
                        
                        
                              out.println("<div class='form-floating mb-3 col-4'>");
                                out.println("<input type='number' min='1' max='2021' class='form-control' name='uno' id='uno' placeholder='uno'>");
                                out.println("<label for='uno'>NUMERO 1</label>");
                              out.println("</div>");
                              
                              out.println("<div class='col-auto'>");
                                out.println("<select class='form-select text-primary' name='operador' aria-label='Default select example'>");
                                      out.println("<option value='mas'>+</option>");
                                      out.println("<option value='menos'>-</option>");
                                      out.println("<option value='por'>*</option>");
                                      out.println("<option value='div'>/</option>");
                                out.println("</select>"); 
                              out.println("</div>");
                              
                              out.println("<div class='form-floating mb-3 col-4'>");
                                out.println("<input type='number' min='1' max='2021' class='form-control' name='dos' id='dos' placeholder='dos'>");
                                out.println("<label for='dos'>NUMERO 2</label>");
                              out.println("</div>");
                              
                              
                              
                              
                              
                              
                              
                              out.println("<div class='d-grid gap-2'>");
                                out.println("<input type='submit' class='btn btn-primary btn-block mt-2 ' value='PROCESAR'>");
                                out.println("<a href='Principal' class='btn btn-danger'>Inicio</a>");
                              out.println("</div>"); 
                              
                       
                        
                     out.println("</div>");
                      out.println("</form>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Double uno = Double.parseDouble(request.getParameter("uno"));
        Double dos = Double.parseDouble(request.getParameter("dos"));

        String operador = request.getParameter("operador");
        Double resultado;
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
                        
                        if (operador.equals("mas")) {
                            resultado=uno+dos;                            
                            out.println("<h2 class='text-center'>RESULTADO: "+ Math.round(resultado)+"</h2>");
                        } else {
                            if (operador.equals("menos")) {
                            resultado=uno-dos;                            
                            out.println("<h2 class='text-center'>RESULTADO: "+Math.round(resultado)+"</h2>");
                            } else {                            
                                if (operador.equals("por")) {
                                    resultado=uno*dos;                            
                                    out.println("<h2 class='text-center'>RESULTADO: "+Math.round(resultado)+"</h2>");
                                } else {
                                    resultado=uno/dos;                            
                                    out.println("<h2 class='text-center'>RESULTADO: "+resultado+"</h2>");
                                }
                            }                            
                        }
                                  
                        
                        out.println("<div class='d-grid gap-2'>");                               
                            out.println("<a href='EJ5' class='btn btn-danger'>REGRESAR</a>");
                        out.println("</div>"); 
                   
                        
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    

}
