package javafundamental.Assignment;

import java.util.Scanner;

public class BinaryPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i > 1; i = i - 2) {
            for (int j = i; j > 0; j = j - 1) {
                System.out.print((j % 2));
            }
            System.out.println();
        }
        System.out.println(n%2);

    }
}
