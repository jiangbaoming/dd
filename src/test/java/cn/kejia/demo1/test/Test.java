package cn.kejia.demo1.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @Author: 江宝明
 * @Description:
 * @Date:2019/05/24
 * @Modified By：
 */
public class Test {
  @Autowired
    private RedisTemplate redisTemplate;
    @org.junit.Test
    public void testRedis(){
        redisTemplate.getExpire("a");

    }
}
