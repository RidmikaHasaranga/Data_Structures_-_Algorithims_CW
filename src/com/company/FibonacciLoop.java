package com.company;

import java.util.Scanner;

public class FibonacciLoop {
    public static void main(String[] args) {
        int output = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int number = input.nextInt();

        int[] num = new int[number];

        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i < number; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        System.out.print("Fibonacci Series up to given number: ");
        for (int i = 0; i < number; i++) {
            System.out.print(num[i] + " ");
            output = num[i];
        }
        System.out.println("\nFibonacci value of a given number: " + output);
    }
}
