package com.onemorebruh.main.redisIntegration;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class RedisRepositoryImpl implements IRedisRepository {
    private static final String KEY = "Session";
    private final RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public RedisRepositoryImpl(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }


    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }


    public void add(final RedisSession rsession) {
        hashOperations.put(KEY, rsession.getKey(), rsession.getValue());
    }

    public void delete(final String id) {
        hashOperations.delete(KEY, id);
    }

    public RedisSession findOne(final String id){
        return (RedisSession) hashOperations.get(KEY, id);
    }

    public Map findAll(){
        return hashOperations.entries(KEY);
    }
}