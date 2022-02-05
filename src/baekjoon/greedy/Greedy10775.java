package baekjoon.greedy;

import java.util.Scanner;

public class Greedy10775 {

    static int[] fArr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int G = scanner.nextInt();//4
        int P = scanner.nextInt();//6

        fArr = new int[G+1];//4+1
        for (int i = 0; i <= G; i++) {
            fArr[i] = i;
        }

        int ans = 0;
        for (int i = 0; i < P; i++) {
            int g = scanner.nextInt();//4 1 1
            int emptyGate = find(g);//4

            if (emptyGate == 0) {
                break;
            }

            ans++;
            union(emptyGate, emptyGate - 1);
        }

        System.out.println(ans);
    }

    public static void union(int x, int y) {
        int fa = find(x);//2
        int fb = find(y);//1

        if (fa != fb) {
            fArr[fa] = fb;
        }

    }

    public static int find(int a) {
        if (fArr[a] == a) {
            return a;
        } else {
            return fArr[a] = find(fArr[a]);
        }
    }
}
