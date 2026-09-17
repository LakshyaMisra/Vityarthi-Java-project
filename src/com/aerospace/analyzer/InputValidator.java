package com.aerospace.analyzer;

import java.util.Scanner;

public class InputValidator {
    public static double getPositiveDouble(Scanner scanner, String prompt) {
        double value = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a value greater than zero.");
                }
            } else {
                System.out.println("Error: Invalid numeric input. Try again.");
                scanner.next();
            }
        }
        return value;
    }

    public static int getPositiveInt(Scanner scanner, String prompt) {
        int value = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid integer input. Try again.");
                scanner.next();
            }
        }
        return value;
    }
}