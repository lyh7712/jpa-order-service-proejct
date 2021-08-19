package lyh7712.shopservice.psytest;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestRepository repository;

    public TestService(TestRepository repository) {
        this.repository = repository;
    }

    public void registerTest(TestDto dto) {
        repository.save(dto.toEntity());
    }

    public void deleteTest(Long id) {
        Optional<Test> target = repository.findById(id);
        repository.delete(target.orElseThrow());
    }

    public List<Test> getAllTests() {
        return repository.findAll();
    }

}
