package com.empwagebuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private List<CompanyEmpWage> companyEmpWageList ;
    private Map<String, CompanyEmpWage> companyEmpWageMap;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
        companyEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String companyName, int WAGE_RATE, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, WAGE_RATE, MAX_WORKING_DAYS, MAX_WORKING_HRS);
        companyEmpWageList.add(companyEmpWage);
        companyEmpWageMap.put(companyName, companyEmpWage);
    }

    /* computing empWage for each company and saving it */
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.setTotalWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    /* function to compute total wage  for company */
    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHr;
        int totalWorkingHr = 0;
        int day = 1;
        companyEmpWage.dailyWage = new int[companyEmpWage.MAX_WORKING_DAYS];
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
            companyEmpWage.dailyWage[day-1] = empHr*companyEmpWage.WAGE_RATE;
            totalWorkingHr += empHr;
            day++;
        }
        return  (companyEmpWage.WAGE_RATE * totalWorkingHr); //total wage calculation
    }

    @Override
    public int getTotalWage(String companyName) {
        return companyEmpWageMap.get(companyName).totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("BharatBiotech",500, 24, 240);
        empWageBuilder.addCompanyEmpWage("BharatForge",400, 20, 200);
      /* calling method to compute totalWage for each company*/
        empWageBuilder.computeEmpWage();
        System.out.println(empWageBuilder.getTotalWage("BharatForge"));
        System.out.print( "Total Emp Wage:" + computeEmpWage() );
    }
}

