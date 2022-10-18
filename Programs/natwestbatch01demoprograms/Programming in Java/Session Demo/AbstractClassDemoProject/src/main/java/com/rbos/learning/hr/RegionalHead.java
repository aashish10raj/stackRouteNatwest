package com.rbos.learning.hr;

public class RegionalHead extends Employee{
    String regionName;
    int regionPerformance;
    int reviewRatings;

    public RegionalHead(int employeeId, String name, double salary, String regionName, int regionPerformance, int reviewRatings) {
        super(employeeId, name, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRatings = reviewRatings;
    }

    @Override
    public void displayEmployeePersonalInfo() {
        super.displayEmployeePersonalInfo();
        System.out.println(name+" :: "+salary+" :: "+regionName);
    }

    public double calculateIncrement(float hikePrecentage) {
        if(regionPerformance >=7 && reviewRatings >=8)
            salary *=hikePrecentage;
        return salary;
    }
}
