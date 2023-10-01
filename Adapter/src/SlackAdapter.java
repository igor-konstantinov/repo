class SlackAdapter implements Notification {
    private SlackNotification slackNotification;

    public SlackAdapter(SlackNotification slackNotification) {
        this.slackNotification = slackNotification;
    }

    @Override
    public void send(String title, String message) {
        // Adapt the call to the Slack-specific method
        String apiKey = "yourApiKey";
        String login = "yourLogin";
        String chatId = "yourChatId";

        slackNotification.sendToSlack(apiKey, login, chatId, "Sent email with title '" + title + "' that says '" + message + "'.");
    }
}
