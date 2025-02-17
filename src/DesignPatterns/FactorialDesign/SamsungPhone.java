package DesignPatterns.FactorialDesign;

public class SamsungPhone {
    public static void main(String[] args){
        FactoryMethod factoryMethod = new FactoryMethod();

        Notification notification = factoryMethod.createNotification("Mail");
        notification.NotifyUser();
//
//        Notification notification1 = new Whatsapp();
//        notification1.NotifyUser();

        //factoryMethod.createNotification("Mail");

    }
}
