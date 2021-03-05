package javafundamental.BasicProgram2;

import java.util.Scanner;
/*
get 2 numbers numerator & denominator
get the gcd of 2 numbers
divide numerator & denominator by gcd
print the value
 */
public class ConvertFraction {
    public static void main(String[] args) {
        int numerator,denominator;
        System.out.println("Enter 2 numbers");
        int gcd=1;
        Scanner input = new Scanner(System.in);
        numerator=input.nextInt();
        denominator=input.nextInt();
        //System.out.println("Enter the count of numbers");
        for(int i=1;i<=numerator&&i<=denominator;i++){
            if(numerator%i==0&&denominator%i==0)
                gcd=i;
        }
        int fNumerator=numerator/gcd;
        int fDenominator=denominator/gcd;
        System.out.println("The fraction "+numerator+"/"+denominator+" is converted into "+fNumerator+"/"+fDenominator);
    }
}


