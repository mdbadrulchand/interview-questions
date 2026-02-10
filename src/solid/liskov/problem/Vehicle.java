package solid.liskov.problem;

public class Vehicle {
    private String type;
    private int age;

    public Vehicle(String type, int age){
        this.type = type;
        this.age = age;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speedUp(){
        System.out.println("Speeding Up........");
    }

    public void speedDown(){
        System.out.println("Speeding Down.......");
    }

    public void fuel(){
        System.out.println("Fueling the car......");
    }
}
