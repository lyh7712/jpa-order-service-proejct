package lyh7712.shopservice;

public class Study {

    private StudyStatus studyStatus = StudyStatus.DRAFT;
    private int limit;

    public Study() {
    }

    public Study(int limit) {
        if (limit == 0) {
            throw new IllegalArgumentException("스터디 인원은 0보다 커야한다.");
        }
    }

    public StudyStatus getStatus() {
        return studyStatus;
    }
}
