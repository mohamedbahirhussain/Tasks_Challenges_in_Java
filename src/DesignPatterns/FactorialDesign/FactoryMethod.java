package DesignPatterns.FactorialDesign;

public class FactoryMethod {
    public Notification createNotification(String channel){
        if(channel == null){
            return null;
        }
        switch (channel){
            case "SMS":
                return new SMS();
            case "Whatsapp":
                return new Whatsapp();
            case "Mail":
                return new Mail();
            default:
                return null;
        }
    }
}
