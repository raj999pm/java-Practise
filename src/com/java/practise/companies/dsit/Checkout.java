package com.java.practise.companies.dsit;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 *
 *
 *
 *
 * question to the progran
 * A supermarket checkout system sells the following products:
 *
 * Product	         Code	Price
 * Fruit Tea	     FR1	£3.11
 * Strawberries	     SR1	£5.00
 * Coffee	         CF1	£11.23
 * Special Offers
 *
 * Buy One, Get One Free on Fruit Tea (FR1).
 *
 * Example:
 * FR1, FR1 → £3.11
 * FR1, FR1, FR1, FR1 → £6.22
 *
 * Bulk Discount on Strawberries (SR1).
 *
 * If 3 or more strawberries are purchased, each costs £4.50 instead of £5.00.
 *
 * Example:
 * SR1, SR1 → £10.00
 * SR1, SR1, SR1 → £13.50
 * Expected Output
 * Basket	Total
 * FR1, SR1, FR1, FR1, CF1	£22.45
 * FR1, FR1	£3.11
 * SR1, SR1, FR1, SR1	£16.61
 * (empty basket)	£0.00
 * Requirements
 *
 * Implement a checkout system with the following API:
 *
 * Java
 * PricingRules = ...;
 *
 * Checkout = new Checkout(pricingRules);
 *
 * checkout.scan("FR1");
 * checkout.scan("SR1");
 * checkout.scan("FR1");
 * checkout.scan("FR1");
 * checkout.scan("CF1");
 *
 * BigDecimal total = checkout.total();
 *
 * The solution should:
 *
 * Follow Object-Oriented Design principles.
 * Be extensible for future offers.
 * Separate products from pricing rules.
 * Support multiple offer types.
 * Avoid hardcoding discounts inside the checkout class.
 * Include automated tests.
 */


public class Checkout {

    private final PricingRules rules;
    private final Map<Product, Integer> basket = new LinkedHashMap<>();

    public Checkout(PricingRules rules) { this.rules = rules; }

    public void scan(String productCode) {
        basket.merge(rules.find(productCode), 1, Integer::sum);
    }

    /** Total in pounds, e.g. 22.45. Money is held internally as integer pence. */
    public BigDecimal total() {
        int pence = 0;
        for (Map.Entry<Product, Integer> e : basket.entrySet()) {
            pence += e.getKey().pricePence() * e.getValue();
        }
        for (Offer offer : rules.offers()) {
            pence -= offer.discountPence(basket);
        }
        return BigDecimal.valueOf(pence, 2);
    }
}
