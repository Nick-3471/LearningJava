package Primative;

public class ByteShortIntLong {

    public static void main(String[] args) {
        

        //Integer Stuff
        int myValue = 10_000;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
            System.out.println(minValue);
            System.out.println(maxValue);
            System.out.println(myValue);

        //Byte Stuff
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
            System.out.println(byteMinValue);
            System.out.println(byteMaxValue);

        //short Stuff
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
            System.out.println(shortMinValue);
            System.out.println(shortMaxValue);

        //long Stuff
        long myLongVaule = 2_147_483_648L;
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
            System.out.println(myLongVaule);
            System.out.println(longMinValue);
            System.out.println(longMaxValue);

        //Type Casting Variables
        byte myNewByte = (byte)(byteMaxValue/2);
        short myNewShort = (short)(shortMaxValue/2);
        long myNewLong = (myLongVaule /2);

        byte myByte = 26;
        short myShort = 25497;
        long testLong = (50_000 + (10*(myValue + myShort + myByte)));
        System.out.println(testLong);
    }
}