package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BlogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("title", "My First Blog Post");
        req.setAttribute("content", "This is a sample blog for Maven experiment.");
        req.getRequestDispatcher("/posts.jsp").forward(req, resp);
    }
}
