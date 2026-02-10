package solid.liskov.solution;

public class ElectricCar implements Vehicle {

    @Override
    public void speedUp() {
        System.out.println("Electric Car is Speeding Up........");
    }

    @Override
    public void speedDown() {
        System.out.println("Electric Car Speeding Down.......");
    }

    @Override
    public void fuel() {
        System.out.println("Electric Car is Charging ......");
    }
}
