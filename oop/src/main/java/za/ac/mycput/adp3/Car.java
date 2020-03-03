package za.ac.mycput.adp3;

public class Car extends Vehicle implements DriverInterface{
    public Car() {
        super();
    }


    @Override
    public String drive(String a) {
        return a;
    }


    public String poly(String b){
        return b;
    }

    public void poly(){
        poly("Static polymorphism");
    }

}
