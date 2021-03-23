package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl' crossorigin='anonymous'>");
            out.println("<title>Servlet Principal</title>");            
            out.println("</head>");
            out.println("<body style='background: linear-gradient(#0096a6,#002b40); background-repeat: no-repeat; background-size:cover; min-height:100vh;'>");
            
            out.println("<nav class='navbar fixed-top navbar-expand-lg navbar-light bg-light'>");
                out.println("<div class='container'>");
                  out.println("<a class='navbar-brand' href='#'><spam style='font-weight:bold;font-size:30px;'>UPEA-2021</spam></a>");
                  out.println("<button class='navbar-toggler' type='button' data-bs-toggle='collapse' data-bs-target='#navbarSupportedContent' aria-controls='navbarSupportedContent' aria-expanded='false' aria-label='Toggle navigation'>");
                    out.println("<span class='navbar-toggler-icon'></span>");
                  out.println("</button>");
                  out.println("<div class='collapse navbar-collapse' id='navbarSupportedContent'>");
                    out.println("<ul class='navbar-nav me-auto mb-2 mb-lg-0'>");
                      out.println("<li class='nav-item'>");
                        out.println("<a class='nav-link active' aria-current='page' href='EJ1'>EJER.1</a>");
                      out.println("</li>");
                      out.println("<li class='nav-item'>");
                        out.println("<a class='nav-link active' aria-current='page' href='EJ2'>EJER.2</a>");
                      out.println("</li>");
                      out.println("<li class='nav-item'>");
                        out.println("<a class='nav-link active' aria-current='page' href='EJ3'>EJER.3</a>");
                      out.println("</li>");
                      out.println("<li class='nav-item'>");
                        out.println("<a class='nav-link active' aria-current='page' href='EJ4'>EJER.4</a>");
                      out.println("</li>");   
                      out.println("<li class='nav-item'>");
                        out.println("<a class='nav-link active' aria-current='page' href='EJ5'>EJER.5</a>");
                      out.println("</li>");  
                      out.println("<li class='nav-item'>");
                        out.println("<a class='nav-link active' aria-current='page' href='EJ6'>EJER.6</a>");
                      out.println("</li>");  
                      out.println("<li class='nav-item'>");
                        out.println("<a class='nav-link active' aria-current='page' href='EJ7'>EJER.7</a>");
                      out.println("</li>");
                    out.println("</ul>");               
                  out.println("</div>");
                out.println("</div>");
            out.println("</nav>");
            
            out.println("<div style='height:100vh; display: flex;justify-content: center;align-items: center;'  class='container mt-5'>");
                out.println("<div class='row'>");
                    out.println("<div class='col-12'>");
                        out.println("<h1 class='text-white'>RONALD MAMANI LLUSCO</h1>");
                    out.println("</div>");
                out.println("</div>");
            out.println("</div>");
            
            
            
            
            out.println("<script src=\'https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\' integrity=\'sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\' crossorigin=\'anonymous\'></script>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }  

}
