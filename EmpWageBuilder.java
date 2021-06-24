package com.empwagebuilder;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final int WAGE_RATE;
    private final int MAX_WORKING_DAYS;
    private final int MAX_WORKING_HRS;
    private final String companyName;

    public EmpWageBuilder(int WAGE_RATE, int MAX_WORKING_DAYS, int MAX_WORKING_HRS, String companyName) {
        this.WAGE_RATE = WAGE_RATE;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HRS = MAX_WORKING_HRS;
        this.companyName = companyName;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWageBuilder BharatBiotech = new EmpWageBuilder(500, 24, 240, "BharatBiotech");
        EmpWageBuilder BharatForge = new EmpWageBuilder(400, 20, 200, "BharatForge");

        System.out.println("\nCompany name:" + BharatBiotech.companyName + "\ntotal empWage:" + BharatBiotech.computeEmpWage());
        System.out.println("\nCompany name:" + BharatForge.companyName + "\ntotal empWage:" + BharatForge.computeEmpWage());
    }

    private int computeEmpWage() {

        int empHr = 0;
        int totalWorkingHr = 0;
        int salary = 0;

        int day = 1;
        while ((day <= this.MAX_WORKING_DAYS) && (totalWorkingHr <= this.MAX_WORKING_HRS)) {

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
        return salary;
    }
}

