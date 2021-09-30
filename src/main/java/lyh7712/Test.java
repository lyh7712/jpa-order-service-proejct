package lyh7712;


// 대문자 -> 소문자
// -, _, . 을 제외한 특수문자 제거
// 위의 특수문자가 연속 두개 이상이면 1개로 변경됨 (ex - .. -> .)
// 처음이나 끝 자리의 특수문자 제거
// 빈 문자열이면 a 대입
// 16자 이상이면 15자가 되도록 뒤의 문자열 제거
// 아이디가 2자 이하라면 마지막 문자를 아이디가 3자 될떄까지 반복


public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        String id = "...!@BaT#*..y.abcdefghijklm.";

        test.solution(id);

    }
    public String solution(String new_id) {
        String answer = "";

        // Step 1
        String step1 = new_id.toLowerCase();

        // Step 2
        String step2 = step1.replaceAll("[~!@#$%^&*()=+[{]}:?,<>/]", "");

        // Step 3
        String step3 = step2.replace("..", ".");
        while (step2.contains("..")) {
            step3 = step3.replace("..", ".");
            break;
        }

        // Step 4
        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length() - 1);
            }
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }

        // Step 5
        String step5 = step4;
        if (step5.equals("")) {
            step5 = "a";
        }

        // Step 6
        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);
        }

        String step7 = step6;
        if (step7.length() < 2) {
            while (step7.length() < 3) {
                step7 += "a";
            }
        }

        System.out.println(step7);
        answer = step7;
        return answer;
    }

}
