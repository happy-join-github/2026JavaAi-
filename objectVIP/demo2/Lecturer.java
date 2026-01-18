package HomeWork.objectVIP.demo2;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }

    @Override
    public void worker() {
        System.out.println("讲师正在教授课程");
    }
}
