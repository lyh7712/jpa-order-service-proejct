package lyh7712.shopservice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static void main(String[] args) {

        int[] arr = {1,4,3,2,5,2,1};

        Study study = new Study();
        System.out.println(study.test(arr));
    }

    public int[] test(int[] arr) {
        int[] result;
        List<Integer> list = new ArrayList<>();
        
        for(int i =0; i < arr.length; i++) {
            if (i == 0) {
                list.add(arr[i]);
            } else {
                if (arr[i] != arr[i - 1]) {
                    list.add(arr[i]);
                }
            }
        }
        result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
