package com.conditionals;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Create a program to regenerate the reverse of the given number

        System.out.print("Enter Number:");
        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {
            int rem = n % 10;

            reverse = reverse * 10 + rem;

            n = n / 10;
        }
        System.out.println("revese: " + reverse);

    }
}
