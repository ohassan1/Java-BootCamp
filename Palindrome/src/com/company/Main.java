package com.company;

public class Main {

    public static void main(String[] args) {
        String originalString =  "This is a test to tell if the code can handle a longer sentence but really i am just bored and I don't think there is a single palindrome in this so... bob BOB Bob pop racecar";


        System.out.println("Here are your palindromes from you sentence: ");

        // Split the string into words with the for loop, toLower is to get rid of capitalization errors
        for (String splitString : originalString.toLowerCase().split(" ")) {

            // StringBuilders to allow manipulation
            StringBuilder words = new StringBuilder(splitString);

            StringBuilder reversedStringSplits = new StringBuilder(words);

            // Error checking
            if (words.length() >= 2) {
                if (String.valueOf(words).equals(String.valueOf(reversedStringSplits.reverse()))) {
                    System.out.println("'" + words + "'" + " IS A PALINDROME!");
                } else {
                    System.out.println("Nah Fam, " + "'" + words + "'" + " is a regular word");
                }
            } else {
                System.out.println("Nah fam, you need at least 2 letters for palindrome");
            }


            System.out.println(" ");
        }
    }
}
