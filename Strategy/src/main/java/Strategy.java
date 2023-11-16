// Strategy interface for delivery cost calculation
interface DeliveryCostStrategy {
    void calculateDeliveryCost();
}

// Concrete implementation for Self-pickup
class SelfPickupCost implements DeliveryCostStrategy {
    @Override
    public void calculateDeliveryCost(){
        // calculateDeliveryCost method implementation for self-pickup
    }
}

// Concrete implementation for External delivery service
class ExternalDeliveryCost implements DeliveryCostStrategy {
    @Override
    public void calculateDeliveryCost(){
        // calculateDeliveryCost method implementation for external delivery
    }
}

// Concrete implementation for In-house delivery service
class InHouseDeliveryCost implements DeliveryCostStrategy {
    @Override
    public void calculateDeliveryCost(){
        // calculateDeliveryCost method implementation for in-house delivery
    }
}

// Context class that uses the strategy
class DeliveryContext {
    private DeliveryCostStrategy costStrategy;

    public void setDeliveryCostStrategy(DeliveryCostStrategy costStrategy) {
        this.costStrategy = costStrategy;
    }

    public void calculateDelivery() {
        costStrategy.calculateDeliveryCost();
    }
}

