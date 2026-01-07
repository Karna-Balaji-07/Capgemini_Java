package OOPs.Abstraction;

abstract class Notification{
    abstract void sendNotification();
}

class Email extends  Notification{
    @Override
    void sendNotification() {
        System.out.println("Email notification");
    }
}

class SMS extends Notification{
    @Override
    void sendNotification() {
        System.out.println("SMS notification");
    }
}

class pushNot extends Notification{
    @Override
    void sendNotification() {
        System.out.println("Push notifications");
    }
}


public class Program_5 {
    public static void main(String[] args) {
        Notification mail = new Email();
        Notification sms = new SMS();
        Notification push = new pushNot();
        mail.sendNotification();
        sms.sendNotification();
        push.sendNotification();
    }
}
