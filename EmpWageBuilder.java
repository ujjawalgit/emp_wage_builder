package com.empwagebuilder;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final int WAGE_RATE;
    private final int MAX_WORKING_DAYS;
    private final int MAX_WORKING_HRS;
    private final String companyName;
    private int totalWage;

    public EmpWageBuilder(int WAGE_RATE, int MAX_WORKING_DAYS, int MAX_WORKING_HRS, String companyName) {
        this.WAGE_RATE = WAGE_RATE;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HRS = MAX_WORKING_HRS;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "EmpWageBuilder{" +
                "companyName='" + companyName + '\'' +
                ", totalWage=" + totalWage +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWageBuilder BharatBiotech = new EmpWageBuilder(500, 24, 240, "BharatBiotech");
        EmpWageBuilder BharatForge = new EmpWageBuilder(400, 20, 200, "BharatForge");
        /* calling method to compute totalWage for a company*/
        BharatBiotech.computeEmpWage();
        BharatForge.computeEmpWage();
        System.out.println(BharatBiotech);
        System.out.println(BharatForge);

    }

    /*function to compute total wage  for company*/
    public void computeEmpWage() {
        int empHr = 0;
        int totalWorkingHr = 0;
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
        this.totalWage = (WAGE_RATE * totalWorkingHr); // saving total wage to instance variable
    }
}

