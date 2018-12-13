package com.neuedu.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
       /* System.out.println(config.getServletName());//获取服务名
        System.out.println(config.getServletContext());//获取服务地址
        System.out.println(config.getInitParameter("in"));//获取初始化的value，括号中放入param-name*/
    }

    @Override
    public void destroy() {
        /*System.out.println("销毁完成"); //在服务器关闭时销毁*/
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* resp.sendRedirect("http://www.baidu.com");*/



     /*  req.setAttribute("key","value");//向作用域中放值
       req.getRequestDispatcher("index.jsp").forward(req,resp);//放在哪个jsp（"index.jsp"）页面
*/
       /* resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.write("中文");
       System.out.println(req.getContextPath());//获取项目名
        System.out.println(req.getRequestURL());//获取网址路径
        System.out.println(req.getRequestURI());//获取项目名和请求
        System.out.println(req.getServerName());//获取IP地址
        System.out.println(req.getServerPort());//获取端口号
        System.out.println(req.getCharacterEncoding());//获取编码级
        System.out.println(req.getContentType());//获取文档格式
        System.out.println(req.getScheme());//获取协议*/
    }
}
