package cz.tul.stin.kuryr.shipping;

public class BikeDelivery implements ShippingMethod {
    private static final double FIXED_PRICE = 80;
    private static final double MAX_WEIGHT = 5;

    @Override
    public double calculateCost(double weight) {
        if (weight > MAX_WEIGHT) {
            throw new IllegalArgumentException("Vaha musi byt mensi rovna " + MAX_WEIGHT + " kg.");
        }
        return FIXED_PRICE;
    }
}
