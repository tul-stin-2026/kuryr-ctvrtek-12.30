package cz.tul.stin.kuryr.delivery;

import cz.tul.stin.kuryr.discount.NoDiscount;
import cz.tul.stin.kuryr.shipping.AirDelivery;
import cz.tul.stin.kuryr.shipping.BikeDelivery;
import cz.tul.stin.kuryr.shipping.TruckDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    @Test
    void shouldUseTruckDelivery()
    {
        Delivery d = new Delivery(
                "CZ001",
                10,
                new TruckDelivery(),
                new NoDiscount());
        assertEquals(200, d.calculatePrice());
    }

    @Test
    void shouldUseAirDelivery()
    {
        Delivery d = new Delivery(
                "CZ002",
                5,
                new AirDelivery(),
                new NoDiscount());
        assertEquals(425, d.calculatePrice());
    }

    @Test
    void shouldUseBikeDelivery()
    {
        Delivery d = new Delivery(
                "CZ003",
                3,
                new BikeDelivery(),
                new NoDiscount());
        assertEquals(80, d.calculatePrice());
    }

    @Test
    void shouldPropagateExceptionFromBikeDelivery()
    {
        Delivery d = new Delivery(
                "CZ004",
                6,
                new BikeDelivery(),
                new NoDiscount());
        assertThrows(IllegalArgumentException.class, d::calculatePrice);
    }

    @Test
    void shouldThrowExceptionForNegativeWeight() {
        assertThrows(IllegalArgumentException.class,
                () -> new Delivery(
                   "CZ999",
                   -5,
                   new TruckDelivery(),
                   new NoDiscount()
                ));
    }
}