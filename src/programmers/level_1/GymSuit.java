package programmers.level_1;

import java.util.Arrays;

public class GymSuit {

    public static int solution(int n, int[] lost, int[] reserve) {

        int[] arr = new int[n+1];

        Arrays.fill(arr, 1);

        arr[0] = 0;

        for (int i = 0; i < reserve.length; i++) {
            int r = reserve[i];
            arr[r]++;
        }

        for (int i = 0; i < lost.length; i++) {
            int l = lost[i];
            arr[l]--;
        }

        for (int i = 1; i < arr.length; i++) {
            int lt = i - 1;
            int rt = i + 1;
            if (arr[i] == 0) {

                if (lt >= 1 && arr[lt] > 1) {
                    arr[lt]--;
                    arr[i] = 1;
                } else if (rt < arr.length && arr[rt] > 1){
                    arr[rt]--;
                    arr[i] = 1;
                }
            }
        }

        int cnt = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 1) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        solution(n, lost, reserve);
    }
}
