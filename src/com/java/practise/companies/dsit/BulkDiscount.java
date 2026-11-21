package com.java.practise.companies.dsit;

import java.util.Map;

public class BulkDiscount implements  Offer{
    private final String code;
    private final int minQty;
    private final int discountedPricePence;

    public BulkDiscount(String code, int minQty, int discountedPricePence) {
        this.code = code;
        this.minQty = minQty;
        this.discountedPricePence = discountedPricePence;
    }

    @Override
    public int discountPence(Map<Product, Integer> basket) {
        int discount = 0;
        for (Map.Entry<Product, Integer> e : basket.entrySet()) {
            if (e.getKey().code().equals(code) && e.getValue() >= minQty) {
                discount += e.getValue() * (e.getKey().pricePence() - discountedPricePence);
            }
        }
        return discount;
    }
}
