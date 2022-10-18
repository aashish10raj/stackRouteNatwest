package com.natwest.learning.queueex;

public class Patient implements Comparable<Patient> {
    private String firstName;
    private int age;
    private Severity severity;

    public Patient() {
    }

    public Patient(String firstName, int age, Severity severity) {
        this.firstName = firstName;
        this.age = age;
        this.severity = severity;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Severity getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", severity=" + severity +
                '}';
    }

    @Override
    public int compareTo(Patient patient) {
        int differnce=patient.severity.ordinal()-this.severity.ordinal();
        if (differnce==0){
            // if same priority , give preference to senior citizens
            differnce=patient.age - this.age;
        }
        return differnce;
    }
}
