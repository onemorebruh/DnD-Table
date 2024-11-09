package com.onemorebruh.main.redisIntegration;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@RedisHash
public class RedisSession implements Serializable {
    private final String key;
    private final String value;

    public RedisSession(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
