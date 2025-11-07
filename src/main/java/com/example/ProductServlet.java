package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));

        double total = quantity * price;
        double discount = 0;

        if (total >= 5000) discount = total * 0.20;
        else if (total >= 2000) discount = total * 0.10;
        else if (total >= 1000) discount = total * 0.05;

        double finalPrice = total - discount;

        out.println("<h2>Final Bill</h2>");
        out.println("Product Name: " + name + "<br>");
        out.println("Quantity: " + quantity + "<br>");
        out.println("Price Per Unit: " + price + "<br><br>");
        out.println("Total Price: " + total + "<br>");
        out.println("Discount: " + discount + "<br>");
        out.println("<h3>Final Amount: " + finalPrice + "</h3>");
    }
}
