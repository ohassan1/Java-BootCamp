package com.company;

public class Main {

    public static void main(String[] args) {
        // oldest and youngest are initialized they way they are purposely. They will be changed.

        int age[] = new int[]{32, 25, 56, 12, 20, 22, 19, 54, 22, 19, 54, 22, 72, 65, 16, 88, 4},
                oldest = 0, youngest = 200;

        int numOfKids = 0;
        int numOfAdults = 0;
        int numOfSeniors = 0;
        int dummyVariable;


        //arrays are null to be set at a later time in code
        int minor[];
        int major[];
        int senior[];

        for (int i = 0; i < age.length; i++) {
            // Finding the oldest and youngest in the array

            while (age[i] > age[i-1])
            {
                dummyVariable = age[i+1];
                age[i+1] = age[i];
                age[i] = dummyVariable;
            }

            if (oldest < age[i]) {
                oldest = age[i];
            }

            if (youngest > age[i]) {
                youngest = age[i];
            }

            // making hash sizes for age-range arrays

            if (age[i] < 18) {
                numOfKids++;
            }

            if (age[i] < 65 && age[i] > 18) {
                numOfAdults++;
            }

            if (age[i] >= 65) {
                numOfSeniors++;
            }
        }
        // initializing hashes
        minor = new int[numOfKids];
        major = new int[numOfAdults];
        senior = new int[numOfSeniors];

        // variables for indexing through numOfPeople in forloop after this, x-kids y-adult z-senior
        int x = 0, y = 0, z = 0;

        // sorting and Assigning ages to people
        for (int i = 0; i < age.length; i++) {

            if (age[i] < 18) {
                minor[x++] = age[i];
            }

            if (age[i] < 65 && age[i] > 18) {
                major[y++] = age[i];
            }

            if (age[i] >= 65) {
                senior[z++] = age[i];
            }
        }

        // Display the new arrays
        System.out.println("MINORS: ");

        for (int j = 0; j < numOfKids; j++) {
            System.out.println("age " + "[" + j + "] " + minor[j]);
        }

        System.out.println("MAJORS: ");

        for (int i = 0; i < numOfAdults; i++) {
            System.out.println("age " + "[" + i + "] " + major[i]);
        }

        System.out.println("SENIORS: ");

        for (int i = 0; i < numOfSeniors; i++) {
            System.out.println("age " + "[" + i + "] " + senior[i]);
        }

        System.out.println("The most senior person is of age is: " + oldest);
        System.out.println("The most junior person is of age is: " + youngest);
    }
}
