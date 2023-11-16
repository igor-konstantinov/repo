// Example usage:
public class Client {
    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext();

        // Selecting delivery method - Self-pickup
        deliveryContext.setDeliveryCostStrategy(new SelfPickupCost());
        deliveryContext.calculateDelivery();

        // Selecting delivery method - External delivery service
        deliveryContext.setDeliveryCostStrategy(new ExternalDeliveryCost());
        deliveryContext.calculateDelivery();

        // Selecting delivery method - In-house delivery service
        deliveryContext.setDeliveryCostStrategy(new InHouseDeliveryCost());
        deliveryContext.calculateDelivery();
    }
}
