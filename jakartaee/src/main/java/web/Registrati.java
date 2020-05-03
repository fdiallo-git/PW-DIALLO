/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatimatou Diallo
 */
@WebServlet(urlPatterns = "/registrati")
public class Registrati extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("registrati grazie!....");
        String nome = resquest.getParameter("nome");
        String cognome = resquest.getParameter("cognome");
        System.out.println(String.format("nome: %s, cognome: %s", nome, cognome));

        //PrintWriter out = getWritter();
        
        PrintWriter out = response.getWriter();
        out.println("<h1> Registrazione effetuata con successo, grazie!</h1>");
        out.flush();
    }

}
