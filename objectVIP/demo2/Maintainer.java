package HomeWork.objectVIP.demo2;

public class Maintainer extends Adminstaff{
    public Maintainer() {
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }

    @Override
    public void worker() {
        System.out.println("正在维护服务器");
    }
}
