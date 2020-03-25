package home.learning;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);
        result = result - 1;
        System.out.println(" 3 - 1 = " + result);

        result = result * 10;
        System.out.println(" 2 * 10 = " + result);

        result = result /5;
        System.out.println(" 20 / 5 = " +  result);

        result = result % 3;
        System.out.println("4 / 3 with a remainder of " + result);

        result++;
        System.out.println( "1 + 1 = " + result );

        result --;
        System.out.println(" 2 - 1 = " + result);

        //result = result + 2
        result+=2;
        System.out.println("1 + 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("and I am scared of aliens");
        }

        int topScore = 80;
        if(topScore != 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 95;
        if ((topScore> secondTopScore) && (topScore< 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        //Operator Challenge

        double varOne = 20.0d;
        double varTwo = 80.0d;
        double varSum = (varOne + varTwo) * 100;
        varSum = varSum % 40.00d;
        if( varSum == 0){
            System.out.println("No Remainder");
        } else {
            System.out.println("there is a remainder");
        }
    }
}
