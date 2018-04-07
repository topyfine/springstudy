package musictest;

import music.config.RedisConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RedisConfig.class})
@ActiveProfiles("stringTemplate")
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void testRedis() {
        Assert.assertNotNull(redisTemplate);
        redisTemplate.opsForValue().set("ping", "pong");
        Assert.assertEquals("pong", redisTemplate.opsForValue().get("ping"));
    }
}
