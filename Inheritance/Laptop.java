package javafundamental;

public class Laptop {
    public final String name;
    public final String processor;
    public final double price;
    public final String ram;
    public final String hdd;

    public Laptop(String name, String processor, double price, String ram, String hdd) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;

    }
    final void Check() {
        System.out.println("Verify your laptop details");
    }

    public void LaptopDetail() {
        System.out.println("Name:" +this.name);
        System.out.println("Processor Name: $" +this.processor);
        System.out.println("Price:" +this.price);
        System.out.println("Ram:" + this.ram);
        System.out.println("HDD:" + this.hdd);
    }
}

class Brand extends Laptop {

    public Brand(String name, String pName, double price, String ram, String hdd) {
        super(name, pName, price, ram, hdd);
    }

}
class Laptopdetail {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Dell", "i3", 1000.0, "2GB", "50GB");
        Laptop hp = new Laptop("HP", "i5", 2000.0, "4GB", "1TB");
        Laptop sony = new Laptop("Sony", "i7", 2500.0, "8GB", "100GB");
        dell.Check();
        dell.LaptopDetail();
        hp.Check();
        hp.LaptopDetail();
        sony.Check();
        sony.LaptopDetail();
    }
}











