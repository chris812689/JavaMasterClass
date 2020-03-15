package home.learning;

public class Main {

    public static void main(String[] args) {

        int myValue =10000;

        int myMinValue= Integer.MIN_VALUE;
        int myMaxvalue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinValue);
        System.out.println("Integer Maximum Value = " + myMaxvalue);
        System.out.println("Busted MAX value = " + (myMaxvalue +1));
        System.out.println("Busted Min value = " + (myMinValue -1));

        int myMaxIntTest = 2147483647;
        byte byteMinValue= Byte.MIN_VALUE;
        byte byteMaxvalue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + byteMinValue);
        System.out.println("Byte Maximum Value = " + byteMaxvalue);

        long longMinValue= Long.MIN_VALUE;
        long longMaxvalue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + longMinValue);
        System.out.println("Long Maximum Value = " + longMaxvalue);

        short shortMinValue= Short.MIN_VALUE;
        short shortMaxvalue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + shortMinValue);
        System.out.println("Short Maximum Value = " + shortMaxvalue);
    }
}
