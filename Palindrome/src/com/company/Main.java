package com.company;

public class Main {

    public static void main(String[] args) {
        String palindrome =  "racecar";

        char[] testArray = new char[palindrome.length()];


        for (int i = palindrome.length(); i > 0; i--) {
            testArray[i-1] = palindrome.charAt(palindrome.length() - (i));
        }

        String reverse = new String(testArray);

        if (palindrome.equals(reverse))
        {
            System.out.println("This is a palindrome!!!!");
        } else {
            System.out.println("This is not a palindrome :((((");
        }


    }
}
