package com.java.practise.companies.dsit;

import java.util.Map;

public class BuyOneGetOneFree implements Offer {

    private final String code;

    public BuyOneGetOneFree(String code) { this.code = code; }

    @Override
    public int discountPence(Map<Product, Integer> basket) {
        int discount = 0;
        for (Map.Entry<Product, Integer> e : basket.entrySet()) {
            if (e.getKey().code().equals(code)) {
                discount += (e.getValue() / 2) * e.getKey().pricePence();
            }
        }
        return discount;
    }
}
