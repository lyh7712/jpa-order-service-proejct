package lyh7712.shopservice.psytest;


public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        String word = "수박";

        client.solution(3, word);

    }

    public String solution(int n, String word) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer = answer + word.charAt(0);
            } else {
                answer = answer + word.charAt(1);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
