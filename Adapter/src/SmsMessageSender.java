class SmsMessageSender implements SmsNotification {
    @Override
    public void sendSms(String phoneNumber, String senderName, String message) {
        System.out.println("Sent SMS message to " + phoneNumber + " from " + senderName + ": " + message);
    }
}