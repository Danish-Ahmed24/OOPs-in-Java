package lab10;
interface MessageService {
    public void send(String message,String recipient);
    public void receive();
}

class Whatsapp implements MessageService {
    String message;
    @Override
    public void send(String message, String recipient) {
        System.out.println(recipient+": "+message);

    }

    @Override
    public void receive() {
        System.out.println("Message recieved");
    }
}
public class Q5_lab10 {
    public static void main(String[] args) {
///|\
        Whatsapp user = new Whatsapp();
        user.send("hi","Zeeshan");
        user.receive();
    }
}
