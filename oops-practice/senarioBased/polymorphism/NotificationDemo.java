class Notification {
    String recipientName, message;
    Notification(String r, String m) { recipientName = r; message = m; }
    void sendNotification() { }
}

class EmailNotification extends Notification {
    EmailNotification(String r, String m) { super(r, m); }
    void sendNotification() { System.out.println("Email to " + recipientName + ": " + message); }
}
class SMSNotification extends Notification {
    SMSNotification(String r, String m) { super(r, m); }
    void sendNotification() { System.out.println("SMS to " + recipientName + ": " + message); }
}
class PushNotification extends Notification {
    PushNotification(String r, String m) { super(r, m); }
    void sendNotification() { System.out.println("Push to " + recipientName + ": " + message); }
}

public class NotificationDemo {
    public static void main(String[] args) {
        Notification[] arr = {
            new EmailNotification("Ankit", "Welcome!"),
            new SMSNotification("Rahul", "OTP: 1234"),
            new PushNotification("Neha", "New Offer!")
        };
        for (Notification n : arr) n.sendNotification();
    }
}
