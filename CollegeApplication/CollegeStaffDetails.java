package javafundamental.CollegeApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollegeStaffDetails {
    Map<Integer, String> staffDetailEng = new HashMap<Integer, String>();
    ArrayList<Integer> engValue = new ArrayList<>();
    ArrayList<Integer> artsValue = new ArrayList<>();
    Map<Integer, String> staffDetailArts = new HashMap<Integer, String>();
    public  String staffNameArts;
    public  String staffNameEngg;
    public static int countStaffEng = 0;
    public static int countStaffArts = 0;
    public int ageEng;
    public int ageArts;
    static int maxAgeArts,maxAge;
    int maxAgeEng;


    public void setStaffDetailEng(String staffNameEngg, int ageEng) {
        this.staffNameEngg = staffNameEngg;
        this.ageEng = ageEng;
        if (ageEng > 0) {
            staffDetailEng.put(ageEng, staffNameEngg);
            countStaffEng++;
            engValue.add(ageEng);
        }

        // System.out.println("Total number of staff in Engineering Department  "+countStaffEng);

    }

    public void setStaffDetailArts(String staffNameArts, int ageArts) {
        this.staffNameArts = staffNameArts;
        this.ageArts = ageArts;
        if (ageArts > 0) {
            staffDetailEng.put(ageArts, staffNameArts);
            countStaffArts++;
            artsValue.add(ageArts);
        }

        // System.out.println("Total number of staff is Arts Department "+countStaffArts);
    }
public void setMaxAge(){
    maxAgeEng = (int) Collections.max(engValue);
    //System.out.println("Maximum age in engineering"+maxAgeEng);
    maxAgeArts = (int) Collections.max(artsValue);
    //System.out.println("Maximum age in arts "+maxAgeArts);
    if (maxAgeEng > maxAgeArts)
            maxAge = maxAgeEng;
        else
            maxAge = maxAgeArts;

    for (Integer age1 : staffDetailArts.keySet()) {
            String name1 = staffDetailArts.get(maxAge);
            if (age1 == maxAge)
                System.out.println("The oldest person is " + name1 + " of age" + age1);
        }
        for (Integer age2 : staffDetailEng.keySet()) {
            String name2 = staffDetailEng.get(maxAge);
            if (age2 == maxAge)
                System.out.println("The oldest person is " + name2 + " of age " + age2);

        }
    }
}
