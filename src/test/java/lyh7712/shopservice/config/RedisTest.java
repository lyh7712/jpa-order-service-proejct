package lyh7712.shopservice.config;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lyh7712.sorted.Shop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


//@SpringBootTest
public class RedisTest {

    String key = "chans";

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void redisStringTest() {

        Shop shop1 = new Shop("찬스 1호점", 234);
        Shop shop2 = new Shop("찬스 2호점", 342);
        Shop shop3 = new Shop("찬스 3호점", 123);
        Shop shop4 = new Shop("찬스 4호점", 521);
        Shop shop5 = new Shop("찬스 5호점", 15);
        Shop shop6 = new Shop("찬스 6호점", 10);
        Shop shop7 = new Shop("찬스 7호점", 204);
        Shop shop8 = new Shop("찬스 8호점", 320);
        Shop shop9 = new Shop("찬스 9호점", 32);
        Shop shop10 = new Shop("찬스 10호점", 12);

        String shopName = "찬스 1호점";
        String shopName2 = "찬스 2호점";
        String shopName3 = "찬스 3호점";
        String shopName4 = "찬스 4호점";
        String shopName5 = "찬스 5호점";
        String shopName6 = "찬스 6호점";
        String shopName7 = "찬스 7호점";
        String shopName8 = "찬스 8호점";
        String shopName9 = "찬스 9호점";
        String shopName10 = "찬스 10호점";
        String shopName11 = "찬스 11호점";
        String shopName12 = "찬스 12호점";

        redisTemplate.opsForZSet().add(key, shop1.getName(), shop1.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop2.getName(), shop2.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop3.getName(), shop3.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop4.getName(), shop4.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop5.getName(), shop5.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop6.getName(), shop6.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop7.getName(), shop7.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop8.getName(), shop8.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop9.getName(), shop9.getOrdersCount());
        redisTemplate.opsForZSet().add(key, shop10.getName(), shop10.getOrdersCount());

        //key = shops, value = shop 이름 , score = 총 주문 수 or 총 매출

    }

    @Test
    void ge() {

        Set<String> list = redisTemplate.opsForZSet().reverseRange(key, 0, 11);
        List list1 = new ArrayList(list);

        for(int i = 0; i < list1.size(); i++) {
            System.out.println("매출 "+ (i + 1) + "등 = " +  list1.get(i));
        }
    }

    @Test
    void tes() {

        Shop shop = new Shop("테스트", 2000);
        Shop shop2 = new Shop("테스트", 5000);
        Shop shop3 = new Shop("테스트", 2000);
        Shop shop4 = new Shop("테스트", 2000);
        Shop shop5 = new Shop("테스트", 2000);
        shop3.setCreateTime(LocalDateTime.of(2021, 9, 7, 12, 20, 30));


        List<Shop> testList = new ArrayList<>();
        testList.add(shop);
        testList.add(shop2);
        testList.add(shop3);
        testList.add(shop4);
        testList.add(shop5);

        System.out.println(testList.get(2).getCreateTime().getHour());
        LocalDateTime updateTime = LocalDateTime.of(2021, 9, 7, 23, 59, 30);

        System.out.println(testList.get(0).getCreateTime().getHour() == updateTime.getHour());

        List<Shop> result = testList
                .stream()
                .filter(s -> s.getCreateTime().getHour() == updateTime.getHour())
                .collect(Collectors.toList());

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
