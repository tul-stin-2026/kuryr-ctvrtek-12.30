package cz.tul.stin.kuryr.delivery;

import cz.tul.stin.kuryr.discount.NoDiscount;
import cz.tul.stin.kuryr.discount.PercentageDiscount;
import cz.tul.stin.kuryr.shipping.TruckDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryWithDiscountTest {
    @Test
    public void shouldApplyPercentageDiscount() {
        Delivery d = new Delivery(
                "CZ005",
                10,
                new TruckDelivery(),
                new PercentageDiscount(10)
        );

        assertEquals(180, d.calculatePrice());
    }

    @Test
    public void shouldNotChangePriceWithNoDiscount() {
        Delivery d = new Delivery(
                "CZ006",
                10,
                new TruckDelivery(),
                new NoDiscount()
        );

        assertEquals(200, d.calculatePrice());
    }
}
