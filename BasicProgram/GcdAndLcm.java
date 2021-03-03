package javafundamental.Assignment;

import java.util.Scanner;
/*
Get 2 numbers
find the num that perfectly divides 2 number
store the largest value
print the result of gcd
lcm = prdt of 2 num/gcd
print the result;
 */

public class GcdAndLcm {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Enter 2 numbers");
        int gcd=1;
        Scanner input = new Scanner(System.in);
        num1=input.nextInt();
        num2=input.nextInt();
        System.out.println("Enter the count of numbers");
        for(int i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0&&num2%i==0)
                gcd=i;
        }
        System.out.println("GCD of " +num1+ " and " +num2+ " is :" +gcd);
        int lcm = (num1*num2)/gcd;
        System.out.println("LCM of " +num1+ " and " +num2+ " is :" +lcm);

    }
}
