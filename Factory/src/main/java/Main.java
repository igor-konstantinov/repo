public class Main {
    public static void main(String[] args) {
        // Create a Facebook social network instance using the factory
        SocialNetworkFactory facebookFactory = new FacebookFactory();
        SocialNetwork facebook = facebookFactory.createSocialNetwork();
        facebook.login("user123", "password123");
        facebook.postMessage("Hello from Facebook!");

        // Create a LinkedIn social network instance using the factory
        SocialNetworkFactory linkedInFactory = new LinkedInFactory();
        SocialNetwork linkedIn = linkedInFactory.createSocialNetwork();
        linkedIn.login("user@example.com", "linkedinPassword");
        linkedIn.postMessage("Hello from LinkedIn!");
    }
}