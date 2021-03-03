package javafundamental.Polymorphism;
/*Create a class named 'PrintNumber' to print various numbers of different datatypes
by creating different methods with the same name 'println' having a parameter for each data type.
*/
public class PrintNumber {
    public void Println(int num){
        System.out.println("The value of int is "+num);

    }
    public void Println(float num){
        System.out.println("The value of float is "+num);
    }
    public void Println(double num){
        System.out.println("The value of double is "+num);
    }

}
class PrintValues{
    public static void main(String[] args) {
        PrintNumber val = new PrintNumber();
        val.Println(21987);
        val.Println(21.456);
        val.Println(65.67676);
    }
}