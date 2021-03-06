package javafundamental.CollegeApplication;



public class EngineeringDepartment implements CollegeLibrary,CollegeLab {
    public String author;
    public String name;
    public int isbn;
    public boolean isRented;
    static int bookRentedEng = 0;
    static int totalBookCountEng = 0;
    public String type;
    public String material;
    static int countChairEng = 0;
    int age;
    int count = 0;
    @Override
    public void bookDetails(String author, String name, int isbn, boolean isRented) {
        this.author = author;
        this.name = name;
        this.isbn = isbn;
        this.isRented = isRented;
        if (isRented) {
            bookRentedEng++;
        }
        if (isbn > 0) {
            totalBookCountEng++;
        }
        //System.out.println(bookRentedEng);
    }

    @Override
    public void furnitureDetails(String type, String material) {
        this.type = type;
        this.material = material;
        if (type.equalsIgnoreCase("chair")) {
            countChairEng++;

        }
        // System.out.println("no of chair"+countChairEng);
    }


    @Override
    public void labFacility() {
        System.out.println("Engineering department can access lab facility");
    }

    @Override
    public void musicFacility() {
        System.out.println("Engineering department can not access music facility");

    }
}


