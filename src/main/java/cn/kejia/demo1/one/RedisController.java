package cn.kejia.demo1.one;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 江宝明
 * @Description:
 * @Date:2019/05/24
 * @Modified By：
 */
@RestController
public class RedisController {
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @RequestMapping("/test")
    public String doSomething(){
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        Map<String,Object> user=new HashMap<>();
        user.put("name", "jack");
        user.put("age", 20);
        user.put("gender", "man");
        opsForValue.set("one", JSON.toJSONString(user));
        String one = opsForValue.get("one");
        return one;
    }

}
