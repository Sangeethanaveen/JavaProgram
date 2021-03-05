package javafundamental.BasicProgram2;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        int num, count = 0, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = input.nextInt();
        while (num != 0) {
            sum = sum+num%10;
            num = num / 10;
        }
        System.out.println("sum of given digit is "+sum);
    }
}
