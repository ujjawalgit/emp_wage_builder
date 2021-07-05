package com.empwagebuilder;

import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder implements IComputeEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private List<CompanyEmpWage> companyEmpWageList ;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String companyName, int WAGE_RATE, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, WAGE_RATE, MAX_WORKING_DAYS, MAX_WORKING_HRS);
        companyEmpWageList.add(companyEmpWage);
    }

    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.setTotalWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        /* calling method to compute totalWage for a company*/
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("BharatBiotech",500, 24, 240);
        empWageBuilder.addCompanyEmpWage("BharatForge",400, 20, 200);
        empWageBuilder.computeEmpWage();
    }

    /*function to compute total wage  for company*/
    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHr;
        int totalWorkingHr = 0;
        int day = 1;
        while ((day <= companyEmpWage.MAX_WORKING_DAYS) && (totalWorkingHr <= companyEmpWage.MAX_WORKING_HRS)) {
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
        return  (companyEmpWage.WAGE_RATE * totalWorkingHr); //total wage calculation
    }
}

