package javafundamental.Assignment;
/*
Initialize i value
covert the int to ascii
print the result
 */
public class AsciiValues {
    public static void main(String[] args) {
        int i =0;
        while(i<=255){
            System.out.println("The ASCII value of "+(char)i+" = "+i);
            i++;
        }
    }
}
