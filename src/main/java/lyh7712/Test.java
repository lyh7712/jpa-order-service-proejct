package lyh7712;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        String[] tests = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"leo", "kiki"};

        test.solution(tests, completion);

    }
    public String solution(String[] participant, String[] completion) {
        int i;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[i];
    }

}

