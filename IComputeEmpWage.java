package com.empwagebuilder;

public interface IComputeEmpWage {
    public void addCompanyEmpWage(String companyName, int WAGE_RATE, int MAX_WORKING_DAYS, int MAX_WORKING_HRS);
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
    }
