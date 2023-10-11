package com.firstprogram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
//        float num = sc.nextFloat();
//        System.out.println(num);

//        Type casting
        int num = (int) 234.56f;
//        System.out.println(num);

//        desination type is greater than source type it store its value
//        but source type is greater than destination type it generates an error


        int myChar = 'A';
//        System.out.println(myChar);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
////      40*50 = 2000/100 = 20
//        System.out.println(d);


//        byte b = 50;
//        b = (b * 2); // => this produce integer value which give an error in compile time
//        System.out.println(b);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


    }
}
