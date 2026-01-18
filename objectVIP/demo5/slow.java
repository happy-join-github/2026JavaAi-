package HomeWork.objectVIP.demo5;

public class slow extends logistics{
    public slow(String id, int width, String Recipient) {
        super(id, width, Recipient);
    }

    @Override
    public int calculateAmount() {
        return super.calculateAmount()+15;
    }
}
