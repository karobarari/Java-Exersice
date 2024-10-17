package Activity;
//Write a program that checks whether a given string
//is a palindrome (reads the same forward and backward).

import java.util.Scanner;

public class Palindrom_Checker {
//Ignore case and spaces while checking.
//Purpose: check if a srring reads the same forward and backward.
//steps:
//1. ignore case and spelling
//2. turn into a compairable data type(maybe array)
//3. compare efficiently
//4. return the result if the answer is true or false

    //I need to creat 2 functions 1 for checking if the word is
    //palindorme and one for interacting with user
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = word.toCharArray();

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
    }
}
