package org.example.BridgeStructuralDesignPattern;

public class Driver {
    public static void main(String[] args) {
        PaymentType onlinePaymentEmail = new OnlinePayment(new EmailNotification());
        onlinePaymentEmail.pay();

        PaymentType onlinePaymentSMS = new OnlinePayment(new SMSNotification());
        onlinePaymentSMS.pay();

        PaymentType codPaymentEmail = new CashonDeliveryPayment(new EmailNotification());
        codPaymentEmail.pay();

        PaymentType codPaymentSMS = new CashonDeliveryPayment(new SMSNotification());
        codPaymentSMS.pay();

        PaymentType bitcoinPaymentEmail = new BitcoinPayment(new EmailNotification());
        bitcoinPaymentEmail.pay();

        PaymentType bitcoinPaymentSMS = new BitcoinPayment(new SMSNotification());
        bitcoinPaymentSMS.pay();

        PaymentType bitcoinPaymentPush = new BitcoinPayment(new PushNotification());
        bitcoinPaymentPush.pay();

        PaymentType codPaymentPush = new CashonDeliveryPayment(new PushNotification());
        codPaymentPush.pay();
    }
}
