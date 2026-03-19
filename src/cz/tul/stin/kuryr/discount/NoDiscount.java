package cz.tul.stin.kuryr.discount;

public class NoDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {        // Vrací původní cenu
        return price;
    }
}