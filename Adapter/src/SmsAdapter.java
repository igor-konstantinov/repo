class SmsAdapter implements Notification {
    private SmsNotification smsNotification;

    public SmsAdapter(SmsNotification smsNotification) {
        this.smsNotification = smsNotification;
    }

    @Override
    public void send(String title, String message) {
        // Adapt the call to the SMS-specific method
        String phoneNumber = "1234567890"; // Replace with actual phone number
        String senderName = "YourApp"; // Replace with actual sender name

        smsNotification.sendSms(phoneNumber, senderName, "Sent email with title '" + title + "' that says '" + message + "'.");
    }
}