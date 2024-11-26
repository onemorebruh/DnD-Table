package com.onemorebruh.main.RedisIntegration.repository;

import com.onemorebruh.main.RedisIntegration.model.RedisSession;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisRepositoryImpl implements IRedisRepository {
    @Value("spring.redis.secret") //TODO use actual value from properties
    private static final String SECRET = "Session";

    private final RedisTemplate<String, Object> redisTemplate;
    private HashOperations<String, String, Object> hashOperations;

    @Autowired
    public RedisRepositoryImpl(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }


    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }


    public void add(final RedisSession rSession) {
        hashOperations.put(SECRET, rSession.getKey(), rSession.getValue());
    }

    public void delete(final String id) {
        hashOperations.delete(SECRET, id);
    }

    public String findOne(final String id){
        return (String) hashOperations.get(SECRET, id);
    }

}