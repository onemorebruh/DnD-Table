package com.onemorebruh.main.redisIntegration;

import java.util.Map;

public interface IRedisRepository {
        Map<Object, Object> findAllMovies();
        void add(RedisSession movie);
        void delete(String id);
        RedisSession findMovie(String id);
}
