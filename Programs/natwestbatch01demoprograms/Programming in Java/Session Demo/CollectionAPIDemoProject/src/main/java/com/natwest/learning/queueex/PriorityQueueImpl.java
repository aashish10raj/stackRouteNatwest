package com.natwest.learning.queueex;

import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
        PriorityQueue<Patient> patients=new PriorityQueue<>();
        // adding patients

        patients.add(new Patient("Bill",76,Severity.HIGH));
        patients.add(new Patient("Mark",28,Severity.MED));
        patients.add(new Patient("Steve",42,Severity.LOW));
        patients.add(new Patient("Ana",21,Severity.HIGH));
        patients.add(new Patient("Sam",66,Severity.MED));
        patients.add(new Patient("Sam",78,Severity.MED));


        while(!patients.isEmpty()){
            System.out.println(patients.poll());

        }


//        for (Patient patient:patients){
//            System.out.println(patient);
//        }
    }
}
