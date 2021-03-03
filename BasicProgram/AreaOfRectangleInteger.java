package javafundamental.Assignment;

import java.util.Scanner;
/*Get the value of length & breath
Multiply the value
convert to int
print the result*/
public class AreaOfRectangleInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        float length = input.nextFloat();
        System.out.println("Enter breath of rectangle ");
        float breath = input.nextFloat();
        int area = (int) (length*breath);
        System.out.println("area of rectangle = "+area);
    }
}
