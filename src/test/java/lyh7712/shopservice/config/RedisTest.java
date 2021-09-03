package lyh7712.shopservice.config;


import lyh7712.sorted.Shop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void redisStringTest() {
        String key = "chanasdasds";

        Shop shop = new Shop("찬스", 110);

        redisTemplate.opsForZSet().add(key, shop, 5);
    }
}
