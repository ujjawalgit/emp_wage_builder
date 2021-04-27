package com.empwagebuilder;

public class EmpWageBuilder {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //Constants
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_RATE = 20;
        final int MAX_WORKING_DAYS = 20;

        int empHr = 0;
        int totalWorkingHr = 0;
        int salary = 0;

        int day = 1;
        while (day <= MAX_WORKING_DAYS) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case IS_FULL_TIME:
                    empHr = 8;
                    break;

                case IS_PART_TIME:
                    empHr = 4;
                    break;

                default:
                    empHr = 0;
            }

            totalWorkingHr += empHr;
            day++;
        }

        salary = (WAGE_RATE * totalWorkingHr);
        System.out.print("salary:" + salary);
    }
}
