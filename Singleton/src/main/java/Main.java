public class Main {
    public static void main(String[] args) {
        // Get the Singleton instance of UserFileManager
        UserFileManager fileManager = UserFileManager.getInstance();

        // Set storage options for users
        fileManager.setUserStorageOption("user1", StorageOption.LOCAL_DISK);
        fileManager.setUserStorageOption("user2", StorageOption.AMAZON_S3);

        // Retrieve and print storage options for users
        System.out.println("User1's Storage Option: " + fileManager.getUserStorageOption("user1"));
        System.out.println("User2's Storage Option: " + fileManager.getUserStorageOption("user2"));
    }
}