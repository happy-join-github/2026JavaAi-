package HomeWork.objectVIP.demo4;

public class base {
    private String name;
    private double peice;

    public void showinfo(){
        System.out.println("展示属性");
    }

    public base() {
    }

    public base(String name, double peice) {
        this.name = name;
        this.peice = peice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeice() {
        return peice;
    }

    public void setPeice(double peice) {
        this.peice = peice;
    }
}
