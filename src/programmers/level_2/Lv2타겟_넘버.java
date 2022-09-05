package programmers.level_2;


public class Lv2타겟_넘버 {

    private static int[] arr;
    private static int t;
    private static int answer = 0;

    public static int solution(int[] numbers, int target) {
        arr = numbers;
        t = target;

        DFS(0, 0);

        System.out.println(answer);
        return answer;
    }

    private static void DFS(int v, int sum) {

        if (v == arr.length) {
            if (sum == t) answer++;
        } else {
            DFS(v+1, sum + arr[v]);
            DFS(v+1, sum - arr[v]);
        }

    }

    public static void main(String[] args) {

        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        solution(numbers, target);
    }

}
