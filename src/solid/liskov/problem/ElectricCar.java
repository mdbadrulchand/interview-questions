package solid.liskov.problem;

public class ElectricCar extends Vehicle {
    public ElectricCar(String type, int age) {
        super(type, age);
    }

    @Override
    public void speedUp(){
        System.out.println("Electric Car is Speeding Up........");
    }

    @Override
    public void speedDown(){
        System.out.println("Electric Car Speeding Down.......");
    }

    @Override
    public void fuel(){
    }
}
