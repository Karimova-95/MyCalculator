package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyCalculatorDeque {
    static int calculate(String input) {
        Deque<Character> calc = new ArrayDeque<>();
        int result = 0;
        boolean resultIsWritten = false;
        for (char simb : input.toCharArray()) {
            if (simb != ' ' && simb >= '0' && simb <= '9') {
                calc.addLast(simb);
                if (resultIsWritten == false) {
                    result = Integer.parseInt(String.valueOf(calc.pollFirst()));
                    resultIsWritten = true;
                }
            } else {
                if (simb == '+') {
                    result += Integer.parseInt(String.valueOf(calc.pollFirst()));
                }
                if (simb == '-') {
                    result -= Integer.parseInt(String.valueOf(calc.pollFirst()));
                }
                if (simb == '*') {
                    result *= Integer.parseInt(String.valueOf(calc.pollFirst()));
                }
            }
        }
        return result;
    }
}
