package cz.tul.stin.kuryr;

public interface ShippingMethod {
    double calculateCost(double weight);
}
