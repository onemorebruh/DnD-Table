package com.onemorebruh.main.RedisIntegration.queue;

public interface IMessagePublisher {
    void publish(final String message);
}