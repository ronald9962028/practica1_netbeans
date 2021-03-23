
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EJ7", urlPatterns = {"/EJ7"})
public class EJ7 extends HttpServlet {

   
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
                        out.println("<h2 class='text-center'>EJERCICIO SIETE</h2>");
                        
                        out.println("<form action='EJ7' method='POST'>");
                        
                              out.println("<div class='form-floating mb-3'>");
                                out.println("<input type='number' class='form-control' name='num' id='num' placeholder='num'>");
                                out.println("<label for='num'>Ingrese la dimencion de la matriz</label>");
                              out.println("</div>");
                              
                              out.println("<div class='d-grid gap-2'>");
                                out.println("<input type='submit' class='btn btn-primary btn-block mt-2 ' value='GENERAR MATRIZ CARACOL'>");
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
        
        int columnas = Integer.parseInt(request.getParameter("num"));
        int filas = Integer.parseInt(request.getParameter("num"));
                
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
            
            boolean derecha = true, izquierda = false, abajo = false;
            int[][] matrizc = new int[ filas ][ columnas ];
            int x = 0, y = -1;
            
            for( int k = 1; k <= columnas * filas; k++ ) {
            if( izquierda ) {
              y --;
              if( y == -1 ) {
                y = 0; x --;
                izquierda = false;
              } else if( matrizc[ x ][ y ] != 0 ) {
                y ++; x --;
                izquierda = false;
              }
            } else if( derecha ) {
              y ++;
              if( y == columnas ) {
                y = columnas - 1; x ++;
                derecha = false;
                abajo = true;
              } else if( matrizc[ x ][ y ] != 0 ) {
                y --; x ++;
                derecha = false;
                abajo = true;
              }
            } else if( abajo ) {
              x ++;
              if( x == filas ) {
                x = filas - 1; y --;
                abajo = false;
                izquierda = true;
              } else if( matrizc[ x ][ y ] != 0 ) {
                y --; x --;
                abajo = false;
                izquierda = true;
              }
            } else {
              x --;
              if( x == -1 || matrizc[ x ][ y ] != 0 ) {
                x ++; y ++;
                derecha = true;
              }
            }

            matrizc[ x ][ y ] = k;
          }
            
            
           out.println("<div class='container'>");
           
                out.println("<div class='d-grid gap-2'>");
                    out.println("<a href='EJ7' class='btn btn-primary btn-block mt-2 '>VOLVER A PONER LA DIMENCION</a>");
                    out.println("<a href='Principal' class='btn btn-danger'>Inicio</a>");
                out.println("</div>"); 
                
                out.print("<table class='table table-bordered border-primary mt-3'>");
                    for( int i = 0; i < filas; i++ ) {
                        out.print("<tr>");
                        for( int j = 0; j < columnas; j++ ) {                  
                          out.print("<td class='text-center'>"+matrizc[ i ][ j ]+"</td>");
                        }
                        out.print("</tr>");
                    }
                out.print("</table>"); 
           out.println("</div>");
           
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

 

}
