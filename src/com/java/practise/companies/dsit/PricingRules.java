package com.java.practise.companies.dsit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricingRules {
    private final Map<String, Product> catalogue = new HashMap<>();
    private final List<Offer> offers;

    public PricingRules(List<Product> products, List<Offer> offers) {
        products.forEach(p -> catalogue.put(p.code(), p));
        this.offers = List.copyOf(offers);
    }

    public Product find(String code) {
        Product p = catalogue.get(code);
        if (p == null) throw new IllegalArgumentException("Unknown product code: " + code);
        return p;
    }

    public List<Offer> offers() { return offers; }
}
