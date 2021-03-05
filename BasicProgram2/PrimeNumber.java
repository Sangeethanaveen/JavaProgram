package javafundamental.BasicProgram2;

public class PrimeNumber {
    public static void main(String[] args) {
        int prime = 0;
        int i, j;
        System.out.println("Prime numbers from 1 to 100");
        for (i = 2; i <= 100; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    prime++;
            }
            if (prime == 2)
                System.out.print(+ i+"\t");
            prime = 0;
        }
    }
}

