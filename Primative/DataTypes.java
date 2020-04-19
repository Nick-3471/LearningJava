package Primative;

import java.text.NumberFormat.Style;

public class DataTypes {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is my string";
        System.out.println("My String is equil to " + myString);

        myString = myString + ", living the good live";
        System.out.println( myString);

        myString = myString + "\u00A9 2020";
        System.out.println(myString);
    }

}