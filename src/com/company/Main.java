package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.next();
        System.out.println("Enter a char: ");
        char character = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i) ) {
                count++;
            }
        }
        System.out.println("Number of occurrenes of character" + character + " in the string is: " + count);
    }
}
