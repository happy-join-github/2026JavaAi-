package HomeWork.objectVIP.demo5;

public class test {
    public static void main(String[] args) {
        logistics l = new logistics("202601181350", 20, "xxx");
        System.out.println("基础快递费用"+l.calculateAmount());

        fast f1 = new fast("202601181350", 20, "xxx");
        slow s1 = new slow("202601181350", 20, "xxx");
        System.out.println("使用同城速递费用:"+f1.calculateAmount());
        System.out.println("使用异地空运:"+s1.calculateAmount());
    }
}
