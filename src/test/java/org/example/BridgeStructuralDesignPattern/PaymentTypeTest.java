package org.example.BridgeStructuralDesignPattern;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTypeTest {

    @Test
    void OnlinePaymentPayTest(){
        PaymentType paymentType = new OnlinePayment(new EmailNotification());

        ByteArrayOutputStream console = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(console));
        try {
            paymentType.pay();
        } finally {
            System.setOut(original);
        }

        assertEquals("Received online payment. Email notification sent.\n", console.toString());
    }

    @Test
    void CashonDeliveryPaymentPayTest(){
        PaymentType paymentType = new CashonDeliveryPayment(new EmailNotification());

        ByteArrayOutputStream console = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(console));
        try {
            paymentType.pay();
        } finally {
            System.setOut(original);
        }

        assertEquals("Received cash on delivery payment. Email notification sent.\n", console.toString());
    }

    @Test
    void BitcoinPaymentPayTest(){
        PaymentType paymentType = new BitcoinPayment(new EmailNotification());

        ByteArrayOutputStream console = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(console));
        try {
            paymentType.pay();
        } finally {
            System.setOut(original);
        }

        assertEquals("Received bitcoin payment. Email notification sent.\n", console.toString());
    }

}