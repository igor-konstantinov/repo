public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("admin@example.com");
        Notification slackNotification = new SlackAdapter(new SlackMessageSender());
        Notification smsNotification = new SmsAdapter(new SmsMessageSender());

        // Send email notification using the standard Notification interface
        emailNotification.send("Email Title", "Email Message");

        // Send Slack notification using the adapted Notification interface
        slackNotification.send("Slack Title", "Slack Message");

        // Send SMS notification using the adapted Notification interface
        smsNotification.send("SMS Title", "SMS Message");
    }
}