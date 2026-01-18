package HomeWork.objectVIP.demo3;

public class hotFood extends food {
    private double CookTime;

    public hotFood() {
    }

    public hotFood(String name, double price, String taste, double CookTime) {
        super(name, price, taste);
        this.CookTime = CookTime;
    }

    @Override
    public void showInfo() {
        System.out.println("热菜"+super.getName() + ",价格" + super.getPrice() + "元,口味" + super.getTaste() + "," + "烹饪时间" + this.CookTime + "分钟,适合重口味食客");
    }

    public double getTime() {
        return CookTime;
    }

    public void setTime(double time) {
        this.CookTime = time;
    }
}
