package com.neuedu.controller;

import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoRegisterServlet extends HttpServlet {
    private IUserService userService = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username =req.getParameter("username");
        String password = req.getParameter("pwd");
        String pass = req.getParameter("pwds");
        String tele = req.getParameter("tele");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setTele(tele);
        if (password.equals(pass)){
            userService.insert(user);
            resp.sendRedirect("login");
        }
    }
}
