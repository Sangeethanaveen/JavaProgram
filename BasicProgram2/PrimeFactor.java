package javafundamental.BasicProgram2;

import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        System.out.println();
        for(int i=2;i<number;i++){
            while(number%i==0){
                System.out.println(+i+"\t");
                number=number/i;
            }
            if(number>2)
                System.out.println(number);
        }
    }
}

