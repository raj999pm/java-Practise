package com.java.practise.companies.epam;

//Input: n = 1 Output: ["()"]
//Input: n = 3 Output: ["((()))","(()())","(())()","()(())","()()()"]

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Paranthesis {

    static void main() {
        System.out.println("Hello World");

        int n = 3;
        String open = "(";
        String close = ")";

        String result = "[";

            for(int i = 0 ; i<n ; i++){

                result +=   open + close;

            }

            result +=  "]";

        System.out.println(result);

        System.out.println(format(generateParenthesis(1)));
        System.out.println(format(generateParenthesis(3)));


    }

    static String format(List<String> list) {
        return list.stream()
                .map(s -> "\"" + s + "\"")
                .collect(Collectors.joining(",", "[", "]"));
    }

    static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    static void backtrack(List<String> result, StringBuilder current, int open, int close, int n) {
        if (current.length() == 2 * n) {          // used all pairs
            result.add(current.toString());
            return;
        }
        if (open < n) {                            // can still add "("
            current.append('(');
            backtrack(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1);   // undo
        }
        if (close < open) {                        // can add ")" only if it matches an open one
            current.append(')');
            backtrack(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1);   // undo
        }
    }
}
