package javafundamental.CollegeApplication;

public class College extends CollegeStaffDetails {
    public static void main(String[] args) {
        EngineeringDepartment engg = new EngineeringDepartment();
        ArtsDepartment arts = new ArtsDepartment();

        System.out.println("******Library details in the college******");
        //Engineering Book Details
        engg.bookDetails("James", "Lets C", 123675, true);
        engg.bookDetails("Pranav", "Networking", 1923987, true);
        engg.bookDetails("kishore", "Operating system", 192763, false);

        //Arts Book Details
        arts.bookDetails("Amitsha", "Psychology", 123432, true);
        arts.bookDetails("Mukerjey", "Labour law", 123654, false);
        arts.bookDetails("Modi", "Indian Polity", 1254373, true);
        arts.bookDetails("Rajan", "Indian Economy", 156723, true);

        //college book details
        int countOfBookRented = engg.bookRentedEng + arts.bookRentedArts;
        System.out.println("No of Book rented in Engineering departments and arts departments are " + countOfBookRented);
        int totalBookCount = engg.totalBookCountEng + arts.totalBookCountArts;
        System.out.println("Total number of Books in college is " + totalBookCount);

        //Engineering department furniture details
        engg.furnitureDetails("chair", "iron");
        engg.furnitureDetails("chair", "plastic");
        engg.furnitureDetails("chair", "iron");
        engg.furnitureDetails("table", "iron");

        //arts department furniture details
        arts.furnitureDetails("chair", "plastic");
        arts.furnitureDetails("table", "iron");
        arts.furnitureDetails("chair", "plastic");
        arts.furnitureDetails("table", "steel");

        //Total number of chairs in Library
        int totalChairs = engg.countChairEng + arts.countChairArts;
        System.out.println("Total chair count in Library " + totalChairs);

        CollegeStaffDetails staff = new CollegeStaffDetails();
        staff.setStaffDetailArts("hema", 25);
        staff.setStaffDetailArts("siva", 34);
        staff.setStaffDetailArts("Guru", 23);
        staff.setStaffDetailEng("mahesh", 55);
        staff.setStaffDetailEng("suresh", 55);
        staff.setStaffDetailEng("rakesh", 33);

        System.out.println("******Staff details in college*******");
        //Total number of staffs in Engineering Department
        int totalCountEngg = CollegeStaffDetails.countStaffEng;
        System.out.println("Total number of staff in Engineering department is " + totalCountEngg);
        //Total number of staffs in Arts department
        int totalCountArts = CollegeStaffDetails.countStaffArts;
        System.out.println("Total number of staff in Arts department is " + totalCountArts);
        //To get the oldest person in college
        staff.setMaxAge();

        //acess for labs
        System.out.println("*******Lab Accesss for Art Department********");
        arts.musicFacility();
        arts.labFacility();
        System.out.println("********Lab Accesss for Engineering Department");
        engg.musicFacility();
        engg.labFacility();

    }

}
