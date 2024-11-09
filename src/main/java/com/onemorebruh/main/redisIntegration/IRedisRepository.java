package com.onemorebruh.main.redisIntegration;

import java.util.Map;

public interface IRedisRepository {
        Map<Object, Object> findAll();
        void add(RedisSession movie);
        void delete(String id);
        RedisSession findOne(String id);
}
