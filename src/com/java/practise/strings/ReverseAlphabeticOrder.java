package com.java.practise.strings;

//Reverse a String in Alphabetic Order

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAlphabeticOrder {

    static void main() {


        String str = "debac";

        String reverse = Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        System.out.println("Reverse String in Alphabetic Order : " +reverse);

    }
}
