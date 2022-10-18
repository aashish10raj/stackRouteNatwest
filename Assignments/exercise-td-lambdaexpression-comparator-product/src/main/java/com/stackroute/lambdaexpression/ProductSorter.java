package com.stackroute.lambdaexpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductSorter {
    List<Product> productList=new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }

    public List<Product> sortProductByName(){
        List<Product> sorted=productList.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        return sorted;
    }

    public List<Product> sortProductByNameLength() {
        Comparator<Product> comparator = (p1, p2) -> {
            if (p1.getName().length() - p2.getName().length() == 0)
                return p1.getName().compareTo(p2.getName());
            else if (p1.getName().length() - p2.getName().length() > 0)
                return 1;
            else
                return -1;
        };
        List<Product> sorted = productList.stream().sorted(comparator).collect(Collectors.toList());
        return sorted;
    }

    public List<Product> sortProductByPriceDescending(){
        Comparator<Product> comparator=(p1,p2)->{
          if(p1.getPrice()==p2.getPrice())
              return 0;
          else if(p1.getPrice()<p2.getPrice())
              return 1;
          else
              return -1;
        };
        List<Product> sorted = productList.stream().sorted(comparator).collect(Collectors.toList());
        return sorted;
    }

    public List<Product> sortProductByCategoryAscendingAndByPriceDescending() {
        List<Product> sortedList = productList.stream()
                .sorted(Comparator.comparing(Product::getCategory)
                        .thenComparing(Comparator.comparing(Product::getPrice).reversed()))
                .collect(Collectors.toList());
        return sortedList;
    }

}
