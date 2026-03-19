package cz.tul.stin.kuryr.discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PercentageDiscountTest {
    @Test
    void shouldWorkWithDecimalValues() {
        PercentageDiscount discount = new PercentageDiscount(10);
        assertEquals(
                89.991,
                discount.applyDiscount(99.99),
                0.001);
    }

    @Test
    void shouldThrowExceptionForInvalidPercentage() {
        assertThrows(IllegalArgumentException.class,
                () -> new PercentageDiscount(-10));
        assertThrows(IllegalArgumentException.class,
                () -> new PercentageDiscount(150));
    }
}