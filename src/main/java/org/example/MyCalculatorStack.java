package org.example;

import java.util.Stack;

public class MyCalculatorStack {
    static int calculate(String input) {
        int result = 0;
        boolean resultIsWritten = false;
        Stack<Character> stackA = new Stack<>();
        Stack<Character> stackB = new Stack<>();

        for (char simb : input.toCharArray()) {
            if (simb != ' ' && simb >= '0' && simb <= '9') {
                stackA.add(simb);
                if (resultIsWritten == false) {
                    result = Integer.parseInt(String.valueOf(stackA.pop()));
                    resultIsWritten = true;
                }
            } else {
                if (stackB.isEmpty()) {
                    for (Character character : stackA) {
                        stackB.add(stackA.peek());
                    }
                }
                if (simb == '+') {
                    result += Integer.parseInt(String.valueOf(stackB.pop()));
                }
                if (simb == '-') {
                    result -= Integer.parseInt(String.valueOf(stackB.pop()));
                }
                if (simb == '*') {
                    result *= Integer.parseInt(String.valueOf(stackB.pop()));
                }
            }
        }
        return result;
    }
}
