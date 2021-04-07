/*
The methods in this exercises can be static and they can be invoked from the main method for testing.

1 - Prettify
Prettifying a string means to print the string in the standard output with the characters that appear side by side separated by a character chosen by the user.

You should write a method that takes a string and the separating character and prettifies the string using the separating character. In addition make sure to get the separating character from the user via the standard input.
 */

import java.util.Scanner;

public class ss21_prettify {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Pls specify your string: ");
    String textToPrettify = input.nextLine();

    System.out.println("Pls specify the prettify character: ");
    char prettifyChar = input.next().charAt(0);

    System.out.println("Text to prettify :");
    System.out.println(prettify(textToPrettify, prettifyChar));
    }

    public static String prettify(String text, char separator){
        // split = s.split("");
        String prettified = "";
        for (String temp : text.split("")){
        prettified = prettified + temp + separator;
        }
        return prettified;
    }
}
