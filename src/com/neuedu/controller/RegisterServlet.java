package com.neuedu.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*String username =req.getParameter("username");
        String password = req.getParameter("pwd");
        String pass = req.getParameter("pwds");
        String tele = req.getParameter("tele");*/
        req.getRequestDispatcher("WEB-INF/pages/register.jsp").forward(req,resp);
    }
}
