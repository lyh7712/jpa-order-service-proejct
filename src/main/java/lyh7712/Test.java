package lyh7712;


import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        String s = "Zbcdefg";

        test.solution(5, 24);
    }

    public String solution(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }

        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }
}
