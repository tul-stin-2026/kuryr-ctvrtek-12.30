package cz.tul.stin.kuryr.shipping;

public class AirDelivery implements ShippingMethod {
    private static final double BASE_PRICE = 300;
    private static final double PRICE_PER_KG = 25;

    @Override
    public double calculateCost(double weight) {
        return BASE_PRICE + (PRICE_PER_KG * weight);
    }
}
