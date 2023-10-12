package com.conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;


        System.out.println("************** CALCULATOR ********************");
        while (true) {
            System.out.print("Enter Operators (+ - * / %) or to exit press (x) :");
            char op = sc.next().trim().charAt(0);


            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter Two Numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (op == '+') {
                    result = a + b;
                } else if (op == '-') {
                    result = a - b;
                } else if (op == '*') {
                    result = a * b;
                } else if (op == '/') {
                    if (b != 0) {
                        result = a / b;
                    } else {
                        result = 0;
                    }
                } else if (op == '%') {
                    result = a % b;
                }
                System.out.println("Result: " + result);
            } else if (op == 'X' || op == 'x') {
                System.out.println("Thanks for Coming!");
                break;
            } else {
                System.out.println("Oops! Invalid Operators");
            }
        }


    }
}
