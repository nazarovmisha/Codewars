package kyu5;

//https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java



public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(1));
    }

    public static String makeReadable(int seconds) {
        int hours = 0;
        int minutes = 0;
        if ((seconds / 60 / 60) > 0) {
            hours = seconds / 60 / 60;
            seconds -= (hours * 3600);
        }
        if ((seconds / 60) > 0) {
            minutes = seconds / 60;
            seconds -= minutes * 60;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
