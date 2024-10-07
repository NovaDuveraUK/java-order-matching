package org.example.core;


public class Order {
    private final String instrument;
    private final double price;
    private final double quantity;
    private final Side side;

    public enum Side {
        BUY, SELL
    }

    public Order(String instrument, double price, double quantity, Side side) {
        this.instrument = instrument;
        this.price = price;
        this.quantity = quantity;
        this.side = side;
    }

    public String getInstrument() {
        return instrument;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public Side getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Order{" +
                "instrument='" + instrument + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", side=" + side +
                '}';
    }
}

