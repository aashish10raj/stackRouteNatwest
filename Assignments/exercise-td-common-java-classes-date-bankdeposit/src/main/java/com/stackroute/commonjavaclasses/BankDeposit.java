package com.stackroute.commonjavaclasses;


import java.time.Period;


public class BankDeposit {

    public String getMaturityDate(String investmentDate, Period duration) {
        if (duration == null ||  investmentDate == null ) {
            return ("Give proper input not null");
        }else if (investmentDate.isEmpty()) {
            return ("Give proper input not empty investment date");
        }else if (duration.isNegative()) {
            return ("Give proper duration not negative value");
        }else if (duration.isZero()) {
            return ("Give proper duration not zero value");
        }else {
            String str[] = investmentDate.split("/");
            int arr1[] = new int[3];
            int arr2[] = new int[3];

            for (int i = 0 ; i < str.length ; i++) {
                arr1[i] = Integer.parseInt(str[i]);
                if (i == 0) {
                    arr2[i] = duration.getDays();
                }else if(i==1) {
                    arr2[i] = duration.getMonths();
                }else {
                    arr2[i] = duration.getYears();
                }
            }
            arr1[0] += arr2[0];
            arr1[1] += arr2[1];
            arr1[2] += arr2[2];
            if (arr1[1] <= 9) {
                return (arr1[0]+"/0"+ arr1[1]+"/"+arr1[2]);
            }
            return (arr1[0]+"/"+ arr1[1]+"/"+arr1[2]);
        }
        //return null;
    }

    public String getInvestmentDuration(String investmentDate, String maturityDate) {

        if (investmentDate == null || maturityDate == null) {
            return("Give proper input not null");
        }else if (investmentDate.isEmpty() || maturityDate.isEmpty()) {
            return ("Give proper input not empty value");
        }else {
            String str1[] = investmentDate.split("/");
            String str2[] = maturityDate.split("/");
            int arr1[] = new int[3];
            int arr2[] = new int[3];
            for(int j = 0 ; j < str1.length ; j++) {
                arr1[j] = Integer.parseInt(str1[j]);
                arr2[j] = Integer.parseInt(str2[j]);
            }
            arr2[0] -= arr1[0];
            arr2[1] -= arr1[1];
            arr2[2] -= arr1[2];

            Period ans = Period.of(arr2[2], arr2[1], arr2[0]);
            if (ans.isZero()) {
                return(ans.toString());
            }else if(ans.isNegative()) {
                return("Give proper maturity date greater than investment date");
            }else {
                return(ans.toString());
            }

        }
    }
}
