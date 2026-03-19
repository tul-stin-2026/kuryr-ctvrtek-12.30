package cz.tul.stin.kuryr.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeDeliveryTest {
    @Test
    void shouldReturnFixedPriceForWeightBelowLimit() {
        BikeDelivery bike = new BikeDelivery();
        assertEquals(80, bike.calculateCost(4.99));
    }

    @Test
    void shouldReturnFixedPriceForWeightAtLimit() {
        BikeDelivery bike = new BikeDelivery();
        assertEquals(80, bike.calculateCost(5));
    }

    @Test
    void shouldThrowExceptionForWeightAboveLimit() {
        BikeDelivery bike = new BikeDelivery();
        assertThrows(IllegalArgumentException.class,
                () -> bike.calculateCost(5.01));
    }

    @Test
    void shouldReturnFixedPriceForZeroWeight() {
        BikeDelivery bike = new BikeDelivery();
        assertEquals(80, bike.calculateCost(0));
    }
}