package javafundamental.Assignment;
/*
Get no of line to be printed in for loop
another for loop for no of * to be printed
 */

public class PatternPrint {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
