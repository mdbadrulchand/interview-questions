package solid.single.responsibility.problems;

public class Employee {

    private String name;
    private String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void saveData(){
        System.out.println("Saving Employee Data.....");
    }

    public void generateReport(){
        System.out.println("Generating Employee Report.....");
    }
}
