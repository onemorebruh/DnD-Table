package com.onemorebruh.main;

import com.onemorebruh.main.redisIntegration.RedisConfig;
import com.onemorebruh.main.redisIntegration.RedisRepositoryImpl;
import com.onemorebruh.main.redisIntegration.RedisSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest(classes = {MainApplication.class, RedisConfig.class, RedisRepositoryImpl.class})
public class RedisIntegrationTest {

    @Autowired
    RedisRepositoryImpl repository;
    @Test
    void setAndGetFromRedisTest(){
        //Save in redis
        RedisSession session = new RedisSession("key", "value");
        repository.add(session);

        //get from redis
        RedisSession fromRedis = repository.findOne("key");
        Assert.isTrue((fromRedis.getValue().equals("value")), "value does not match with required value");
    }
}
