package HomeWork.objectVIP.demo5;

public class fast extends logistics{
    public fast(String id, int width, String Recipient) {
        super(id, width, Recipient);
    }

    @Override
    public int calculateAmount() {
        return super.calculateAmount()+10;
    }
}
