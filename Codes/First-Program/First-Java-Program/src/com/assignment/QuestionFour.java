package com.assignment;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {

//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Operator ( +,-,x,/ ): ");
        String op = sc.next();

        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();

        double result = 0;

        if (op.equals("+")) {
            result = num1 + num2;
        }
        if (op.equals("-")) {
            result = num1 - num2;
        }
        if (op.equals("x")) {
            result = num1 * num2;
        }
        if (op.equals("/")) {
            result = ((double) num1 / num2);
        }

        System.out.println(result);


    }
}
