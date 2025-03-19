package ex_12_Strings;
////Write a Java program to parse the given string ("1hr 5min 6s 10ms")
///  and calculate the total duration in minutes.

public class Interview_Q1 {
    public static void main(String[] args) {
        String given = "1hr 5min 6s 10ms";

        String[] given_arr = given.split(" ");
        int hours = 0, min = 0, sec = 0, msec = 0;

        for (String s : given_arr) {
            if (s.endsWith("hr")) {
                hours = Integer.parseInt(s.substring(0, (s.length() - 2)));
            } else if (s.endsWith("min")) {
                min = Integer.parseInt(s.substring(0, (s.length() - 3)));
            } else if (s.endsWith("ms")) {
                msec = Integer.parseInt(s.substring(0, (s.length() - 2)));
            } else if (s.endsWith("s")) {
                sec = Integer.parseInt(s.substring(0, (s.length() - 1)));
            }
        }
        System.out.println(" Hours = " + hours + " Min = " + min + " Sec = " + sec + " ms= " + msec);

        float timeInMin=( hours *60) + min + (float)sec/60 + (float) msec/60000 ;
        System.out.println(" Time in Min = "+timeInMin);
    }
}