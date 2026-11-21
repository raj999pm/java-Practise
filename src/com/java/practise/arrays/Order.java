package com.java.practise.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Order {



    static void main() {
        CheckOut co = new CheckOut();
        co.scan("SF1");
        co.scan("CF1");
        co.scan("FR1");

        double price = co.total();
    }
}
