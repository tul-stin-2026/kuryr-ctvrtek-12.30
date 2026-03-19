package cz.tul.stin.kuryr.shipping;

// Abstraktní dekorátor
public abstract class ShippingDecorator implements ShippingMethod {

    protected ShippingMethod wrapped;                  // Zabalený objekt

    public ShippingDecorator(ShippingMethod wrapped) { // Konstruktor
        this.wrapped = wrapped;
    }
}