package baekjoon.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1654 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt();

        //약 중복 원소에서 가장 끝 값(가장 오른쪽 값)을 찾고자 한다면 Upper Bound - 1 을 하면 될 것이고,
        //중복 원소 중 가장 왼쪽 끝 값(가장 왼쪽 값)을 찾고자 한다면 Lower Bound 을 통해 반환 된 값 그대로가 된다.
        //198cm 로 자를 때의 개수는 11개다. 그리고 199cm, 200cm 로 자를 때 또한 모두 11개다. 이렇게 자른 개수가 중복이 되지만,
        //최대 길이를 찾기 위해서는 Upper Bound를 써야한다는 것이다.
        while (lt < rt) {
            int mid = (lt + rt) / 2;

            int sum = 0;
            for (int i = 0; i < K; i++) {
                sum += arr[i] / mid;
            }

            if (sum < N) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        System.out.println(lt-1);
    }
}
