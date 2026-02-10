package solid.liskov.solution;

public class PetrolCar implements Vehicle {

    @Override
    public void speedUp() {
        System.out.println("Petrol Car is Speeding Up........");
    }

    @Override
    public void speedDown() {
        System.out.println("Petrol Car is Speeding Down.......");
    }

    @Override
    public void fuel() {
        System.out.println("Petrol Car is Fueling ......");
    }
}
