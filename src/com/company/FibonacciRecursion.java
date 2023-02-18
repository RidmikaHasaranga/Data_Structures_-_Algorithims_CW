package com.company;

import java.util.Scanner;

public class FibonacciRecursion {
    public static int FRecursion(int number){
        if (number <= 0){
            System.out.println("Number must be non zero positive number");
        }
        else if (number == 1){
            return 0;
        }
        else if (number == 2){
            return 1;
        }
        else {
            return FRecursion(number-1) + FRecursion(number-2);
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        System.out.println(FRecursion(number));
    }
}
