package lyh7712;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        test.solution(8888);


    }
    public int solution(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        System.out.println(sum);
        return sum;
    }

}
