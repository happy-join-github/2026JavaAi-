package HomeWork.objectVIP.demo2;

public class test {
    public static void main(String[] args) {
        Lecturer l1 = new Lecturer(1,"a");
        Tutor t1 = new Tutor(2,"b");

        Maintainer m1 = new Maintainer(3,"aa");
        Buyer b1 = new Buyer(4,"bb");

        l1.worker();
        System.out.println(l1.getName());
        t1.worker();

        m1.worker();
        System.out.println(m1.getName());
        b1.worker();
    }
}
