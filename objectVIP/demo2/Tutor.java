package HomeWork.objectVIP.demo2;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }

    @Override
    public void worker() {
        System.out.println("助教正在答疑课程");
    }
}
