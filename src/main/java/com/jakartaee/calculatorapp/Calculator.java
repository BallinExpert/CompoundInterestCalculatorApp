package com.jakartaee.calculatorapp;

public class Calculator {

    public static double calculateCompoundInterest(double principalAmount, double interestRate, int years, int CompoundingPeriod) {
        double ratePerPeriod = interestRate / CompoundingPeriod;
        int totalCompoundingPeriods = CompoundingPeriod * years;

        return Math.round(principalAmount * Math.pow((1 + ratePerPeriod), totalCompoundingPeriods)) ;
    }
}

