package com.firstprogram;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Write something on console: ");
//        System.out.println(input.next());

        System.out.print("What is your age: ");
        int age = input.nextInt();

        System.out.print("What's your name: ");

//      String name = input.next();

//        nextLine() method also reads the buffer value which makes some error in our code
//        like if we first used nextInt then used nextLine() it makes flow error

//       input.next(); // used for handle buffer values
        // Consume the newline character left in the buffer
        input.nextLine();

        System.out.print("");
        String name = input.nextLine();

        /*
         * Difference between next() and nextLine()
         * if we want to get string without any space or single word string we used next() method
         * eg: Bilal, word, excel ....
         * and if we want to get multi string with space we used nextLine() method
         * eg: multi word string, lorem ipsum saec,.....
         * */

        System.out.println(age);
        System.out.println(name);

    }
}







