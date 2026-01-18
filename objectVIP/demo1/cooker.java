package HomeWork.objectVIP.demo1;

public class cooker extends worker{
    public cooker() {
    }

    public cooker(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("cooker work");
    }
}
