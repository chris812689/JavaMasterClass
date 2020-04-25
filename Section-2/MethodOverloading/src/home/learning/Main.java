package home.learning;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Chris", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(450);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored =" + score + "points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Robot scored =" + score + "points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player No Score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double converted = feet * 12;
            converted = converted + inches;
            converted = converted * 2.54;
            System.out.println(converted + "cm");
            return converted;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
        }
        return -1;
    }

    public static double calcStandardToMetric(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        return centimeters;

    }

    public static double calcStandardToMetric(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remiainingInches = (int) inches % 12;
        System.out.println(inches + "Inches is = " + feet + " feet and " + remiainingInches + "inches");
        return calcStandardToMetric(feet, remiainingInches);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }
        int calcHours = minutes / 60;
        minutes = minutes % 60;
        seconds = seconds % 60;
        return (calcHours + "h " + minutes + "m" + seconds + "s");

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double total = radius * radius * Math.PI;
        return total;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1;
        }
        double total = x * y;
        return total;
    }

    public static void printYearsandDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 60 / 24;
            long years = days / 365;
            days = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}