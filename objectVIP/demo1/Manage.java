package HomeWork.objectVIP.demo1;

public class Manage extends worker {
    private double bonus;

    public Manage() {}

    public Manage(int id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manage work");
    }
}
