package HomeWork.objectVIP.demo2;

public class Buyer extends Adminstaff{
    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }

    @Override
    public void worker() {
        System.out.println("购买服务器");
    }
}
