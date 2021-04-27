package com.empwagebuilder;

public class EmpWageBuilder {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Constants
        final int IS_FULL_TIME = 1;

        //Computation using random to check attendance
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            System.out.print("Employee is present");
        } else {
            System.out.print("Employee is absent");
        }
    }
}
