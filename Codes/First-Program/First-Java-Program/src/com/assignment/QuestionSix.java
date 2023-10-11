package com.assignment;

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rupee: ");
        float rupees = sc.nextFloat();

        double usd = rupees * 0.0036;
        System.out.println("in USD "+ usd + "$");

    }
}
