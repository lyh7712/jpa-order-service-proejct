package lyh7712.shopservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudyTest {

    @Test
    @DisplayName("스터디를 생성한다.")
    void createStudy() {
        Study study = new Study();

        assertAll(
                () -> assertNotNull(study),
                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
                    () -> "스터디를 생성했을떄 상태는 " + StudyStatus.DRAFT + "여야 한다."),

                () -> assertThrows(IllegalArgumentException.class,
                () -> new Study(0))
        );

    }
}
