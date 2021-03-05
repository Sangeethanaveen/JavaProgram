package javafundamental.BasicProgram2;

import java.util.Scanner;
/*
Get a number
Module the number by 10
store the number by mul by 10 and add reminder
remove the last digit(divide by 10)
print the result
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int num, count = 0, n;
        int evenSum = 0, oddSum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = input.nextInt();
        //to get rev of number
        int reverse=0;
        while (num != 0) {
            reverse = (reverse*10)+(num%10);
            num = num / 10;
            ++count;
        }
        System.out.println(reverse);

    }

}
