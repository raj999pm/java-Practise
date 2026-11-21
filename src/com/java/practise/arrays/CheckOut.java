package com.java.practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckOut {

    List<String> productList = new ArrayList<>();

    String FR1,SF1,CF1;


    static void pricingRules(){

    }


    public void scan(String productCode) {
        productList.add(productCode);
    }

    public double total() {
        double total = 0;
        for(int i=0; i<productList.size();i++){
            total += productList.indexOf(i);
        }
        return total;

    }
}
