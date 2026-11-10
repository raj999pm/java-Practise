package com.java.practise.strings;


public class Palindrome {

    static void main() {
        String string = "babad";
        String reverse = "";
        for(int i=0; i<string.length(); i++){
             reverse += String.valueOf(string.charAt(i));
        }

        if(reverse.equals(string)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
