package com.onemorebruh.main;

import com.onemorebruh.main.RedisIntegration.config.RedisConfig;
import com.onemorebruh.main.RedisIntegration.repository.RedisRepositoryImpl;
import com.onemorebruh.main.RedisIntegration.model.RedisSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
        String fromRedis = repository.findOne("key");
        Assert.isTrue((fromRedis.equals("value")), "value does not match with required value");
        System.out.print("[X] data have been successfully transferred via redis");
    }

    @Test
    void deleteFromRedisTest(){
        repository.delete("key");
        try {
            String fromRedis = repository.findOne("key");

        } catch (Exception e) {
            System.out.print("[X] data have been successfully deleted");
        }
    }
}
