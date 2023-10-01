class SlackMessageSender implements SlackNotification {
    @Override
    public void sendToSlack(String apiKey, String login, String chatId, String message) {
        System.out.println("Sent Slack message to chat " + chatId + ": " + message);
    }
}