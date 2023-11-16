// Client Code
public class Client {
    public static void main(String[] args) {
        // Creating page instances
        Page simplePage = new SimplePage();
        Product product = new Product();
        Page productPage = new ProductPage(product);

        // Creating renderer instances
        Renderer htmlRenderer = new HTMLRenderer();
        Renderer jsonRenderer = new JSONRenderer();
        Renderer xmlRenderer = new XMLRenderer();

        // Rendering pages in different formats
        htmlRenderer.renderPage(simplePage);
        jsonRenderer.renderPage(simplePage);
        xmlRenderer.renderPage(simplePage);

        htmlRenderer.renderPage(productPage);
        jsonRenderer.renderPage(productPage);
        xmlRenderer.renderPage(productPage);
    }
}
