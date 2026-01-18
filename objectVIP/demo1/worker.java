package HomeWork.objectVIP.demo1;

public class worker {
    private int id;
    private String name;
    private double salary;

    public worker() {
    }

    public worker(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
