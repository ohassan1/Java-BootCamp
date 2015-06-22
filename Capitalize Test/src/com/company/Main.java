package com.company;

public class Main {

    public static void main(String[] args)
    {
        String mySentence = "da dafs asdfa.";
        char c = Character.toUpperCase(mySentence.charAt(0));

        mySentence = c + mySentence.substring(1);

        for (int i = 0; i < mySentence.length(); i++)
        {
            if (mySentence.charAt(i)==' ')
            {
                c = (Character.toUpperCase(mySentence.charAt(i+1)));
                mySentence = mySentence.substring(0, i) + " " + c + mySentence.substring(i+2);

            }
        }

        System.out.println(mySentence);
    }
}
