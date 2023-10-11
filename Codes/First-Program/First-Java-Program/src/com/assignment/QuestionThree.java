package com.assignment;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        Formula: Simple Interest (SI) = (P × R × T) / 100

        System.out.print("Enter the amount of Pricipal: ");
        int principal = sc.nextInt();

        System.out.print("Enter the amount of time: ");
        int time = sc.nextInt();

        System.out.print("Enter the amount of rate: ");
        int rate = sc.nextInt();


        float si = (principal*time*rate)/100;
        System.out.println(si);


    }
}
