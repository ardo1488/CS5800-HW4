package org.example.BridgeStructuralDesignPattern;

public abstract class PaymentType {
    protected PaymentNotification paymentNotification;

    public abstract void pay();
}

class OnlinePayment extends PaymentType {
    public OnlinePayment(PaymentNotification paymentNotification) {
        this.paymentNotification = paymentNotification;
    }

    @Override
    public void pay() {
        System.out.print("Received online payment. ");
        paymentNotification.notification();
    }
}

class CashonDeliveryPayment extends PaymentType {
    public CashonDeliveryPayment(PaymentNotification paymentNotification) {
        this.paymentNotification = paymentNotification;
    }

    @Override
    public void pay() {
        System.out.print("Received cash on delivery payment. ");
        paymentNotification.notification();
    }
}

class BitcoinPayment extends PaymentType {
    public BitcoinPayment(PaymentNotification paymentNotification) {
        this.paymentNotification = paymentNotification;
    }

    @Override
    public void pay() {
        System.out.print("Received bitcoin payment. ");
        paymentNotification.notification();
    }
}