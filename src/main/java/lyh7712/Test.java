package lyh7712;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        int[] arr1 =  {2, 4};
        int[] arr2 =  {3};

        test.solution(5, arr1, arr2);
    }

    public int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);
        int count = 0;
        int answer = 0;

        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    count++;
                    lost[i] = - 1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        answer = n - lost.length + count;
        return answer;
    }

}
