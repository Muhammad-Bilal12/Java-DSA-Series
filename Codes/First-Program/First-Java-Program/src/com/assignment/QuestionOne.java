package com.assignment;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer value: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }


    }
}
