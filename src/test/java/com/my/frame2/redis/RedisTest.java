package com.my.frame2.redis;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.Assert;


import java.io.Serializable;

/**
 * @author 王波
 * @date 2020/5/8
 */

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    @Test
    public void find() {
        String value = (String) redisTemplate.opsForValue().get("WB");
        System.out.println(value);
    }

    @Test
    public void insert() {
        redisTemplate.opsForValue().set("WB","cowboy");
    }

    @Test
    public void doTest() {
        int num = new Integer(1);
        Assert.notNull(num, "xxx");
    }
}
