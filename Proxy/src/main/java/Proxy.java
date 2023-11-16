import java.util.HashMap;
import java.util.Map;

// Downloader interface
interface Downloader {
    void download(String fileURL);
}

// Implementation of Downloader - SimpleDownloader
class SimpleDownloader implements Downloader {
    @Override
    public void download(String fileURL) {
        // Logic to download file from fileURL
        // This is the initial implementation without caching
    }
}

// Proxy class implementing Downloader
class CachingDownloader implements Downloader {
    private SimpleDownloader simpleDownloader;
    private Map<String, byte[]> cache; // Map to store cached data

    public CachingDownloader() {
        this.simpleDownloader = new SimpleDownloader();
        this.cache = new HashMap<>();
    }

    @Override
    public void download(String fileURL) {
        // Logic to download and cache downloaded files or retrieve the cached files if they exist
    }
}