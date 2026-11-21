package com.java.practise.companies.dsit;

import java.math.BigDecimal;
import java.util.List;

public class CheckoutTest {
    static PricingRules rules() {
        return new PricingRules(
                List.of(new Product("FR1", "Fruit tea", 311),
                        new Product("SR1", "Strawberries", 500),
                        new Product("CF1", "Coffee", 1123)),
                List.of(new BuyOneGetOneFree("FR1"),
                        new BulkDiscount("SR1", 3, 450)));
    }

    static int failures = 0;

    static void check(String expected, String... codes) {
        Checkout co = new Checkout(rules());
        for (String c : codes) co.scan(c);
        BigDecimal actual = co.total();
        boolean ok = actual.compareTo(new BigDecimal(expected)) == 0;
        if (!ok) failures++;
        System.out.println((ok ? "PASS " : "FAIL ") + String.join(",", codes) + " -> £" + actual);
    }

    public static void main(String[] args) {
        check("22.45", "FR1", "SR1", "FR1", "FR1", "CF1");
        check("3.11", "FR1", "FR1");
        check("16.61", "SR1", "SR1", "FR1", "SR1");
        check("0.00");                                   // empty basket
        check("6.22", "FR1", "FR1", "FR1", "FR1");       // 4 teas = pay for 2
        check("10.00", "SR1", "SR1");                    // no bulk discount yet
        if (failures > 0) System.exit(1);
    }
}
