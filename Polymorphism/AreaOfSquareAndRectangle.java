package javafundamental.Polymorphism;
/*Create a class to print the area of a square and a rectangle.
The class has two methods with the same name but different number of parameters.
The method for printing area of rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side of square
 */
public class AreaOfSquareAndRectangle {
    public void Area(float length, float breath){
        float area =(float )length*breath;
        System.out.println("The area of rectangle is "+area);

    }
    public void Area(float side){
        float area = (float)side*side;
        System.out.println("The area of rectangle is "+area);

    }
}
class Area{
    public static void main(String[] args) {
        AreaOfSquareAndRectangle areaval = new AreaOfSquareAndRectangle();
        areaval.Area(10.23f);
        areaval.Area(23.4f,12.5f);

    }
}
