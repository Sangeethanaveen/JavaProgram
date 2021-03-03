package javafundamental.Assignment;
import java.util.Scanner;
/*
Get 10 values
add the value
divide the sum/10
print the output
 */

public class LoopAvgOfNum {
    public static void main(String[] args) {
        int avg,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            int val = input.nextInt();
            sum = sum+val;
        }
        System.out.println("The sum is"+sum);
        avg = sum/10;
        System.out.println("The avg is "+avg);
    }
}
