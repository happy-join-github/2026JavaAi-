package HomeWork.objectVIP.demo4;

public class electronicProducts extends base {
    private String brand;
    private int id;

    public electronicProducts() {}

    public electronicProducts(String name, double peice, String brand, int id) {
        super(name, peice);
        this.brand = brand;
        this.id = id;
    }

    @Override
    public void showinfo() {
        System.out.println("展示信息: "+super.getName()+super.getPeice()+this.brand+this.id);
    }
}
