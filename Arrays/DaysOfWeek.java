package javafundamental.Arrays;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        String[] daysInWeek = {"Monday", "tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num between 0 to 6");
        int days = input.nextInt();
        System.out.println("The correspoding day is");
        if ((days < 7) && (days >= 0)) {
            System.out.println(daysInWeek[days]);

        } else
            System.out.println("enter a valid number");

    }
}
