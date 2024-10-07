package org.example.core;


import org.example.interfaces.WebsocketClient;


public class OrderWebSocketClient implements WebsocketClient {

    private EventManager eventManager;

    public OrderWebSocketClient(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public void connect(String url) {

    }

    @Override
    public void disconnect() {

    }

    @Override
    public void sendMessage(String message) {

    }

    @Override
    public void onMessage(String message) {
        System.out.println("Received: " + message);
        // Simulate parsing JSON into an Order object (instrument, price, quantity, side)
        Order order = new Order("BTC-USD", 50000, 1.5, Order.Side.BUY); // mock order
        eventManager.notifyListeners(order);
    }


}

