package DayTry.Day1test;

import DesignPatterns.FactorialDesign.Mail;
import DesignPatterns.FactorialDesign.Notification;
import DesignPatterns.FactorialDesign.SMS;
import DesignPatterns.FactorialDesign.Whatsapp;

public class FactoryMethodtest {
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
