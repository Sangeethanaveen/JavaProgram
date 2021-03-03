package javafundamental.Assignment;

import java.util.Scanner;

//Add 3 to ascii value of char
/*
Get a char
covert to ascii
add 3 to it
print the value
 */
public class AsciiAdd {
    public static void main(String[] args) {
        char value;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        value = input.next().charAt(0);
        int ascii = (int) value;
        int sum = ascii+3;
        System.out.println("The sum:"+sum);
    }
}
