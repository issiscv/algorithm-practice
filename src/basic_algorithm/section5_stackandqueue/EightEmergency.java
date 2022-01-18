package basic_algorithm.section5_stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EightEmergency {

    static class Patient {
        int number;
        int rate;

        public Patient(int number, int rate) {
            this.number = number;
            this.rate = rate;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(m, arr));
    }

    private static int solution(int m, int[] arr) {
        Queue<Patient> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Patient(i, arr[i]));
        }

        int cnt = 1;
        while (!queue.isEmpty()) {
            Patient tmp = queue.poll();
            boolean flag = true;
            for (Patient p : queue) {
                if (tmp.rate < p.rate) {
                    queue.offer(tmp);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                if (tmp.number != m) {
                    cnt++;
                } else {
                    break;
                }
            }

        }
        return cnt;
    }
}
