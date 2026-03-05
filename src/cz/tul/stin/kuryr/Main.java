package cz.tul.stin.kuryr;

import cz.tul.stin.kuryr.delivery.Delivery;
import cz.tul.stin.kuryr.shipping.TruckDelivery;

public class Main {
    public static void main(String[] args) {
        Delivery d1 = new Delivery(
                "A123",
                10,
                new TruckDelivery()
        );

        System.out.println("Truck: " + d1.calculatePrice());
    }
}
