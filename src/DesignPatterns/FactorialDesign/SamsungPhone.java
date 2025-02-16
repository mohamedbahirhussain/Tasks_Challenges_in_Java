package DesignPatterns.FactorialDesign;

public class SamsungPhone {
    public static void main(String[] args){
        Notification notification = new Mail();
        notification.NotifyUser();

        Notification notification1 = new Whatsapp();
        notification1.NotifyUser();
    }
}
