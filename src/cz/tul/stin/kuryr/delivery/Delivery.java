package cz.tul.stin.kuryr.delivery;

import cz.tul.stin.kuryr.shipping.ShippingMethod;

public class Delivery {
    private final String trackingNumber;
    private final double weight;
    private ShippingMethod shippingMethod;

    public Delivery(String trackingNumber,
                    double weight,
                    ShippingMethod shippingMethod) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.shippingMethod = shippingMethod;
    }

    public double calculatePrice() {
        return shippingMethod.calculateCost(weight);
    }
}
