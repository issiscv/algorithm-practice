package baekjoon.bruteforcing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BruteForce7568 {
    
    private static class Body {
        int x;
        int y;

        public Body(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Body> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            list.add(new Body(x, y));
        }

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            Body base = list.get(i);
            int cnt = 1;
            for (int j = 0; j < N; j++) {
                Body tmp = list.get(j);
                if (tmp.x > base.x && tmp.y > base.y) cnt++;
            }

            arr[i] = cnt;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
