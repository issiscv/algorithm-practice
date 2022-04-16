package baekjoon.bruteforcing;

import java.util.*;

public class BruteForce1963 {

    private static boolean[] check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        findPrime();

        int T = scanner.nextInt();

        while (T-- > 0) {

            int s = scanner.nextInt();
            int e = scanner.nextInt();

            if (s == e) {
                System.out.println("0");
                continue;
            } else {
                int bfs = BFS(s, e);
                System.out.println(bfs);
            }
        }
    }

    private static void findPrime() {
        check = new boolean[10000];
        check[0] = true;
        check[1] = true;
        // 소수인지 판별
        for (int i = 2; i <10000 ; i++) {
            for (int j = i*2; j < 10000; j+=i) {
                check[j] = true;
            }
        }
    }

    private static int BFS(int s, int e) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] discovered = new boolean[10000];
        discovered[s] = true;
        queue.offer(s);


        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int tmp = queue.poll();
                if (tmp == e) return count;
                int[] arr = valueToArr(tmp);


                //숫자 하나만 바꿔서 될 수 있는 모든 수를 queue 에 넣는다.
                for (int j = 3; j >= 0; j--) {
                    for (int k = 0; k < 10; k++) {
                        if (arr[j] + 1 > 9) {
                            arr[j] = 0;
                        } else {
                            arr[j] = arr[j] + 1;
                        }

                        int nextValue = getNextValue(arr);

                        if (!discovered[nextValue] && !check[nextValue] && nextValue >= 1000 && nextValue <= 9999) {
                            queue.offer(nextValue);
                            discovered[nextValue] = true;
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }

    private static int getNextValue(int[] arr) {
        String str1 = "";
        for (int a : arr) {
            str1 += a;
        }
        String str = str1;

        int nextValue = Integer.parseInt(str);
        return nextValue;
    }

    private static int[] valueToArr(int tmp) {
        int[] arr = new int[4];
        char[] cArr = String.valueOf(tmp).toCharArray();
        for (int j = 0; j < 4; j++) {
            arr[j] = cArr[j] - '0';
        }
        return arr;
    }
}
