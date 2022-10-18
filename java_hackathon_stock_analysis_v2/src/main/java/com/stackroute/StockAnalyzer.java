package com.stackroute;


import com.stackroute.exception.InvalidDateException;
import com.stackroute.exception.NoRecordFoundException;
import com.stackroute.exception.StockRecordNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class StockAnalyzer {
    private StockRecord[] stockRecordList;
    private String filePath;
    FileReader freader;
    BufferedReader breader;

    /**
     * Complete the constructor
     */
    public StockAnalyzer(String filePath) {
        this.filePath = filePath;
        try {
            freader = new FileReader(filePath);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        breader = new BufferedReader(freader);
        this.stockRecordList = new StockRecord[0];

    }
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Complete the Setters and Getters
     */
    public StockRecord[] getStockRecordList() {
        return stockRecordList;
    }

    public void setStockRecordList(StockRecord[] stockRecordList) {
        this.stockRecordList = stockRecordList;
    }



    /**
     * This method is used to find the number of records from the file excluding the header
     * If any record, doesn't have all the fields, it should be skipped and not counted.
     * If no valid records are found in the file, then NoRecordFoundException should be thrown
     * Assume that every file will have a valid header
     */
    public int validStockRecordCount() throws FileNotFoundException, NoRecordFoundException {
//        freader = new FileReader(filePath);
//        breader = new BufferedReader(freader);
//        try {
//            String fileheaders = breader.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        int lines = -1;
//        while (true) {
//            try {
//                if (!(breader.readLine() != null)) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            lines++;
//        }
//        try {
//            breader.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        if (lines == 0)
//            throw new NoRecordFoundException();
//        else
//            return lines;
        String line = "";
        int count = 0;

        try
        {
            //parsing a CSV file into BufferedReader class constructor
            FileReader file=new FileReader(filePath);

            BufferedReader br = new BufferedReader(file);

            String headerList = br.readLine();
            String[] header = headerList.split(",");

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] data = line.split(",");    // use comma as separator

                if(data.length == 7) {
                    count++;
                }

            }

            br.close();

            if(count == 0) throw new NoRecordFoundException();

        }
        catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
        catch(IOException e) {
            System.out.println("IoException");
        }
        catch(NoRecordFoundException e) {
            throw new NoRecordFoundException();
        }

        return count;

    }

    /* This method is responsible to read from the file and load the array stockRecordList with valid Records*/
    public void loadRecordsFromFile() throws IOException, ParseException, NoRecordFoundException {
//        freader = new FileReader(filePath);
//        breader = new BufferedReader(freader);
//        String fileheaders = breader.readLine();
//        String line = breader.readLine();
//        while (line != null) {
//            String[] record = line.split(",");
//            java.util.Date recordDate = new SimpleDateFormat("dd-MM-yyyy").parse(record[0]);
//            double recordOpen = Double.parseDouble(record[1]);
//            double recordHigh = Double.parseDouble(record[2]);
//            double recordLow = Double.parseDouble(record[3]);
//            double recordClose = Double.parseDouble(record[4]);
//            double recordAdj = Double.parseDouble(record[5]);
//            long recordVol = Long.parseLong(record[6]);
//            StockRecord newRecord = new StockRecord(recordDate, recordOpen, recordHigh, recordLow, recordClose,
//                    recordAdj, recordVol);
//
//            List<StockRecord> arrlist = new ArrayList<StockRecord>(Arrays.asList(stockRecordList));
//            arrlist.add(newRecord);
//            stockRecordList = arrlist.toArray(stockRecordList);
//            // System.out.println(newRecord);
//            line = breader.readLine();
//        }
//        return stockRecordList;
        int count = 0;
        int lineNo = 0;
        List<StockRecord> list = new ArrayList<StockRecord>();

        try
        {
            //reading
            FileReader file=new FileReader(this.filePath);

            BufferedReader br = new BufferedReader(file);

            String headerList = br.readLine();
            String[] header = headerList.split(",");

            lineNo++;

            String line = "";

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");


                if(data.length == 7) {

                    StockRecord stockRecord = new StockRecord(formatter.parse(data[0]), Double.parseDouble(data[1]),
                            Double.parseDouble(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]),
                            Double.parseDouble(data[5]), Long.parseLong(data[6]));

                    list.add(stockRecord);

                    count++;

                }

                lineNo++;

            }

            br.close();

            if(count == 0) throw new NoRecordFoundException();

            this.stockRecordList = new StockRecord[list.size()];

            this.stockRecordList = list.toArray(this.stockRecordList);

        }
        catch(IOException e) {
            throw new IOException();
        }
        catch(ParseException e) {
            throw new ParseException(filePath, lineNo);
        }
        catch(NoRecordFoundException e) {
            throw new NoRecordFoundException();
        }


    }

    /* This method is used to find Net return percentage between the first and last record.
       The return should be based on the closing price */
    public double findNetReturn() throws StockRecordNotFoundException {
//        StockRecord[] sortedRecords;
//        sortedRecords = this.sortByDate(stockRecordList);
//        int len = sortedRecords.length;
//        double intialValue = sortedRecords[0].getDayClosingPrice();
//        double finalvalue = sortedRecords[len - 1].getDayClosingPrice();
//        double absReturn = (finalvalue - intialValue) / intialValue;
//        return absReturn * 100;

        if(this.getStockRecordList() == null || this.getStockRecordList().length < 2)
            throw new StockRecordNotFoundException();

        else {

            StockRecord[] stockRecordList = this.getStockRecordList();

            StockRecord stockRecord1 = stockRecordList[0];
            StockRecord stockRecord2 = stockRecordList[stockRecordList.length-1];

            return ((stockRecord2.getDayClosingPrice() - stockRecord1.getDayClosingPrice())/stockRecord1.getDayClosingPrice()) * 100.00;


        }
    }

    /* This method is used to find the closing stock price on a given date.
     * Appropriate exceptions should be thrown*/
    public double findClosingStockPrice(String date) throws StockRecordNotFoundException, InvalidDateException {
//        double result = 0;
//        StockRecord[] sortedRecords;
//        sortedRecords = this.sortByDate(stockRecordList);
//        java.util.Date searchDate = null;
//        try {
//            searchDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        for (StockRecord stockRecord : sortedRecords) {
//            if (stockRecord.getDate().equals(searchDate))
//                result = stockRecord.getDayClosingPrice();
//        }
//        if (result == 0)
//            throw new StockRecordNotFoundException();
//        else
//            return result;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {

            if(this.getStockRecordList() == null) throw new StockRecordNotFoundException();

            Date d = formatter.parse(date);

            StockRecord[] stockRecordArr = this.getStockRecordList();

            for(StockRecord stockRecord: stockRecordArr) {

                if(stockRecord.getDate().equals(d)) {
                    return stockRecord.getDayClosingPrice();
                }

            }

            throw new StockRecordNotFoundException();

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            throw new InvalidDateException();
        }
        catch (StockRecordNotFoundException e) {
            // TODO: handle exception
            throw new StockRecordNotFoundException();
        }
        catch (Exception e) {
            // TODO: handle exception
        }

        return 0.00;
    }

    /* This method is used to find Net return percentage between the two dates.
       The return should be based on the closing price */
    public double findNetReturn(String fromDate, String toDate) throws StockRecordNotFoundException, InvalidDateException {
//        double result = 0;
//        StockRecord r1 = null, r2 = null;
//        StockRecord[] sortedRecords;
//        sortedRecords = this.sortByDate(stockRecordList);
//        java.util.Date sDate = null;
//        try {
//            sDate = new SimpleDateFormat("dd-MM-yyyy").parse(fromDate);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        java.util.Date eDate = null;
//        try {
//            eDate = new SimpleDateFormat("dd-MM-yyyy").parse(toDate);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        for (StockRecord stockRecord : sortedRecords) {
//            if (stockRecord.getDate().equals(sDate))
//                r1 = stockRecord;
//            else if (stockRecord.getDate().equals(eDate))
//                r2 = stockRecord;
//        }
//        if (r1 == null || r2 == null)
//            throw new StockRecordNotFoundException();
//        else {
//            double intialValue = r1.getDayClosingPrice();
//            double finalvalue = r2.getDayClosingPrice();
//            double absReturn = (finalvalue - intialValue) / intialValue;
//            result = absReturn * 100;
//        }
//        return result;
        try {

            if(this.getStockRecordList() == null) throw new StockRecordNotFoundException();

            double p1 = this.findClosingStockPrice(fromDate);
            double p2 = this.findClosingStockPrice(toDate);

            return ((p2-p1)/p1)*100.00;
        }
        catch(StockRecordNotFoundException e) {
            throw new StockRecordNotFoundException();
        }
        catch (Exception e) {
            // TODO: handle exception
        }

        return 0.00;
    }

    /**
     * this method is responsible for calculating the current investment value on a given evaluation date by specifying the
     * investment date and invested amount.
     * Hint: If an investor purchases x amount of stocks by investing an amount on a given date, What would be his value of his investment
     * If he sells it on an evaluation date. (Consider closing prices of stocks and assume investor can buy fractional number of stocks also)
     */
    public double findInvestmentValue(double investmentAmount, String investmentDate, String evaluationDate) throws InvalidDateException, StockRecordNotFoundException {
//        if(stockRecordList == null) {
//            throw new StockRecordNotFoundException();
//        }
//        double investmentValue = 0;
//        Date validInvestmentDate;
//        Date validEvaluationDate;
//        try {
//            validInvestmentDate = new SimpleDateFormat("yyyy-MM-dd").parse(investmentDate);
//            validEvaluationDate = new SimpleDateFormat("yyyy-MM-dd").parse(evaluationDate);
//            for(StockRecord stockRecord : stockRecordList) {
//                if(stockRecord.getDate().equals(validInvestmentDate)) {
//                    investmentValue = investmentAmount * stockRecord.getDayClosingPrice();
//                }
//            }
//            for(StockRecord stockRecord : stockRecordList) {
//                if(stockRecord.getDate().equals(validEvaluationDate)) {
//                    investmentValue = investmentValue * stockRecord.getDayClosingPrice();
//                }
//            }
//        } catch (ParseException e) {
//            throw new InvalidDateException();
//        }
//        return investmentValue;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date d1 = formatter.parse(investmentDate);
            Date d2 = formatter.parse(evaluationDate);

            double c1 = 0.00;
            double c2 = 0.00;

            if(this.getStockRecordList() == null) throw new StockRecordNotFoundException();

            for(StockRecord stockRecord: this.getStockRecordList()) {
                if(stockRecord.getDate().equals(d1)) {
                    c1 = stockRecord.getDayClosingPrice();
                }
                if(stockRecord.getDate().equals(d2)) {
                    c2 = stockRecord.getDayClosingPrice();
                }
            }

            if(c1 == 0.00 || c2 == 0.00) {
                throw new StockRecordNotFoundException();
            }
            // c2 * ia / c1

            return (c2 * investmentAmount)/c1;
        }
        catch(ParseException e) {
            throw new InvalidDateException();
        }
        catch(StockRecordNotFoundException e){
            throw new StockRecordNotFoundException();
        }
        catch (Exception e) {
            // TODO: handle exception
        }

        return 0.00;

    }

