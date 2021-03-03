package javafundamental.Assignment;
/*
 Inialize the loop to 5
 upper part
 increment value by 2
 lower part
 decrement value by 2
 */
public class PatternPrint2 {
    public static void main(String[] args) {
        int n=5;
        //upper part
        for(int i=0;i<n;i=i+2) {
            for (int j = 0; j <=i; j=j+1) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        //lower part
        for(int i=n-2;i>0;i=i-2){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println("\n");
        }
    }
}

