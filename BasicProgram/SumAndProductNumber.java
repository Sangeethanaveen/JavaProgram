package javafundamental.Assignment;

import java.util.Scanner;

/*
Get 2 numbers
add 2 numbers
multiply 2 numbers
print result
 */
public class SumAndProductNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 integer");
        num1=input.nextInt();
        num2=input.nextInt();
        int sum = num1+num2;
        int product = num1*num2;
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);

    }
}
