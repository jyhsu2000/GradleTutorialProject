package org.example;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 1;
        int b = 2;
        CustomCalculator calculator = new CustomCalculator();
        int c = calculator.add(a, b);
        System.out.println(MessageFormat.format("{0} + {1} = {2}", a, b, c));
    }
}