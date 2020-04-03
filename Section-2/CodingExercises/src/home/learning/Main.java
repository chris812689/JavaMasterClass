package home.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if( kilometersPerHour <= 0 ){
            return -1;
        } else{
            return Math.round(kilometersPerHour/1.609);

        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h=" + milesPerHour + "mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes <= 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes /1024;
            int kiloBytesRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes +" MB and "+ kiloBytesRemainder + "KB");
        }
    }
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if(barking == false){
            return false;
        }
        if (hourOfDay > 23 | hourOfDay < 0 ){
            return false;
        } else if (hourOfDay < 8 | hourOfDay >=23){
            return true;
        } return false;
    }
    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 == 0) {
                    return true;
                } else return year % 100 != 0 || year % 400 == 0;
            }
            return false;
        }
        return false;
    }
