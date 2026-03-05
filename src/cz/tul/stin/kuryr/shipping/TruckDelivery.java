package cz.tul.stin.kuryr.shipping;

public class TruckDelivery implements ShippingMethod {
    private static final double BASE_PRICE = 100;
    private static final double PRICE_PER_KG = 10;

    @Override
    public double calculateCost(double weight) {
        return BASE_PRICE + (PRICE_PER_KG * weight);
    }
}
