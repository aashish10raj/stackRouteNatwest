package com.stackroute;

import java.util.Comparator;

public class StockRecordSortByDate implements Comparator<StockRecord> {

    @Override
    public int compare(StockRecord o1, StockRecord o2) {
        // TODO Auto-generated method stub
        return o2.getDate().compareTo(o1.getDate());
    }

}
