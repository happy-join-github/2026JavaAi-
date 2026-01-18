package HomeWork.objectVIP.demo4;

public class clother extends base{
    private double width;
    private String color;

    public clother() {}

    public clother(String name, double peice, double width, String color) {
        super(name, peice);
        this.width = width;
        this.color = color;
    }

    @Override
    public void showinfo() {
        System.out.println("展示信息: "+super.getName()+super.getPeice()+this.width+this.color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
