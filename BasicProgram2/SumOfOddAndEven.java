package javafundamental.BasicProgram2;

import java.util.Locale;
import java.util.Scanner;

//find the sum of the even and odd digits of the number which is given as input
/*
Get a number
reverse a num -->by applying modulus
extract odd digit and place in even digit
take sum in alternative turns
 */
public class SumOfOddAndEven {
    public static void main(String[] args) {
        int num, n,count=0;
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
        //sum odd and even digits
        int c=1;
        while(reverse!=0){
            if(c%2==0){
                evenSum=evenSum+(reverse%10);
            }
            else
                oddSum=oddSum+(reverse%10);
            reverse=reverse/10;
            c++;
        }
        System.out.println("Sum odd= "+oddSum);
        System.out.println("Sum even="+evenSum);
    }
}



