interface SlackNotification {
    void sendToSlack(String apiKey, String login, String chatId, String message);
}