package com.onemorebruh.main.redisIntegration;

public interface MessagePublisher {
    void publish(final String message);
}