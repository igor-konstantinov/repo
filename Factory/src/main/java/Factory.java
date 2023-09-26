// Interface representing the SocialNetwork
interface SocialNetwork {
    void login(String id, String password);
    void postMessage(String message);
}

// Concrete class for Facebook
class Facebook implements SocialNetwork {
    @Override
    public void login(String login, String password) {
        System.out.println("Logged in to Facebook with login: " + login + "; and password: " + password);
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Posted message on Facebook: " + message);
    }
}

// Concrete class for LinkedIn
class LinkedIn implements SocialNetwork {
    @Override
    public void login(String email, String password) {
        System.out.println("Logged in to LinkedIn with email: " + email + "; and password: " + password);
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Posted message on LinkedIn: " + message);
    }
}

// Factory interface
interface SocialNetworkFactory {
    SocialNetwork createSocialNetwork();
}

// Concrete factory for Facebook
class FacebookFactory implements SocialNetworkFactory {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new Facebook();
    }
}

// Concrete factory for LinkedIn
class LinkedInFactory implements SocialNetworkFactory {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new LinkedIn();
    }
}