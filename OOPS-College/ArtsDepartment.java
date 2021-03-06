package javafundamental.CollegeApplication;



public class ArtsDepartment implements CollegeLibrary,CollegeLab{
    public String author;
    public String name;
    public int isbn;
    public boolean isRented;
    static int totalBookCountArts;
    int bookRentedArts = 0;
    public String type;
    public String material;
    int countChairArts = 0;
    String staffName;
    int age;

    @Override
    public void bookDetails(String author, String name, int isbn, boolean isRented) {
        this.author = author;
        this.name = name;
        this.isbn = isbn;
        this.isRented = isRented;
        if (isRented) {
            bookRentedArts++;
        }
        if (isbn > 0) {
            totalBookCountArts++;
        }
        //System.out.println("number of books rented"+bookRentedArts);
    }

    @Override
    public void furnitureDetails(String type, String material) {
        this.type = type;
        this.material = material;
        if (type.equalsIgnoreCase("chair")) {
            countChairArts++;
        }
        // System.out.println("no of chair"+countChairArts);
    }


    @Override
    public void labFacility() {
        System.out.println("No lab Facility for arts department");
    }

    @Override
    public void musicFacility() {
        System.out.println("Arts department can access Music facility");
    }
}


