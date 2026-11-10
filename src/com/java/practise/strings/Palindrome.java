package com.java.practise.strings;


public class Palindrome {

    static void main() {
        String str = "babad";
        String reverse = "";
        for(int i=str.length()-1 ;i>=0; i--){
             reverse += String.valueOf(str.charAt(i));
        }

        System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
