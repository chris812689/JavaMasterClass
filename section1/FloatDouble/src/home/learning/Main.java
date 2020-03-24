package home.learning;

public class Main {

    public static void main(String[] args) {
	    float myMinFloat = Float.MIN_VALUE;
	    float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloat);
        System.out.println("Float Maximum value = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMinDouble);
        System.out.println("double Maximum value = " + myMaxDouble);

        int myIntValue =5 /3;
        float myFloatValue =5f /3f;
        double myDoubleValue = 5d /3d;

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue );
        System.out.println("My Double Value = " + myDoubleValue);

        //challenge

        double lbs = 200;
        double kg = 0.45359237;
        double Final = lbs * kg;
        System.out.println(Final);
    }
}
