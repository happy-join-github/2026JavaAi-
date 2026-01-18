package HomeWork.objectVIP.demo1;

public class test {
    public static void main(String[] args) {
        Manage m = new Manage(1,"xxx",8000,1000);
        cooker c = new cooker(2,"xx",4000);

        m.work();
        m.eat();

        c.work();
        c.eat();
    }
}
