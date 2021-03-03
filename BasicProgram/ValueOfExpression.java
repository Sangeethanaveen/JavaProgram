package javafundamental.Assignment;
/*
Intialise the value for x=2,y=5,z=0
print the value of  following expression
x==2
x!=5
x!=5&&y>=5
z!=0||x==2
!(y<10)
 */
public class ValueOfExpression {
    public static void main(String[] args) {
        int x=2,y=5,z=0;

        System.out.println("The value of expression(x==2) is "+(x==2));//true
        System.out.println("The value of expression(x!=5) is "+(x!=5));//true
        System.out.println("The value of expression(x!=5&&y>=5) is "+(x!=5&&y>=5));//true
        System.out.println("The value of expression(z!=0||x==2) is "+(z!=0||x==2));//true
        System.out.println("The value of expression!(y<10) is "+!(y<10));//false
    }
}
