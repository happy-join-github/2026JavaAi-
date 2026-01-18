package HomeWork.objectVIP.demo5;

public class logistics {
    private String id;
    private int width;
    private String Recipient;

    public int calculateAmount(){
        return width*10;
    }

    public logistics(String id, int width, String Recipient) {
        this.id = id;
        this.width = width;
        this.Recipient = Recipient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getRecipient() {
        return Recipient;
    }

    public void setRecipient(String recipient) {
        Recipient = recipient;
    }
}
