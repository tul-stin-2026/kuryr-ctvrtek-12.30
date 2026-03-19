package cz.tul.stin.kuryr.discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoDiscountTest {
    @Test
    void shouldReturnTheSamePrice() {
        NoDiscount discount = new NoDiscount();

        assertEquals(100, discount.applyDiscount(100));
        assertEquals(0, discount.applyDiscount(0));
        assertEquals(999.99, discount.applyDiscount(999.99));
    }
}