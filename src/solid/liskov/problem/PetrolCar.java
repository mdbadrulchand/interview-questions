package solid.liskov.problem;

public class PetrolCar extends  Vehicle{
    public PetrolCar(String type, int age) {
        super(type, age);
    }

    @Override
    public void speedUp(){
        System.out.println("Petrol Car is Speeding Up........");
    }

    @Override
    public void speedDown(){
        System.out.println("Petrol Car is Speeding Down.......");
    }

    @Override
    public void fuel(){
        System.out.println("Petrol Car is Fueling ......");
    }
}
