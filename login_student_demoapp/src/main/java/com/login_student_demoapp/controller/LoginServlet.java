package com.login_student_demoapp.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.login_student_demoapp.model.UserDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private UserDao userDao = new UserDao();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Read the username and password from the request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Check if the username and password are correct (replace this with your own authentication logic)
        boolean isAuthenticated = userDao.authenticateUser(username, password);
        
        // Redirect the user to the appropriate page based on whether they are authenticated
        if (isAuthenticated) {
            response.sendRedirect("home.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
    
}
