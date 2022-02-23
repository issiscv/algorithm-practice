package baekjoon.Bruteforcing;

public class BruteForce4673 {

    public static void main(String[] args) {
        int[] ch = new int[10001];

        for (int i = 1; i < 10001; i++) {
            int n = di(i);

            if (n < 10001) {
                ch[n] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (ch[i] == 0) {	// false 인 인덱스만 출력
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    private static int di(int i) {
        int sum = i;

        while (i != 0) {
            sum += i % 10;
            i = i / 10;
        }

        return sum;
    }


}
