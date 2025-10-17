package org.example.BridgeStructuralDesignPattern;

public interface PaymentNotification {
    public void notification();
}

class EmailNotification implements PaymentNotification {
    @Override
    public void notification() {
        System.out.println("Email notification sent.");
    }
}

class SMSNotification implements PaymentNotification {
    @Override
    public void notification() {
        System.out.println("SMS notification sent.");
    }
}

class PushNotification implements PaymentNotification {
    @Override
    public void notification() {
        System.out.println("Push notification sent.");
    }
}
