// Client code demonstrating usage
public class Client {
    public static void main(String[] args) {
        Downloader downloader = new CachingDownloader();

        // Downloading files - the Proxy (CachingDownloader) handles caching
        downloader.download("https://example.com/file1.txt");
        downloader.download("https://example.com/image.jpg");
        downloader.download("https://example.com/file1.txt"); // Retrieving from cache
        downloader.download("https://example.com/document.pdf");
    }
}