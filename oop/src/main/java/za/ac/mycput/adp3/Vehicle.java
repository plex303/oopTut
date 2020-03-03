package za.ac.mycput.adp3;

public class Vehicle {
    private int mass;


    public Vehicle() {
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }



    public String calcGrade(int mark){
       String grade="";
        if (mark>=50 && mark<=100){
            grade = "pass";
        }

        else if (mark>=0 && mark<50){
            grade = "fail";
        }

        else {
            grade= "Invalid";
        }


        return grade;
    }

    public String vehType(String type){
        return type;

    }

    }
