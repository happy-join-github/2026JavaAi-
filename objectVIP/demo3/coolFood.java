package HomeWork.objectVIP.demo3;

public class coolFood extends food {
    private double goodTime;

    public coolFood() {
    }

    public coolFood(String name, double price, String taste, double goodTime) {
        super(name, price, taste);
        this.goodTime = goodTime;
    }

    @Override
    public void showInfo() {
        System.out.println("凉菜" + super.getName() + ",价格" + super.getPrice() + "元,口味" + super.getTaste() + ",保质期" + this.goodTime + "分钟,适合所有食客");
    }

    public double getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(double goodTime) {
        this.goodTime = goodTime;
    }
}
