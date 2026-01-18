package HomeWork.objectVIP.demo3;

public class food {
    private String name;
    private double price;
    private String taste;

    public void showInfo(){
        System.out.println(this.name+",价格"+this.price+","+this.taste+","+"烹饪时间");
    }

    public food() {
    }

    public food(String name, double price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
