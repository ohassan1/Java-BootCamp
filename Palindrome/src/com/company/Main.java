package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuilder palindrome = new StringBuilder("racecar");


        if (palindrome == palindrome.reverse())
        {
            System.out.println("This is a palindrome!!!!");
        }


    }
}
