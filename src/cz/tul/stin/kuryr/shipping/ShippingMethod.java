package cz.tul.stin.kuryr.shipping;

public interface ShippingMethod {
    double calculateCost(double weight);
}
