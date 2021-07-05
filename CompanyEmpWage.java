package com.empwagebuilder;

public class CompanyEmpWage {
   public final String companyName;
   public final int WAGE_RATE;
   public final int MAX_WORKING_DAYS;
   public final int MAX_WORKING_HRS;
   public int[] dailyWage;
   public int totalEmpWage;

    /**
     * parametrised constructor
     * @param companyName
     * @param WAGE_RATE
     * @param MAX_WORKING_DAYS
     * @param MAX_WORKING_HRS
     */

    public CompanyEmpWage(String companyName, int WAGE_RATE, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        this.companyName = companyName;
        this.WAGE_RATE = WAGE_RATE;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HRS = MAX_WORKING_HRS;
    }

    /**
     * saving total wage for each company employee
     * @param totalWage
     */
    public void setTotalWage(int totalWage) {
        this.totalEmpWage = totalWage;
    }

    @Override
    public String toString() {
        return "companyName='" + companyName + '\'' +
                ", totalEmpWage=" + totalEmpWage;
    }
}
