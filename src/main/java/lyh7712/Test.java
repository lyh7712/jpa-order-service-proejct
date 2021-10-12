package lyh7712;


import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        String s = "Zbcdefg";

        test.solution(s);
    }

    public String solution(String s) {
        Character [] arr = new Character [s.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        s = "";
        for(int i=0; i<arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
