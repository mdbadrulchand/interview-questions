package solid.liskov.solution;

public interface Vehicle {


    default void speedUp(){
        System.out.println("Speeding Up........");
    }

    default void speedDown(){
        System.out.println("Speeding Down.......");
    }

    public void fuel();
}
