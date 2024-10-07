package org.example.core;

import org.example.interfaces.IOrderMatcher;

/**
 * This class is responsible for matching buy and sell orders for a given instrument.
 */
public class OrderMatcher implements IOrderMatcher {
    @Override
    public void addOrder(Order order) {

    }

    @Override
    public boolean isMatch(Order o1, Order o2) {
        return false;
    }
}