//    public double findInvestmentValue(double investmentAmount, String investmentDate, String evaluationDate) throws InvalidDateException, StockRecordNotFoundException {
//        double result = 0;
//        StockRecord r1 = null, r2 = null;
//        StockRecord[] sortedRecords;
//        sortedRecords = this.sortByDate(stockRecordList);
//        java.util.Date inDate = null;
//        try {
//            inDate = new SimpleDateFormat("dd-MM-yyyy").parse(investmentDate);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        java.util.Date outDate = null;
//        try {
//            outDate = new SimpleDateFormat("dd-MM-yyyy").parse(evaluationDate);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        for (StockRecord stockRecord : sortedRecords) {
//            if (stockRecord.getDate().equals(inDate))
//                r1 = stockRecord;
//            else if (stockRecord.getDate().equals(outDate))
//                r2 = stockRecord;
//        }
//        if (r1 == null || r2 == null)
//            throw new StockRecordNotFoundException();
//        else {
//            double intialValue = r1.getDayClosingPrice();
//            double units = investmentAmount/intialValue;
//            double finalvalue = r2.getDayClosingPrice();
//            double evaluation = units * finalvalue;
//            result = evaluation;
//        }
//        return result;
//    }

    /* this is used to find the lowest closing price for the stock */
    public double findHighestClosingStockPrice()  {
        double stockValue = 0.00;

        for(StockRecord stockRecord: this.getStockRecordList()) {
            if(stockRecord.getDayClosingPrice() > stockValue) {
                stockValue = stockRecord.getDayClosingPrice();
            }
        }
        return stockValue;
    }


    /* this method takes an Array of Stock Records as input and returns that Array with records sorted in ascending order by date */
    public StockRecord[] sortByDate(StockRecord[] stockRecords) {
        List<StockRecord> stockList = Arrays.asList(this.getStockRecordList());

        Collections.sort(stockList, new StockRecordSortByDate());

        StockRecord[] retArr = new StockRecord[stockList.size()];

        return stockList.toArray(retArr);
    }

    /* this is used to find the daily avg return of the stock
    *  hint:
    *  If we have to find the daily return between 2020-03-01(d1)
    * and 2020-03-02(d2), the formula is:
	      daily return = (d2-d1)/d1*/
    public double findAvgDailyReturn() {
//        double total = 0;
//        StockRecord[] sortedRecords = this.sortByDate(stockRecordList);
//        int len = sortedRecords.length;
//        for(int i = 0 ; i < len - 1 ; i++ ) {
//            double change = (sortedRecords[i+1].getDayClosingPrice() - sortedRecords[i].getDayClosingPrice())/sortedRecords[i].getDayClosingPrice();
//            double dayreturn = change * 100;
//            total = total + dayreturn;
//        }
//        return total/(len-1);


        StockRecord[] sortedRecords = this.sortByDate(this.getStockRecordList());

        double total = 0.00;

        for (int i = 1; i < sortedRecords.length; i++) {
            total += (sortedRecords[i].getAdjustedDayClosingPrice() - sortedRecords[i - 1].getAdjustedDayClosingPrice()) / sortedRecords[i - 1].getAdjustedDayClosingPrice();
        }

        return total / (sortedRecords.length - 1);
    }
}
