package com.company;

public class test {

    public static void main(String[] args) {

        int age[] = new int[]{32, 25, 56, 12, 20, 22, 19, 54, 22, 19, 54, 22, 72, 65, 16, 88, 4};

        for (int i = 0; i < age.length; i++)
        {
            for (int j = 1; j < age.length; j++)
            {
                if (age[j] < age[i])
                {
                    int dummyVariable = age[j];
                    age[j] = age[i];
                    age[i] = dummyVariable;
                }
            }
        }

        for (int j = 0; j < age.length; j++)
        {
            System.out.println(age[j] + " ");
        }
    }
}
