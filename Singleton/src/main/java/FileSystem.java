import java.util.HashMap;
import java.util.Map;

// Enum representing the available storage options
enum StorageOption {
    LOCAL_DISK,
    AMAZON_S3
}

// Singleton class to manage user file storage
class UserFileManager {

    // Private static instance variable to hold the single instance of the class
    private static UserFileManager instance;

    // Private constructor to prevent instantiation from other classes
    private UserFileManager() {
    }

    // Map to store user-to-storage-option mapping
    private Map<String, StorageOption> userStorageOptions = new HashMap<>();

    // Public static method to provide access to the single instance
    public static UserFileManager getInstance() {
        if (instance == null) {
            instance = new UserFileManager();
        }
        return instance;
    }

    // Method to set the storage option for a user
    public void setUserStorageOption(String username, StorageOption storageOption) {
        userStorageOptions.put(username, storageOption);
    }

    // Method to get the storage option for a user
    public StorageOption getUserStorageOption(String username) {
        return userStorageOptions.get(username);
    }
}