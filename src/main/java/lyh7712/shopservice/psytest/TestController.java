package lyh7712.shopservice.psytest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    /**
     * 심리 테스트 생성
     * @param dto 생성할 심리테스트 정보
     *
     * **/
    @PostMapping("/tests")
    public ResponseEntity registerTest(@RequestBody TestDto dto) {
        service.registerTest(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    /**
     * 심리 테스트 삭제
     * @param id 삭제할 심리테스트 id
     *
     * **/
    @DeleteMapping("/tests/{id}")
    public ResponseEntity deleteTest(@PathVariable Long id) {
        service.deleteTest(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(id);
    }

    /**
     * 모든 심리테스트 호출
     * @return 저장된 심리테스트 list
     *
     * **/
    @GetMapping("/tests")
    public ResponseEntity getAllTests() {
        List<Test> list = service.getAllTests();
        return new ResponseEntity(list.get(1), HttpStatus.OK);
    }
}
