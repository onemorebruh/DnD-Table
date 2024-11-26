package com.onemorebruh.main.RedisIntegration.repository;

import com.onemorebruh.main.RedisIntegration.model.RedisSession;

public interface IRedisRepository {
        void add(RedisSession movie);
        void delete(String id);
        String findOne(String id);
}
