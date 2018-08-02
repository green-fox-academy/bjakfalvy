public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14; //50,400 sec
        int currentMinutes = 34; //2040 sec
        int currentSeconds = 42; // 42 sec
        //24 hours is 86,400 sec
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        System.out.println(86400 - (currentHours*60*60+currentMinutes*60+currentSeconds) + " seconds is left until midnight.");

    }
}
