package cz.tul.stin.kuryr.discount;

// Strategie slevy
public interface DiscountStrategy {     // Rozhraní pro různé typy slev

    double applyDiscount(double price); // Metoda aplikující slevu
}