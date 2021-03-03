package javafundamental.Assignment;

import java.util.Scanner;
/*
Get a value
check if less than 0
then multiply (-1)
else
print value
 */

public class AbsoluteNumber {
    public static void main(String[] args) {
        int val;
        System.out.println("Enter an Integer");
        Scanner input = new Scanner(System.in);
        val = input.nextInt();
        if (val < 0) {
            val = -1 * val;
            System.out.println("The absolute value is " + val);

        } else
            System.out.println("The absolute value is " + val);

    }
}
