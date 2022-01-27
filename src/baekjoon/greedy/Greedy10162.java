package baekjoon.greedy;

import java.util.*;

public class Greedy10162 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {300, 60, 10};
        int t = scanner.nextInt();

        int count = 0;
        int[] arr = new int[3];

        for (int i = 0; i < list.length; i++) {
            int time = list[i];

            if (time <= t) {
                count = t / time;
                t = t % time;
                arr[i] += arr[i] + count;
            }
        }
        if (t != 0) {
            System.out.println(-1);
        } else {
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
