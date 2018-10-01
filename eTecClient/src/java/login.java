/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ema11
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {
   //metodo encargado de la gestión del método POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sesion = request.getSession();
        String usu, pass;
        usu = request.getParameter("user");
        pass = request.getParameter("pass");
        //deberíamos buscar el usuario en la base de datos, pero dado que se escapa de este tema, ponemos un ejemplo en el mismo código
        if(usu.equals("admin") && pass.equals("admin")){
            //si coincide usuario y password y además no hay sesión iniciada
            sesion.setAttribute("user", usu);
            //redirijo a página con información de login exitoso
            response.sendRedirect("indexA.html");
        }else if(usu.equals("centro") && pass.equals("123")){
            //si coincide usuario y password y además no hay sesión iniciada
            sesion.setAttribute("user", usu);
            //redirijo a página con información de login exitoso
            response.sendRedirect("indexC.html");
        }else if(usu.equals("tienda") && pass.equals("123")){
            //si coincide usuario y password y además no hay sesión iniciada
            sesion.setAttribute("user", usu);
            //redirijo a página con información de login exitoso
            response.sendRedirect("indexT.html");
        }
        else{
            //lógica para login inválido
            response.sendRedirect("index.html");
        }
    }
    

 }

