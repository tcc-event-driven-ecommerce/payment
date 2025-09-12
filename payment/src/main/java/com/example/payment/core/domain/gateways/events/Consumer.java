package com.example.payment.core.domain.gateways.events;

public interface Consumer {
    void receiveMessage(String message);
}
