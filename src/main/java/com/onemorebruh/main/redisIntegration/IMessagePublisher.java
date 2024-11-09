package com.onemorebruh.main.redisIntegration;

public interface IMessagePublisher {
    void publish(final String message);
}