package javafundamental.Assignment;

import java.util.Scanner;
/*
Get length & breath of rect
area = l*b
perimeter = 2(l*b)
print result
 */

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        float length = input.nextFloat();
        System.out.println("Enter breath of rectangle ");
        float breath = input.nextFloat();
        double area = length*breath;
        System.out.println("area of rectangle = "+area);
        float perimeter = 2*(length+breath);
        System.out.println("perimeter of rectangle "+perimeter);
    }
}
