package javafundamental.Assignment;

import java.util.Scanner;
/* get a double value
typecast
use round operation
Print the integer value
 */

public class ConvertDoubleToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value");
        double value = input.nextDouble();
        int convert = (int) value;
        System.out.println("The double is converted to int "+convert);
        System.out.println("The value is rounded to "+Math.round(value));

    }
}
