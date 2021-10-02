package lyh7712;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        int[][] arr1 = new int[][]{{1, 2}, {2, 3}};
        int[][] arr2 = new int[][]{{3, 4}, {5, 6}};

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr1[0].length);

        test.solution(arr1, arr2);
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        return answer;
    }

}
