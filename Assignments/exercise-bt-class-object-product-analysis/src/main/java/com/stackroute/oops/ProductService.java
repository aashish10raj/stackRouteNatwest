package com.stackroute.oops;

import java.util.Objects;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
Product[] product = ProductRepository.getProducts();
    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {

        int status=0,i;
        for(i=0;i<product.length;i++)
        {
            if(product[i].getProductCode()==productCode) {
                status = 1;
                break;
            }
        }
        if (status==1)
            return product[i].getName();
        else
            return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {

        int j = 0;
        double max;
        Product[] prod;
        if (category == null || category.equals(""))
            return null;
        else {
            int size=0;
            for (Product pr:product) {
                if (Objects.equals(pr.getCategory(), category)) {
                    size++;
                }
            }
            prod=new Product[size];
            int check = 0;
            Product[] temp = new Product[1];
            if(size!=0)
            {
                for (Product product:product) {
                    if (product.getCategory().equals(category)) {
                        prod[j]=new Product(product.getProductCode(),product.getName(),product.getPrice(),product.getCategory());
                        j++;
                    }
                }
                max = prod[0].getPrice();
                for (Product pr:prod) {
                    if (pr.getPrice() > max){
                        max = pr.getPrice();
                        temp[0]=pr;
                        check=1;
                    }
                }

            }
            if (check == 1)
                return temp[0];
            else
                return null;
        }
    }

    /*
        Returns an array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {

        Product[] p;
        int j=0,temp=0;
        if(category==null || category.equals(""))
            return null;
        else{
            int size=0;
            for (Product product:product){
                if(product.getCategory().equals(category)){
                    size++;}
            }
            p=new Product[size];
            if(size!=0) {
                for (Product prod : product) {
                    if (prod.getCategory().equals(category)) {
                        temp = 1;
                        p[j] = new Product(prod.getProductCode(), prod.getName(), prod.getPrice(), prod.getCategory());
                        j++;
                    }
                }
            }
            if(temp==1)
                return p;
            else
                return null;

        }

    }
}
