package com.jakartaee.calculatorapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "CalculatorServlet", urlPatterns ={"/","/home"})
public class CalculatorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String principalAmount = request.getParameter("principalAmount");
        String interestRate = request.getParameter("interestRate");
        String years = request.getParameter("years");
        String CompoundingPeriod = request.getParameter("CompoundingPeriod");

        String error;

        if (principalAmount.isBlank() || interestRate.isBlank() || years.isBlank() || CompoundingPeriod.isBlank()) {
            error = "One or More of the input boxes were empty. Try Again!!";
            request.setAttribute("error", error);
            System.out.println("Empty!!!!!");

        } else {
            // Convert interestRate from percentage to decimal
            double interestRateDecimal = Double.parseDouble(interestRate) / 100.0;

            double result = Calculator.calculateCompoundInterest(
                    Double.parseDouble(principalAmount),
                    interestRateDecimal,
                    Integer.parseInt(years),
                    Integer.parseInt(CompoundingPeriod));



            request.setAttribute("result", result);
        }
        request.setAttribute("principalAmount",principalAmount);
        request.setAttribute("interestRate",interestRate);
        request.setAttribute("years",years);
        request.setAttribute("CompoundingPeriod",CompoundingPeriod);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }


}

