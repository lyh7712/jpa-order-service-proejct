package lyh7712.shopservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Cacheable(value = "value", key = "#id")
    @GetMapping("/test/{id}")
    public List<Study> cacheData(@PathVariable Long id) {
        Study study = new Study(10);
        Study study2 = new Study(12);
        Study study3 = new Study(13);
        Study study4 = new Study(14);
        Study study5 = new Study(15);

        List list = new ArrayList();

        list.add(study);
        list.add(study2);
        list.add(study3);
        list.add(study4);
        list.add(study5);

        return list;
    }
}
