package Primative;

public class FloatDouble {

    public static void main(String[] args) {
    
    //Float Stuff
    float floatMinValue = Float.MIN_VALUE;
    float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMinValue);
        System.out.println(floatMaxValue);

    //Double Stuff
    double doubleMinValue = Double.MIN_VALUE;
    double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMinValue);


    //Float & Double notation
    int myInt = 5 / 3;
    float myFloat = 5f / 3f;
    double myDouble = 5.00 / 3.00;
    System.out.println(myInt);
    System.out.println(myFloat);
    System.out.println(myDouble);


    //Fun Project
    Double pounds = 5d;
    Double kilograms = pounds *.45359237;
    System.out.println(pounds + "lb is equal to " + kilograms +"kg");
    }
}