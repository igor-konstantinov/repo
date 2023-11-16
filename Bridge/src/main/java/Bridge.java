// Product class representing product information
class Product {
    private String name;
    private String description;
    private String image;
    private String id;
}

// Abstraction - Page
interface Page {
    void render();
}

// Concrete Implementations - SimplePage and ProductPage
class SimplePage implements Page {
    private String title;
    private String content;

    @Override
    public void render() {
        // Render as per chosen rendering type
    }
}

class ProductPage implements Page {
    private Product product;

    public ProductPage(Product product) {
        this.product = product;
    }

    @Override
    public void render() {
        // Render as per chosen rendering type
    }
}

// Implementor - Renderer
interface Renderer {
    void renderPage(Page page);
}

// Concrete Implementations - HTMLRenderer, JSONRenderer, XMLRenderer
class HTMLRenderer implements Renderer {
    @Override
    public void renderPage(Page page) {
        // Render page in HTML format
    }
}

class JSONRenderer implements Renderer {
    @Override
    public void renderPage(Page page) {
        // Render page in JSON format
    }
}

class XMLRenderer implements Renderer {
    @Override
    public void renderPage(Page page) {
        // Render page in XML format
    }
}