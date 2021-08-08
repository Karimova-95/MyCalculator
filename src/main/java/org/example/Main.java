package org.example;

public class Main {
    public static void main(String[] args) {
        int resDeque = MyCalculatorDeque.calculate("3 9 7 + -");
        System.out.println(resDeque);
        int resStack = MyCalculatorStack.calculate("3 9 7 + -");
        System.out.println(resStack);
    }
}
