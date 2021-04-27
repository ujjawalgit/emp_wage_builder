package com.empwagebuilder;

public class EmpWageBuilder {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Constants
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_RATE = 20;

        int empHr = 0;
        int salary = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {

            case IS_FULL_TIME:
                System.out.print("Employee is present");
                empHr = 8;
                break;

            case IS_PART_TIME:
                System.out.print("Employee is part time ");
                empHr = 4;
                break;

            default:
                System.out.print("Employee is absent");
                empHr = 0;
        }

        salary = (WAGE_RATE * empHr);
        System.out.print("\nsalary:" + salary);
    }
}
