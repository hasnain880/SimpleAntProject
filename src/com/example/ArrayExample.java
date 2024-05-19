package src.com.example;
// src/com/example/ArrayExample.java

//package com.example;

public class ArrayExample {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Print the numbers stored in the array
        System.out.println("Numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        // Calculate and print the sum of the numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
