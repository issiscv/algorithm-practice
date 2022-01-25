package programmers.greedy;

public class Cloth {

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < reserve.length; i++) {
            arr[reserve[i]]++;
        }

        for (int i = 0; i < lost.length; i++) {
            arr[lost[i]]--;
        }
        
        //마지막은 따로 확인
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0) {
                if (arr[i-1] > 1) {
                    arr[i-1]--;
                    arr[i]++;
                } else if (arr[i+1] > 1) {
                    arr[i+1]--;
                    arr[i]++;
                }
            }
        }

        if (arr[n] == 0) {
            if (arr[n-1] > 1) {
                arr[n-1]--;
                arr[n]++;
            }
        }
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (arr[i] >= 1)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] lost = {3};
        int[] reserve = {1};
        int n = 3;

        System.out.println(solution(n, lost, reserve));

    }
}
