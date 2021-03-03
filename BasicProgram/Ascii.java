package javafundamental.Assignment;

import java.util.Scanner;
/*Get a char
convert to int
print the int value*/

public class Ascii {
    public static void main(String[] args) {
        char value;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character");
        value = input.next().charAt(0);
        int ascii = (int)value;
        System.out.println("The ascii value is "+ascii);



    }
}
