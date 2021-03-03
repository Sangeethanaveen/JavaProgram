package javafundamental.Assignment;

import java.util.Scanner;

/*
Get the value ot table
in loop
print the value
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int val,prdt;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Multiplication table to be printed");
        System.out.println();
        int n=input.nextInt();
        int i=1;
        while(i<=5)
        {
            val =i*n;
            System.out.println(n+" * "+i+" = "+val);
            i++;
        }
    }
}
