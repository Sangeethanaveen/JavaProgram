package javafundamental.Polymorphism;
/*Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that
prints "I am an Undergraduate" and "I am aPostgraduate" respectively.
Call the method by creating an object of each of the three classes
*/
public class Degree {
    public void getDegree(){
        System.out.println("I got a degree!!");
    }
}
class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate!!");

    }
}
class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Postgraduate!!");
    }
}
class main{
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree();
        Undergraduate ug = new Undergraduate();
        ug.getDegree();
        Postgraduate pg = new Postgraduate();
        pg.getDegree();
        Degree d = new Undergraduate();
        d.getDegree();

    }
}
