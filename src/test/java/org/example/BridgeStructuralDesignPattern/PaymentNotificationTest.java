package org.example.BridgeStructuralDesignPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PaymentNotificationTest {

    @Test
    void EmailNotificationTest() {
        PaymentNotification notification = new EmailNotification();

        ByteArrayOutputStream console = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(console));
        try {
            notification.notification();
        } finally {
            System.setOut(original);
        }

        assertEquals("Email notification sent.\n", console.toString());
    }

    @Test
    void SMSNotificationTest() {
        PaymentNotification notification = new SMSNotification();

        ByteArrayOutputStream console = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(console));
        try {
            notification.notification();
        } finally {
            System.setOut(original);
        }

        assertEquals("SMS notification sent.\n", console.toString());
    }

    @Test
    void PushNotificationTest() {
        PaymentNotification notification = new PushNotification();

        ByteArrayOutputStream console = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(console));
        try {
            notification.notification();
        } finally {
            System.setOut(original);
        }

        assertEquals("Push notification sent.\n", console.toString());
    }

}