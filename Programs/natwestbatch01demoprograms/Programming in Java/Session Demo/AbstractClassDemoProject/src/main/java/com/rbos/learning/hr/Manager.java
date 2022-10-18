package com.rbos.learning.hr;

public class Manager extends Employee{
    int teamSize;
    int teamRatings;

    public Manager(int employeeId, String name, double salary, int teamSize, int teamRatings) {
        super(employeeId, name, salary);
        this.teamSize = teamSize;
        this.teamRatings = teamRatings;
    }

    public double calculateIncrement(float hikePrecentage) {
        if(teamRatings>=7)
            salary *=hikePrecentage;
        return salary;
    }
}
