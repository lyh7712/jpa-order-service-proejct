package lyh7712;



public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
        String hand = "right";

        test.solution(numbers, hand);
    }

    // 왼손 - 1, 4, 7
    // 오른손 - 3, 6, 9
    // 가까운 엄지손가락 - 2, 5, 8, 0
    // 거리가 같다면 hand인 손으로 터치
    // 누르면 answer에 hand 추가됨
    // 손 위치는 마지막에 누른 숫자로 변경

    int[][] pos = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };

    int[] left = {3,0}; // *
    int[] right = {3,2}; // #
    String hand;

    public String solution(int[] numbers, String hand) {
        String answer = "";
        this.hand = hand == "right" ? "R" : "L";

        for (int num : numbers) {
            String Umji = pushNumber(num);
            answer += Umji;

            if (Umji.equals("L")) {left = pos[num]; continue; }
            if (Umji.equals("R")) {right = pos[num]; continue; }
        }
        System.out.println(answer);
        return answer;
    }

    private String pushNumber(int num) {
        if (num == 1 || num == 4 || num == 7) return "L";
        if (num == 3 || num == 6 || num == 9) return "R";

        if (getDistance(num, left) < getDistance(num, right)) return "L";
        if (getDistance(num, left) > getDistance(num, right)) return "R";

        return this.hand;
    }

    //들어오는 숫자 배열에 대해 구하고자 하는 숫자 배열 왼쪽, 오른쪽을 각각 구한다.
    private int getDistance(int num, int[] dpos) {
        return Math.abs(dpos[0] - pos[num][0]) + Math.abs(dpos[1] - pos[num][1]);
    }
}
