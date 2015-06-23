package com.company;

public class Main {

    public static void main(String[] args) {
        String originalString =  "racecar is a palindrome";

        // Split the string into words with the for loop
        for (String splitString : originalString.split(" ")) {
            // StringBuilders to allow manipulation
            StringBuilder sb = new StringBuilder(splitString);

            StringBuilder sb2 = new StringBuilder(sb);

            // Error check
            if (sb.length() >= 2) {
                if (String.valueOf(sb).equals(String.valueOf(sb2.reverse()))) {
                    System.out.println("'" + sb + "'" + " IS A PALINDROME!");
                } else {
                    System.out.println("Nah Fam, " + "'" + sb + "'" + " is a regular word");
                }
            } else {
                System.out.println("Nah fam, you need at least 2 letters for palindrome");
            }

            System.out.println(" ");
        }
    }
}
